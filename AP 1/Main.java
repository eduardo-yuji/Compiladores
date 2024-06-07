import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try {
            File arquivo = new File("programa1.gyh");
            Scanner leitor = new Scanner(arquivo);
            List<String> tokens = new ArrayList<>();
            while (leitor.hasNextLine()) {
                String data = leitor.nextLine();
                StringBuilder tokenAtual = new StringBuilder();
                boolean dentroColchete = false;
                for (int i = 0; i < data.length(); i++) {
                    char c = data.charAt(i);
                    if (c == '[') {
                        dentroColchete = true;
                        if (tokenAtual.length() > 0) {
                            tokens.add(tokenAtual.toString().trim());
                            tokenAtual = new StringBuilder();
                        }
                        tokenAtual.append(" [ ");
                    } else if (c == ']') {
                        dentroColchete = false;
                        tokenAtual.append(" ] ");
                    } else if (c == ' ' && !dentroColchete) {
                        if (tokenAtual.length() > 0) {
                            tokens.add(tokenAtual.toString().trim());
                            tokenAtual = new StringBuilder();
                        }
                    } else if(c == '(') {
                        dentroColchete = true;
                        if (tokenAtual.length() > 0) {
                            tokens.add(tokenAtual.toString().trim());
                            tokenAtual = new StringBuilder();
                        }
                        tokenAtual.append(" ( ");
                    } else if (c == ')') {
                        dentroColchete = false;
                        tokenAtual.append(" ) ");
                    } else if (c == ' ' && !dentroColchete) {
                        if (tokenAtual.length() > 0) {
                            tokens.add(tokenAtual.toString().trim());
                            tokenAtual = new StringBuilder();
                        }
                    }
                    else {
                        tokenAtual.append(c);
                    }
                }
                if (tokenAtual.length() > 0) {
                    tokens.add(tokenAtual.toString().trim());
                }
            }
            leitor.close();

            // Exibe os tokens
            for (String token : tokens) {
                System.out.println(token);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
