import java.util.ArrayList;

public class ComandoRepeticao extends Comando {
    private String expressaoRelacional;
    private ArrayList<Comando> comandos;

    public String getExpressaoRelacional() {
        return expressaoRelacional;
    }

    public void setExpressaoRelacional(String expressaoRelacional) {
        this.expressaoRelacional = expressaoRelacional;
    }

    public ArrayList<Comando> getComandos() {
        return comandos;
    }

    public void setComandos(ArrayList<Comando> comandos) {
        this.comandos = comandos;
    }

    @Override
    public String geradorCodigo() {
        StringBuilder str = new StringBuilder();
        str.append("while (" + expressaoRelacional + ") {");
        for (Comando comando : comandos) {
            str.append("\n\t" + comando.geradorCodigo());
        }
        str.append("\n}"); // Fim do bloco do while
        return str.toString();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("while (" + expressaoRelacional + ") {\n");
        for (Comando comando : comandos) {
            str.append("\t" + comando.toString() + "\n");
        }
        str.append("}");
        return str.toString();
    }
}
