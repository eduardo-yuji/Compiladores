import java.util.ArrayList;

public class ComandoEscrita extends Comando {
    private String texto;
    private TabelaSimbolo tabela;
    private String aux;

    public String getTexto() {return texto;}

    public void setTexto(String texto) {this.texto = texto;}

    public TabelaSimbolo getTabela() {return tabela;}

    public void setTabela(TabelaSimbolo tabela) {this.tabela = tabela;}

    @Override
    public String geradorCodigo() {
        if (texto != null) {
            if (texto.startsWith("\"") && texto.endsWith("\"")) {
                return "printf(" + texto + ");";
            } else {
                for(Simbolo simbolo : tabela.getAll()){
                    aux = simbolo.getNome().toString();
                    if(simbolo.getTipo().equals("float") && texto.equals(aux)){
                        return "printf(\"%f\\n\", " + texto + ");";
                    }else if(simbolo.getTipo().equals("integer") && texto.equals(aux)){
                        return "printf(\"%d\\n\", " + texto + ");";
                    }
                }
            }
        }
        return "";
    }
    public String toString() {
        return "ComandoEscrita{texto='" + texto + "', tabela=" + tabela + "}";
    }
}
