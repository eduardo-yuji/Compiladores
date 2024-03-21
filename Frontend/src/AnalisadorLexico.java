
public class AnalisadorLexico {

	LeitorArq ldat;

	public AnalisadorLexico(String nome) {
		ldat = new LeitorArq(nome);
	}

	public Token proximoToken() {

		int ch = -1;
		String caracter = "";
		while((ch=ldat.lerProxCaracter())!=-1) {
			caracter+=(char) ch;	

			switch(caracter) {
			case "[":
				return(new Token(caracter, TipoToken.IniDelim, 0));
			case "]":
				return(new Token(caracter, TipoToken.FimDelim, 0));
			case "(":
				return(new Token(caracter, TipoToken.AbrePar, 0));
			case ")":
				return(new Token(caracter, TipoToken.FechaPar, 0));
			default:
				;
			}
		}	
		return null;
	}
}
