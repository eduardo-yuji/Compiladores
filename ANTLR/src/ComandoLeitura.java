public class ComandoLeitura extends Comando {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String geradorCodigo() {
        return "scanf(\"%d\", &" + id + ");"; // Supondo que estamos lendo um inteiro (%d)
    }

    @Override
    public String toString() {
        return "Leitura: read " + id;
    }
}
