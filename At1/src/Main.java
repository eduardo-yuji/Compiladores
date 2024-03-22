import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main{
	
	private static final int RESERVADO = '\n';
	public static List<Object> streamTokenizerWithDefaultConfiguration(Reader reader) throws IOException {
	    StreamTokenizer streamTokenizer = new StreamTokenizer(reader);
	    List<Object> tokens = new ArrayList<Object>();

	    int currentToken = streamTokenizer.nextToken();
	    while (currentToken != StreamTokenizer.TT_EOF) {

	        if (streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
	            tokens.add(streamTokenizer.nval);
	        } else if (streamTokenizer.ttype == StreamTokenizer.TT_WORD
	            || streamTokenizer.ttype == RESERVADO) {
	            tokens.add(streamTokenizer.sval);
	        } else {
	            tokens.add((char) currentToken);
	        }

	        currentToken = streamTokenizer.nextToken();
	    }

	    return tokens;
	}
	
}