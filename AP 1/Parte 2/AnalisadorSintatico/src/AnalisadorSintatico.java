import java.util.List;

public class AnalisadorSintatico {
    private List<Token> tokens;
    private int currentIndex = 0;
    private Token currentToken;

    public AnalisadorSintatico(List<Token> tokens) {
        this.tokens = tokens;
        this.currentToken = tokens.get(currentIndex);
    }

    // Avança para o próximo token
    private void nextToken() {
        currentIndex++;
        if (currentIndex < tokens.size()) {
            currentToken = tokens.get(currentIndex);
        } else {
            //currentToken = null; // Final dos tokens
            currentToken = tokens.get(currentIndex);
        }
    }

    // Verifica se o token atual é do tipo esperado e avança para o próximo token
    private void match(TipoToken expectedType) throws SyntaxException {
        if (currentToken != null && currentToken.getType() == expectedType) {
            nextToken();
        } else {
        	throw new SyntaxException("(inesperado '" +(currentToken != null ? currentToken.getLexema() : "EOF")+"')", currentToken.getLinhaNumero());
        }
    }
    
    public static class SyntaxException extends Exception {
    	int linha = 1;
    	
    	public SyntaxException(String message, int linha) {
    		super("Linha " + linha + " " + message);
    		this.linha = linha;
    	}
    	
    	public int getLinha() {
    		return linha;
    	}
    }

    // Função de análise sintática para o programa
    public void Programa() throws SyntaxException {
        match(TipoToken.IniDelim);  // '['
        match(TipoToken.PCDec);     // 'dec'
        match(TipoToken.FimDelim);  // ']'
        ListaDeclaracoes();
        match(TipoToken.IniDelim);  // '['
        match(TipoToken.PCProg);    // 'prog'
        match(TipoToken.FimDelim);  // ']'
        ListaComandos();
        
    }
    
    // Função para ListaDeclaracoes
    private void ListaDeclaracoes() throws SyntaxException {
        Declaracao();
        while (currentToken != null && currentToken.getType() == TipoToken.Var) {
            Declaracao();
        }
    }

    // Função para Declaracao
    private void Declaracao() throws SyntaxException {
        match(TipoToken.Var);
        match(TipoToken.IniDelim);  // '['
        TipoVar();
        match(TipoToken.FimDelim);  // ']'
    }

    // Função para TipoVar
    private void TipoVar() throws SyntaxException {
        if (currentToken.getType() == TipoToken.PCInt) {
            match(TipoToken.PCInt);
        } else if (currentToken.getType() == TipoToken.PCReal) {
            match(TipoToken.PCReal);
        } else {
            throw new SyntaxException("(inesperado '" +(currentToken != null ? currentToken.getLexema() : "EOF")+"')",currentToken.getLinhaNumero());
        }
    }

    // Função para ListaComandos
    private void ListaComandos() throws SyntaxException {
        Comando();
        while (currentToken != null && currentToken.getType() != TipoToken.PCFim && currentToken.getLexema() != "") {
            	Comando();
        }
    }

    // Função para Comando
    private void Comando() throws SyntaxException {
        switch (currentToken.getType()) {
            case Var:
                ComandoAtribuicao();
                break;
            case PCLer:
                ComandoEntrada();
                break;
            case PCImprimir:
                ComandoSaida();
                break;
            case PCSe:
                ComandoCondicao();
                break;
            case PCEnqto:
                ComandoRepeticao();
                break;
            case PCIni:
                SubAlgoritmo();
                break;
            default:
                throw new SyntaxException("(inesperado '" +(currentToken != null ? currentToken.getLexema() : "EOF")+"')",currentToken.getLinhaNumero());
        }
    }

    // Função para ComandoAtribuicao
    private void ComandoAtribuicao() throws SyntaxException {
        match(TipoToken.Var);
        match(TipoToken.Atrib);  // '<<'
        ExpressaoAritmetica();
    }

    // Função para ComandoEntrada
    private void ComandoEntrada() throws SyntaxException {
        match(TipoToken.PCLer);
        match(TipoToken.Var);
    }

