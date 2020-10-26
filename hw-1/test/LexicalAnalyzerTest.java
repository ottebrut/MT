import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;

public class LexicalAnalyzerTest {
    @Test
    void testException() throws ParseException {
        final List<String> expressions = List.of("~(1+2)*sin(-3*(7-4)+2)",
                                                 "(1+2)/sin(-3*(7-4)+2)",
                                                 "(1+2)*wrong_fun(-3*(7-4)+2)",
                                                 "(1+2)*sin-3*(7-4)+2");
        final List<Integer> rightExpressionsTokens = List.of(0, 5, 6, 6);

        for (int i = 0; i < expressions.size(); i++) {
            String expression = expressions.get(i);
            Integer rightTokens = rightExpressionsTokens.get(i);

            final InputStream is = new ByteArrayInputStream(expression.getBytes());
            LexicalAnalyzer lex = new LexicalAnalyzer(is);
            for (int token = 0; token < rightTokens; token++) {
                lex.nextToken();
            }
            assertThrows(ParseException.class, lex::nextToken);
        }
    }
}
