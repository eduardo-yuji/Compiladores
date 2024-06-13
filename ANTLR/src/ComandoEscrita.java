public class ComandoEscrita extends Comando {
    private String texto;

    public String getTexto() {return texto;}

    public void setTexto(String texto) {this.texto = texto;}

    @Override
    public String geradorCodigo() {
        if (texto != null) {
            if (texto.startsWith("\"") && texto.endsWith("\"")) {
                return "printf(" + texto + ");";
            } else {
                return "printf(\"%d\", " + texto + ");";
            }
        }
        return "";
    }

}
