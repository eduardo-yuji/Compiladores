import java.util.ArrayList;

public class ComandoCondicao extends Comando {
    private String expressaoRelacional;
    private ArrayList<Comando> comandosVerdadeiros;
    private ArrayList<Comando> comandosFalsos;

    public ComandoCondicao(String expressaoRelacional, ArrayList<Comando> comandosVerdadeiros,
            ArrayList<Comando> comandosFalsos) {
        this.expressaoRelacional = expressaoRelacional;
        this.comandosVerdadeiros = comandosVerdadeiros;
        this.comandosFalsos = comandosFalsos;
    }

    public String getExpressaoRelacional() {return expressaoRelacional;}

    public void setExpressaoRelacional(String expressaoRelacional) {this.expressaoRelacional = expressaoRelacional;}

    public ArrayList<Comando> getComandosVerdadeiros() {return comandosVerdadeiros;}

    public void setComandosVerdadeiros(ArrayList<Comando> comandosVerdadeiros) {this.comandosVerdadeiros = comandosVerdadeiros;}

    public ArrayList<Comando> getComandosFalsos() {return comandosFalsos;}

    public void setComandosFalsos(ArrayList<Comando> comandosFalsos) {this.comandosFalsos = comandosFalsos;}

    @Override
    public String geradorCodigo() {
        StringBuilder str = new StringBuilder();
        str.append("if (" + expressaoRelacional + ") {");
        for (Comando comando : comandosVerdadeiros) {
            str.append("\n\t\t" + comando.geradorCodigo());
        }
        str.append("\n\t}"); // Fim do bloco do if

        if (comandosFalsos != null && !comandosFalsos.isEmpty()) {
            str.append(" else {");
            for (Comando comando : comandosFalsos) {
                str.append("\n\t\t" + comando.geradorCodigo());
            }
            str.append("\n\t}"); // Fim do bloco do else
        }

        return str.toString();
    }

    public String toString() {
        return "ComandoCondicao{expressaoRelacional='" + expressaoRelacional + "', comandosVerdadeiros=" + comandosVerdadeiros + ", comandosFalsos=" + comandosFalsos + "}";
    }
}
