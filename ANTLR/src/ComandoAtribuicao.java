import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComandoAtribuicao extends Comando {
    private String id;
    private String expressao;
    private TabelaSimbolo tipo;

    public ComandoAtribuicao(String id, String expressao, TabelaSimbolo tipo) {
        this.id = id;
        this.expressao = expressao;
        this.tipo = tipo;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getExpressao() { return expressao; }

    public void setExpressao(String expressao) { this.expressao = expressao; }

    public TabelaSimbolo getTipo() { return tipo; }

    public void setTipo(TabelaSimbolo tipo) { this.tipo = tipo; }

    @Override
    public String geradorCodigo() {
        return id + " = " + expressao + ";";
    }
    public String toString() {
        return "ComandoAtribuicao{id='" + id + "', expressao='" + expressao + "'}";
    }
}
