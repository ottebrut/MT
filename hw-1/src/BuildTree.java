import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;

public class BuildTree {
    private static final Parser parser = new Parser();
    private static int terminal = 0, nonTerminal = 0, empty = 0;
    private static final List<String> nonTerminals = List.of("E", "E'", "T", "T'", "F", "F'");

    private static void writeTreeNodes(Tree tree, FileWriter writer) throws IOException {
        if (nonTerminals.contains(tree.node)) {
            writer.write("NON_TERM" + nonTerminal + " [label=\"" + tree.node + "\"];\n");
            nonTerminal++;
            if (tree.children != null) {
                for (Tree children : tree.children) {
                    writeTreeNodes(children, writer);
                }
            } else {
                writer.write("EMPTY" + empty + " [label=\"\"];\n");
                empty++;
            }
        } else {
            writer.write("TERM" + terminal + " [label=\"" + tree.node + "\"];\n");
            terminal++;
        }
    }

    private static void writeTreeEdges(Tree tree, FileWriter writer) throws IOException {
        // only nonTerminals
        if (tree.children != null) {
            int thisNonTerminal = nonTerminal;
            nonTerminal++;
            for (Tree children : tree.children) {
                writer.write("NON_TERM" + thisNonTerminal + " -> ");
                if (nonTerminals.contains(children.node)) {
                    writer.write("NON_TERM" + nonTerminal + "\n");
                    writeTreeEdges(children, writer);
                } else {
                    writer.write("TERM" + terminal + "\n");
                    terminal++;
                }
            }
        } else {
            writer.write("NON_TERM" + nonTerminal + " -> EMPTY" + empty + "\n");
            nonTerminal++;
            empty++;
        }
    }

    public static void main(String[] args) throws ParseException, IOException {
        final String expression = "(1+2)*sin(-3*(7-4)+2)";
        final InputStream is = new ByteArrayInputStream(expression.getBytes());
        Tree tree = parser.parse(is);

        FileWriter writer = new FileWriter("./graph.txt");
        writer.write("digraph G {\n");
        writeTreeNodes(tree, writer);
        writer.write("\n");
        terminal = nonTerminal = empty = 0;
        writeTreeEdges(tree, writer);
        writer.write("}");
        writer.close();
    }
}
