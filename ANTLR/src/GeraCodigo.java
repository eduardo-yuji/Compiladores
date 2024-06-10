import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GeraCodigo {
    private TabelaSimbolo tabela;
    private ArrayList<Comando> comando;

    public ArrayList<Comando> getComando() {
        return comando;
    }

    public void setComando(ArrayList<Comando> comando) {
        this.comando = comando;
    }

    public GeraCodigo() {}

    public TabelaSimbolo getTabela() {
        return tabela;
    }

    public void setTabela(TabelaSimbolo tabela) {
        this.tabela = tabela;
    }

    public void geradorCodigo() {
        StringBuilder str = new StringBuilder();
        str.append("#include <stdio.h>");
        str.append("\n#include <stdlib.h>");
        str.append("\n#include <stdbool.h>");
        str.append("\n#include <string.h>");

        str.append("\n\n int main(void){\n");

        for (Simbolo simbolo : tabela.getAll()) {
            if (simbolo.getTipo().equals("float")) {
                str.append("\tfloat " + simbolo.getNome() + "; \n");
            } else {
                str.append("\tint " + simbolo.getNome() + "; \n");
            }
        }

        for (Comando cmd : comando) {
            str.append("\t"+cmd.geradorCodigo());
        }

        str.append("\n \treturn 0;\n }");

        try {
            FileWriter file = new FileWriter(new File("PROGRAMA1.c"));
            file.write(str.toString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
