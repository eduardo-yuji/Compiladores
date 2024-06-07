import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class AnalisadorLexico {
	private String input;
	private int pos;
	private int linhaNumero;

	public AnalisadorLexico(String input) {
		this.input = input;
		this.pos = 0;
		this.linhaNumero = 1;
	}

	public List<Token> tokenize() {
		List<Token> tokens = new ArrayList<>();
		// Lista de tokens
		while (pos < input.length()) {
			// Enquanto a posição for menor que o tamanho do input
			char leitor = input.charAt(pos);
			// o leitor recebe o caracterece do input na posicao do pos
			// Cada case retorna o tipo do token, o caractere e a linha
			switch (leitor) {
			case '\n':
				pos++;
				linhaNumero++;
				break;
			case '[':
				tokens.add(new Token(TipoToken.IniDelim, "[", linhaNumero));
				pos++;
				break;
			case ']':
				tokens.add(new Token(TipoToken.FimDelim, "]", linhaNumero));
				pos++;
				break;
			case '(':
				tokens.add(new Token(TipoToken.AbrePar, "(", linhaNumero));
				pos++;
				break;
			case ')':
				tokens.add(new Token(TipoToken.FechaPar, ")", linhaNumero));
				pos++;
				break;
			case '<':
				// Se a proxima posicao for menor q o tamanho do input e
				// o proximo caractere do < também for <, adiciona + 2 na posicao e retorna <<
				if (pos + 1 < input.length() && input.charAt(pos + 1) == '<') {
					tokens.add(new Token(TipoToken.Atrib, "<<", linhaNumero));
					pos += 2;
				} else if (pos + 1 < input.length() && input.charAt(pos + 1) == '>') {
					// Se o proximo caractere for >, adiciona +2 na posicao e retorna <>
					tokens.add(new Token(TipoToken.OpRelDif, "<>", linhaNumero));
					pos += 2;
				} else if (pos + 1 < input.length() && input.charAt(pos + 1) == '=') {
					// Se o proximo caractere for >, adiciona +2 na posicao e retorna <=
					tokens.add(new Token(TipoToken.OpRelMenorIgual, "<=", linhaNumero));
					pos += 2;
				} else {
					// Se nao, retorna apenas o <
					tokens.add(new Token(TipoToken.OpRelMenor, "<", linhaNumero));
					pos++;
				}
				break;
			case '>':
				// Se a proxima posicao for menor q o tamanho do input e
				// o proximo caractere do > for =, adiciona + 2 na posicao e retorna >=
				if (pos + 1 < input.length() && input.charAt(pos + 1) == '=') {
					tokens.add(new Token(TipoToken.OpRelMaiorIgual, ">=", linhaNumero));
					pos += 2;
				} else {
					// Se nao, retorna >
					tokens.add(new Token(TipoToken.OpRelMaior, ">", linhaNumero));
					pos++;
				}
				break;
			case '=':
				// Se a proxima posicao for menor q o tamanho do input e o proximo
				// caractere for =, adiciona +2 na posicao e retorna ==
				if (pos + 1 < input.length() && input.charAt(pos + 1) == '=') {
					tokens.add(new Token(TipoToken.OpRelIgual, "==", linhaNumero));
					pos += 2;
				} else {
					// se nao retorna ==
					tokens.add(new Token(null, "=", linhaNumero));
					pos++;
				}
				break;
			case '+':
				tokens.add(new Token(TipoToken.OpAritSoma, "+", linhaNumero));
				pos++;
				break;
			case '-':
				tokens.add(new Token(TipoToken.OpAritSub, "-", linhaNumero));
				pos++;
				break;
			case '*':
				tokens.add(new Token(TipoToken.OpAritMult, "*", linhaNumero));
				pos++;
				break;
			case '/':
				tokens.add(new Token(TipoToken.OpAritDiv, "/", linhaNumero));
				pos++;
				break;
			case '"':
			    StringBuilder aux = new StringBuilder();
			    pos++;
			    // Verifica se a posição não ultrapassou o final da entrada e se o caractere atual é uma aspa dupla
			    while (pos < input.length() && input.charAt(pos) != '"') {
			        aux.append(input.charAt(pos));
			        pos++;
			    }
			    // Verifica se saiu do loop porque encontrou a aspa dupla de fechamento
			    if (pos < input.length()) {
			        tokens.add(new Token(TipoToken.Cadeia, aux.toString(), linhaNumero));
			        pos++; // Avança para além da aspa dupla de fechamento
			    } else {
			        // Caso não encontre a aspa dupla de fechamento, imprime uma mensagem de erro
			        System.out.println("Erro léxico: Aspas dupla de fechamento não encontrada.");
			        // Ou, se preferir, pode lançar uma exceção e tratar em um bloco try-catch
			        // throw new RuntimeException("Erro léxico: Aspa dupla de fechamento não encontrada.");
			    }
			    break;
			case '#':
				// Caso a # nao esteja no inicio da linha
				// Vai pular tudo que tiver na frente do # até o final da linha
				while (leitor != '\n') {
					pos++;
					leitor = input.charAt(pos);
				}
				linhaNumero++;
				pos++;
				break;
			default:
				if (Character.isWhitespace(leitor)) {
					// Se o caractere for um espaço em branco
					pos++;
				} else if (Character.isLetter(leitor)) {
					// Se o caractere for uma letra entra no else if
					if (Character.isUpperCase(leitor)) {
						// Se a letra for maiúscula é variavel, cria um lexema que recebe a palavra lida
						String lexema = readWord();
						tokens.add(new Token(TipoToken.Var, lexema, linhaNumero));
					} else {
						String lexema = readWord();
						// Se nao for maiscula, ele vai buscar o tipo no método e se nao tiver lá
						// retorna null
						// Se retornar null -> erro léxico
						TipoToken tipo = getPalavraReservada(lexema);
						tokens.add(new Token(tipo, lexema, linhaNumero));
					}
				} else if (Character.isDigit(leitor)) {
					// Se o caractere for um digito
					String lexema = lerNumero();
					// Se tiver . significa q é um numero real, se nao é um numero inteiro
					tokens.add(new Token(lexema.contains(".") ? TipoToken.NumReal : TipoToken.NumInt, lexema,
							linhaNumero));
				} else {
					// Se nao cair em nenhum caso, retorna NULL -> erro lexico
					String aux2 = "";
					aux2 += leitor;
					tokens.add(new Token(null, aux2, linhaNumero));
					pos++;
				}
				break;
			}
		}
		// Final do arquivo
		tokens.add(new Token(TipoToken.EOF, "", linhaNumero));
		return tokens;
	}

	// Monta a palavra ou o número e retorna ele para o tokenize, com a
	// palavra/número inteiro
	// ele pode buscar a palavra igual nas palavras chaves
	private String readWord() {
		StringBuilder builder = new StringBuilder();
		while (pos < input.length()
				&& (Character.isLetter(input.charAt(pos)) || Character.isDigit(input.charAt(pos)))) {
			builder.append(input.charAt(pos));
			pos++;
		}
		return builder.toString();
	}

	// A mesma coisa do readWord, porém para números
	private String lerNumero() {
		StringBuilder builder = new StringBuilder();
		while (pos < input.length() && (Character.isDigit(input.charAt(pos)) || input.charAt(pos) == '.')) {
			builder.append(input.charAt(pos));
			pos++;
		}
		return builder.toString();
	}

	// Salva as palavras chaves como keywords
	// Se a palavra do arquivo for igual a keyword, ela retorna a palavra
	private TipoToken getPalavraReservada(String lexema) {
		HashMap<String, TipoToken> keywords = new HashMap<>();
		keywords.put("dec", TipoToken.PCDec);
		keywords.put("prog", TipoToken.PCProg);
		keywords.put("integer", TipoToken.PCInt);
		keywords.put("float", TipoToken.PCReal);
		keywords.put("read", TipoToken.PCLer);
		keywords.put("print", TipoToken.PCImprimir);
		keywords.put("if", TipoToken.PCSe);
		keywords.put("else", TipoToken.PCSenao);
		keywords.put("then", TipoToken.PCEntao);
		keywords.put("while", TipoToken.PCEnqto);
		keywords.put("start", TipoToken.PCIni);
		keywords.put("end", TipoToken.PCFim);
		keywords.put("and", TipoToken.OpBoolE);
		keywords.put("or", TipoToken.OpBoolOu);

		return keywords.get(lexema);
	}
}