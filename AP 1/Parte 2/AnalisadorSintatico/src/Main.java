//Analisador Léxico + Sintático
//Autores: Eduardo Yuji Yoshida Yamada - 2320606
//		   Séfora Davanso de Assis - 2367777



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String fileName = args[i];
            System.out.println("\n\n ----- Arquivo " + i + " ----" + "\n\n");

            try {
                // Leitura do arquivo
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                StringBuilder input = new StringBuilder();
                String linha;

                while ((linha = reader.readLine()) != null) {
                    // Adiciona cada linha ao input
                    input.append(linha).append("\n");
                }

                reader.close();

                // Instancia o analisador léxico com a entrada lida
                AnalisadorLexico lexer = new AnalisadorLexico(input.toString());
                List<Token> tokens = lexer.tokenize();

                // Imprime a lista de tokens para debug (opcional)
                for (Token token : tokens) {
                    System.out.println(token + " ");
                }

                // Instancia o analisador sintático com a lista de tokens
                AnalisadorSintatico parser = new AnalisadorSintatico(tokens);

                try {
                    // Inicia a análise sintática
                    parser.Programa();
                } catch (AnalisadorSintatico.SyntaxException e) {
                    // Ao capturar a exceção, imprime a mensagem de erro com a linha
                    System.out.println("Erro de sintaxe: " + e.getMessage());
                    // Continua a análise sintática com o próximo token
                }
                
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        }
    }
}
