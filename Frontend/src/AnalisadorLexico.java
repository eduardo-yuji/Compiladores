
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
			case "dec":
				return(new Token(caracter, TipoToken.PCDec, 0));
			case "prog":
				return(new Token(caracter, TipoToken.PCProg, 0));
			case "integer":
				return(new Token(caracter, TipoToken.PCInt, 0));
			case "float":
				return(new Token(caracter, TipoToken.PCReal, 0));
			case "read":
				return(new Token(caracter, TipoToken.PCLer, 0));
			case "print":
				return(new Token(caracter, TipoToken.PCImprimir, 0));
			case "if":
				return(new Token(caracter, TipoToken.PCSe, 0));
			case "else":
				return(new Token(caracter, TipoToken.PCSenao, 0));
			case "then":
				return(new Token(caracter, TipoToken.PCEntao, 0));
			case "while":
				return(new Token(caracter, TipoToken.PCEnqto, 0));
			case "start":
				return(new Token(caracter, TipoToken.PCIni, 0));
			case "end":
				return(new Token(caracter, TipoToken.PCFim, 0));
			case "*":
				return(new Token(caracter, TipoToken.OpAritMult, 0));
			case "/":
				return(new Token(caracter, TipoToken.OpAritDiv, 0));
			case "+":
				return(new Token(caracter, TipoToken.OpAritSoma, 0));
			case "-":
				return(new Token(caracter, TipoToken.OpAritSub, 0));
			case "<":
				return(new Token(caracter, TipoToken.OpRelMenor, 0));
			case "<=":
				return(new Token(caracter, TipoToken.OpRelMenorIgual, 0));
			case ">":
				return(new Token(caracter, TipoToken.OpRelMaior, 0));
			case ">=":
				return(new Token(caracter, TipoToken.OpRelMaiorIgual, 0));
			case "==":
				return(new Token(caracter, TipoToken.OpRelIgual, 0));
			case "<>":
				return(new Token(caracter, TipoToken.OpRelDif, 0));
			case "and":
				return(new Token(caracter, TipoToken.OpBoolE, 0));
			case "or":
				return(new Token(caracter, TipoToken.OpBoolOu, 0));
			case "[":
				return(new Token(caracter, TipoToken.IniDelim, 0));
			case "]":
				return(new Token(caracter, TipoToken.FimDelim, 0));
			case "<<":
				return(new Token(caracter, TipoToken.Atrib, 0));
			//case caracter.matches("[A-Z][A-Z]|[a-z]|[0-9]*"):
				//return(new Token(caracter, TipoToken.Var, 0));
			//case caracter.matches("[0-9+]"):
				//return(new Token(caracter, TipoToken.NumInt, 0));
			//case caracter.matches("[0-9]?."):
				//return(new Token(caracter, TipoToken.NumReal, 0));
			//case caracter.matches(""):
				//return(new Token(caracter, TipoToken.Cadeia, 0));
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
