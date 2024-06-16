import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Main {
    public static void main(String[] args) throws IOException {

        CharStream fromFileName = CharStreams.fromFileName("programa6.gyh");
        GyhRepaginadoLanguageLexer lexer = new GyhRepaginadoLanguageLexer(fromFileName);
        CommonTokenStream token = new CommonTokenStream(lexer);
        GyhRepaginadoLanguageParser parser = new GyhRepaginadoLanguageParser(token);

        parser.programa();

        Token t;
        while ((t = lexer.nextToken()).getType() != Token.EOF) {
            System.out.println("<" + lexer.VOCABULARY.getSymbolicName(t.getType()) + "," + t.getText() + ">");
        }
    }
}
