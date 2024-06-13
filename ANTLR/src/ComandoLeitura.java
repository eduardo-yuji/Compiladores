public class ComandoLeitura extends Comando {
    private String id;
    private String tipo;

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getId() {return id;    }

    public void setId(String id) {this.id = id;}

    @Override
    public String geradorCodigo() {
        if(tipo.equals("integer")){
            return "scanf(\"%d\", &" + id + ");"; // Supondo que estamos lendo um inteiro (%d)
        } else if(tipo.equals("float")){
            return "scanf(\"%f\", &" + id + ");"; // Supondo que estamos lendo um float (%f)
        } else{
            return "";
        }
    }
}
