import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import gen.*;

public class AntlrParser {
    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("./src/Example.txt");
        JavaGrammarLexer javaLexer = new JavaGrammarLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(javaLexer);
        JavaGrammarParser javaParser = new JavaGrammarParser(commonTokenStream);

        ParseTree parseTree = javaParser.file();
        ParseTreeWalker walker = new ParseTreeWalker();
        JavaListener javaListener = new JavaListener();

        walker.walk(javaListener, parseTree);
        String code = javaListener.getFormattedCode();

        FileWriter writer = new FileWriter(new File("./src/Example.java"));
        writer.write(code);
        writer.close();
//        System.out.println(code);
    }
}
