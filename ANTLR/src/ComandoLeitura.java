public class ComandoLeitura extends Comando {
    private String id;
    private TabelaSimbolo tipo;
    private String aux;
    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public TabelaSimbolo getTipo() {return tipo;}

    public void setTipo(TabelaSimbolo tipo) {this.tipo = tipo;}

    @Override
    public String geradorCodigo() {
        for(Simbolo simbolo : tipo.getAll()){
            aux = simbolo.getNome().toString();
            if(id.equals(aux)){
                if(simbolo.getTipo().equals("integer")){
                    return "scanf(\"%d\", &" + id + ");"; // Supondo que estamos lendo um inteiro (%d)
                } else if(simbolo.getTipo().equals("float")){
                    return "scanf(\"%f\", &" + id + ");"; // Supondo que estamos lendo um float (%f)
                }
            }
        }
        return "";
    }
}
