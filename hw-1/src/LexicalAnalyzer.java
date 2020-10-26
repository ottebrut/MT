import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

public class LexicalAnalyzer {
    private final InputStream is;
    private int curChar, curPos;
    private String curToken;

    public LexicalAnalyzer(InputStream is) throws ParseException {
        this.is = is;
        curPos = 0;
        nextChar();
    }

    private boolean isBlank(int c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    private boolean isNumber(int c) {
        return '0' <= c && c <= '9';
    }

    private boolean isCharacter(int c) {
        return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = is.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    public void nextToken() throws ParseException {
        while (isBlank(curChar)) {
            nextChar();
        }
        StringBuilder stringBuilder;
        if (isNumber(curChar)) {
            stringBuilder = new StringBuilder(getCurChar());
            nextChar();
            while (isNumber(curChar)) {
                stringBuilder.append(getCurChar());
                nextChar();
            }
            curToken = stringBuilder.toString();
        } else if (isCharacter(curChar)) {
            stringBuilder = new StringBuilder(getCurChar());
            nextChar();
            while (isCharacter(curChar)) {
                stringBuilder.append(getCurChar());
                nextChar();
            }
            while (isBlank(curChar)) {
                nextChar();
            }
            if (curChar != '(') {
               throw new ParseException("Illegal character " + getCurChar(), curPos);
            }
            stringBuilder.append(getCurChar());
            nextChar();
            curToken = stringBuilder.toString();
        } else if (curChar == '+' || curChar == '-' || curChar == '*'
                || curChar == '(' || curChar == ')') {
            curToken = getCurChar();
            nextChar();
        } else if (curChar == -1) {
            curToken = "$";
        } else {
            throw new ParseException("Illegal character" + getCurChar(), curPos);
        }
    }

    private String getCurChar() {
        return String.valueOf((char)curChar);
    }

    public String getCurToken() {
        return curToken;
    }
    public int getCurPos() {
        return curPos;
    }
}