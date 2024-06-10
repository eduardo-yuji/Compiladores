import java.util.ArrayList;

public class ComandoCondicao extends Comando {
    private String expressaoRelacional;
    private ArrayList<Comando> comandosVerdadeiros;
    private ArrayList<Comando> comandosFalsos;

    public String getExpressaoRelacional() {
        return expressaoRelacional;
    }

    public void setExpressaoRelacional(String expressaoRelacional) {
        this.expressaoRelacional = expressaoRelacional;
    }

    public ArrayList<Comando> getComandosVerdadeiros() {
        return comandosVerdadeiros;
    }

    public void setComandosVerdadeiros(ArrayList<Comando> comandosVerdadeiros) {
        this.comandosVerdadeiros = comandosVerdadeiros;
    }

    public ArrayList<Comando> getComandosFalsos() {
        return comandosFalsos;
    }

    public void setComandosFalsos(ArrayList<Comando> comandosFalsos) {
        this.comandosFalsos = comandosFalsos;
    }

    @Override
    public String geradorCodigo() {
        StringBuilder str = new StringBuilder();
        str.append("if (" + expressaoRelacional + ") {");
        for (Comando comando : comandosVerdadeiros) {
            str.append("\n\t" + comando.geradorCodigo());
        }
        str.append("\n}"); // Fim do bloco do if

        if (comandosFalsos != null && !comandosFalsos.isEmpty()) {
            str.append(" else {");
            for (Comando comando : comandosFalsos) {
                str.append("\n\t" + comando.geradorCodigo());
            }
            str.append("\n}"); // Fim do bloco do else
        }

        return str.toString();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("if (" + expressaoRelacional + ") {\n");
        for (Comando comando : comandosVerdadeiros) {
            str.append("\t" + comando.toString() + "\n");
        }
        str.append("}");

        if (comandosFalsos != null && !comandosFalsos.isEmpty()) {
            str.append(" else {\n");
            for (Comando comando : comandosFalsos) {
                str.append("\t" + comando.toString() + "\n");
            }
            str.append("}");
        }

        return str.toString();
    }
}
