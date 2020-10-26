import java.io.InputStream;
import java.text.ParseException;

public class Parser {
    LexicalAnalyzer lex;

    Tree E() throws ParseException {
        return new Tree("E", T(), EPrime());
    }

    Tree EPrime() throws ParseException {
        switch (lex.getCurToken()) {
            case "+":
                lex.nextToken();
                return new Tree("E'", new Tree("+"), T(), EPrime());
            case "-":
                lex.nextToken();
                return new Tree("E'", new Tree("-"), T(), EPrime());
            case ")":
            case "$":
                return new Tree("E'");
            default:
                throw new AssertionError();
        }
    }

    Tree T() throws ParseException {
        return new Tree("T", FPrime(), TPrime());
    }

    Tree TPrime() throws ParseException {
        switch (lex.getCurToken()) {
            case "*":
                lex.nextToken();
                return new Tree("T'", new Tree("*"), FPrime(), TPrime());
            case "+":
            case "-":
            case ")":
            case "$":
                return new Tree("T'");
            default:
                throw new AssertionError();
        }
    }

    Tree F() throws ParseException {
        String token = lex.getCurToken();
        if ('0' <= token.charAt(0) && token.charAt(0) <= '9') {
            lex.nextToken();
            return new Tree("F", new Tree(token));
        } else if ('a' <= token.charAt(0) && token.charAt(0) <= 'z'
                || 'A' <= token.charAt(0) && token.charAt(0) <= 'Z' || token.equals("(")) {
            lex.nextToken();
            Tree sub = E();
            if (!lex.getCurToken().equals(")")) {
                throw new ParseException(") expected at position ", lex.getCurPos());
            }
            lex.nextToken();
            return new Tree("F", new Tree(token), sub, new Tree(")"));
        } else if (token.equals("$")) {
            return new Tree("F");
        } else {
            throw new AssertionError();
        }
    }

    Tree FPrime() throws ParseException {
        String token = lex.getCurToken();
        if (token.equals("-")) {
            lex.nextToken();
            return new Tree("F'", new Tree("-"), FPrime());
        } else {
            return new Tree("F'", F());
        }
    }

    Tree parse(InputStream is) throws ParseException {
        lex = new LexicalAnalyzer(is);
        lex.nextToken();
        return E();
    }
}