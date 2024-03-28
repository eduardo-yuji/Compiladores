import java.util.ArrayList;
import java.util.List;

private String input;private int pos;private int linhaNumero;

public AnalisadorLexico(String input){this.input=input;this.pos=0;this.linhaNumero=1;}

public class Anl {
    public List<Token> tokenize() {
		List<Token> tokens = new ArrayList<>();
		while (pos < input.length()) {
			char leitor = input.charAt(pos);
			switch (leitor) {
                case (leitor == '\n'):
                    pos++;
                    numero++;
                    break;
                case leitor == ']':
                default:
                    break;
            }
	}
}
