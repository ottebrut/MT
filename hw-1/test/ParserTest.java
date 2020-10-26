import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;

public class ParserTest {
    private final Parser parser = new Parser();
    private final List<String> nonTerminals = List.of("E", "E'", "T", "T'", "F", "F'");

    private String getExpression(Tree tree) {
        if (nonTerminals.contains(tree.node)) {
            if (tree.children != null) {
                StringBuilder stringBuilder = new StringBuilder();
                for (Tree children : tree.children) {
                    stringBuilder.append(getExpression(children));
                }
                return stringBuilder.toString();
            } else {
                return "";
            }
        } else {
            return tree.node;
        }
    }

    @Test
    void testSimpleExpressions() throws ParseException {
        final List<String> expressions = List.of("(1+2)*sin(-3*(7-4)+2)",
                                                 "cos(1+2)*sin(-3*(7-4)+2)",
                                                 "---2-----3+3+-----1",
                                                 "funA(funB(funC(0)))*funD(funE(1)+funF(2))",
                                                 "1*2*3*---2+sin(1*cos(0))");

        for (String expression: expressions) {
            final InputStream is = new ByteArrayInputStream(expression.getBytes());
            Tree tree = parser.parse(is);
            assertEquals(expression, getExpression(tree));
        }
    }

    @Test
    void testSpaces() throws ParseException {
        final List<String> expressions = List.of("( 1 + 2 ) * sin ( - 3 * ( 7 - 4 ) + 2 )",
                                                 "cos(1+2)  *   sin(-3*(7-4)+2)",
                                                 "- - - 2--    -   --3\n\r\n+3+-----1");

        for (String expression: expressions) {
            final InputStream is = new ByteArrayInputStream(expression.getBytes());
            Tree tree = parser.parse(is);
            assertEquals(expression.replaceAll("\\s",""), getExpression(tree));
        }
    }

    @Test
    void testParserExceptions() {
        final List<String> expressions = List.of("(1+2*sin(-3*(7-4)+2)",
                                                 "(1+2)*sin(-3*(7-4)+2",
                                                 "((((0))");

        for (String expression : expressions) {
            final InputStream is = new ByteArrayInputStream(expression.getBytes());
            assertThrows(ParseException.class, () -> parser.parse(is));
        }
    }

    @Test
    void testAssertionExceptions() {
        final List<String> expressions = List.of("(1+2)*sin(()-3*(7-4)+2)",
                                                 "sin()",
                                                 "+1",
                                                 "1+*2",
                                                 "1++2",
                                                 "1**2",
                                                 "1-+-2",
                                                 "1+-+2");

        for (String expression : expressions) {
            final InputStream is = new ByteArrayInputStream(expression.getBytes());
            assertThrows(AssertionError.class, () -> parser.parse(is));
        }
    }
}
