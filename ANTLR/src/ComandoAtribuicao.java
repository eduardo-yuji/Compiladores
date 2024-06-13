public class ComandoAtribuicao extends Comando {
    private String id;
    private String expressao;

    public ComandoAtribuicao(String id, String expressao) {
        this.id = id;
        this.expressao = expressao;
    }

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getExpressao() {return expressao;}

    public void setExpressao(String expressao) {this.expressao = expressao;}

    @Override
    public String geradorCodigo() {
        return id + " = " + expressao + ";";
    }

}
