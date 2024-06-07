class Token {
    private TipoToken tipo;
    private String lexema;
    private int linhaNumero;

    public Token(TipoToken tipo, String lexema, int linhaNumero) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.linhaNumero = linhaNumero;
    }

    public TipoToken getType() {
        return tipo;
    }

    public String getLexema() {
        return lexema;
    }

    public int getLinhaNumero() {
        return linhaNumero;
    }

    @Override
    public String toString() {
        if(tipo == null) {
            return "Erro lexico na linha " + linhaNumero + ": Desconhecido '" + lexema + "'."; 
        }
        return "Linha: " + linhaNumero + " <" + tipo + ", \"" + lexema + "\">";
    }
}