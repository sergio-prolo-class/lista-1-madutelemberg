import java.util.Scanner;

public class ValidaTabuleiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhas = 0;

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            linhas++;

            if (linha.length() != 19) {
                System.out.println("Erro: Tabuleiro deve ter 10 colunas");
                return;
            }
        }

        if (linhas != 10) {
            System.out.println("Erro: Tabuleiro deve ter 10 linhas");
        } else {
            System.out.println("Tabuleiro OK");
        }
    }
}