    // Função para ComandoSaida
    private void ComandoSaida() throws SyntaxException {
        match(TipoToken.PCImprimir);
        if (currentToken.getType() == TipoToken.Var || currentToken.getType() == TipoToken.Cadeia) {
            match(currentToken.getType());
        } else {
            throw new SyntaxException("(inesperado '" +(currentToken != null ? currentToken.getLexema() : "EOF")+"')",currentToken.getLinhaNumero());
        }
    }

    // Função para ComandoCondicao
    private void ComandoCondicao() throws SyntaxException {
        match(TipoToken.PCSe);
        ExpressaoRelacional();
        match(TipoToken.PCEntao);
        Comando();
        if (currentToken != null && currentToken.getType() == TipoToken.PCSenao) {
            match(TipoToken.PCSenao);
            Comando();
        }
    }

    // Função para ComandoRepeticao
    private void ComandoRepeticao() throws SyntaxException {
        match(TipoToken.PCEnqto);
        ExpressaoRelacional();
        match(TipoToken.PCEntao);
        Comando();
    }

    // Função para SubAlgoritmo
    private void SubAlgoritmo() throws SyntaxException {
        match(TipoToken.PCIni);
        ListaComandos();
        match(TipoToken.PCFim);
    }

    // Função para ExpressaoAritmetica
    private void ExpressaoAritmetica() throws SyntaxException {
        TermoAritmetico();
        ExpressaoAritmetica2();
    }

    // Função para ExpressaoAritmetica2
    private void ExpressaoAritmetica2() throws SyntaxException {
        if (currentToken.getType() == TipoToken.OpAritSoma) {
            match(TipoToken.OpAritSoma);
            TermoAritmetico();
            ExpressaoAritmetica2();
        } else if (currentToken.getType() == TipoToken.OpAritSub) {
            match(TipoToken.OpAritSub);
            TermoAritmetico();
            ExpressaoAritmetica2();
        }
        // Se o token não corresponder a '+' ou '-', a função termina.
    }

    // Função para TermoAritmetico
    private void TermoAritmetico() throws SyntaxException {
        FatorAritmetico();
        TermoAritmetico2();
    }

    // Função para TermoAritmetico2
    private void TermoAritmetico2() throws SyntaxException {
        if (currentToken.getType() == TipoToken.OpAritMult) {
            match(TipoToken.OpAritMult);
            FatorAritmetico();
            TermoAritmetico2();
        } else if (currentToken.getType() == TipoToken.OpAritDiv) {
            match(TipoToken.OpAritDiv);
            FatorAritmetico();
            TermoAritmetico2();
        }
        // Se o token não corresponder a '*' ou '/', a função termina.
    }

    // Função para FatorAritmetico
    private void FatorAritmetico() throws SyntaxException {
        switch (currentToken.getType()) {
            case NumInt:
            	match(TipoToken.NumInt);
            	break;
            case NumReal:
            	match(TipoToken.NumReal);
            	break;
            case Var:
                match(currentToken.getType());
                break;
            case AbrePar:
                match(TipoToken.AbrePar);
                ExpressaoAritmetica();
                match(TipoToken.FechaPar);
                break;
            default:
                throw new SyntaxException("(inesperado '" +(currentToken != null ? currentToken.getLexema() : "EOF")+"')",currentToken.getLinhaNumero());
        }
    }

    // Função para ExpressaoRelacional
    private void ExpressaoRelacional() throws SyntaxException {
        TermoRelacional();
        ExpressaoRelacional2();
    }

    // Função para ExpressaoRelacional2
    private void ExpressaoRelacional2() throws SyntaxException {
        if (currentToken.getType() == TipoToken.OpBoolE) {
            match(TipoToken.OpBoolE);
            TermoRelacional();
            ExpressaoRelacional2();
        } else if (currentToken.getType() == TipoToken.OpBoolOu) {
            match(TipoToken.OpBoolOu);
            TermoRelacional();
            ExpressaoRelacional2();
        }
        // Se o token não corresponder a 'and' ou 'or', a função termina.
    }

    // Função para TermoRelacional
    private void TermoRelacional() throws SyntaxException {
        if (currentToken.getType() == TipoToken.AbrePar) {
            match(TipoToken.AbrePar);
            ExpressaoRelacional();
            match(TipoToken.FechaPar);
        } else {
            ExpressaoAritmetica();
            match(currentToken.getType());  // OP_REL
            ExpressaoAritmetica();
        }
    }

}
