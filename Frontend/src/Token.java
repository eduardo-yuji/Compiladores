
public class Token {

	public String lexema;
	public TipoToken nome;
	public int linha;
	
	public Token(String lexema, TipoToken nome, int linha) {
		this.lexema = lexema;
		this.nome = nome;
		this.linha = linha;
	}
	
	@Override
	public String toString() {
		return "<"+nome+","+lexema+","+linha+">";
	}
	
}
