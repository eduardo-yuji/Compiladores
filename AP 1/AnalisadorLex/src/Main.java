import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            String fileName = args[i];
            //Recebe o arquivo
            System.out.println("\n\n ----- Arquivo " + i + " ----" + "\n\n");

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                //Passa o arquivo pro buffer
                StringBuilder input = new StringBuilder();
                //Passa pra StringBuilder
                String linha;
                int linhaNumero = 1;

                while ((linha = reader.readLine()) != null) {
                	//Enquanto a linha != de NULL
                    linhaNumero++;
                    if (linha.trim().startsWith("#")) {
                    	//Se a linha começa com #
                        linha = linha.replaceAll(linha, "\n");
                        //Troca a linha inteira por \n
                        input.append(linha);
                        //Coloca a linha no input
                        //linha = "\n";
                        continue;
                    }
                    input.append(linha).append("\n");
                    //Coloca a linha + \n no input
                }

                AnalisadorLexico lexer = new AnalisadorLexico(input.toString());
                List<Token> tokens = lexer.tokenize();
                //Cria lista dos tokens

                for (Token token : tokens) {
                    System.out.println(token + " ");
                    //Acrescenta um esapço entre cada token
                }

                reader.close();
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        }
    }
}