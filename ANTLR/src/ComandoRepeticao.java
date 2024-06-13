import java.util.ArrayList;

public class ComandoRepeticao extends Comando {
    private String expressaoRelacional;
    private ArrayList<Comando> comandos;

    public ComandoRepeticao(String expressaoRelacional, ArrayList<Comando> comandos) {
        this.expressaoRelacional = expressaoRelacional;
        this.comandos = comandos;
    }

    public String getExpressaoRelacional() {return expressaoRelacional;}

    public void setExpressaoRelacional(String expressaoRelacional) {this.expressaoRelacional = expressaoRelacional;}

    public ArrayList<Comando> getComandos() {return comandos;}

    public void setComandos(ArrayList<Comando> comandos) {this.comandos = comandos;}

    @Override
    public String geradorCodigo() {
        StringBuilder str = new StringBuilder();
        str.append("while (" + expressaoRelacional + ") {");
        for (Comando comando : comandos) {
            str.append("\n\t\t" + comando.geradorCodigo());
        }
        str.append("\n\t}"); // Fim do bloco do while
        return str.toString();
    }

}
