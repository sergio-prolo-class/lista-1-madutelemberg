public class BatalhaNavalMaisSimples {
    public static void main(String[] args) {
        // Cria um tabuleiro 3x3 (para simplificar)
        char[][] tabuleiro = {
                {'.', '.', '.'},
                {'.', 'N', '.'},  // 'N' representa um navio
                {'.', '.', '.'}
        };

        // Imprime o tabuleiro
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}