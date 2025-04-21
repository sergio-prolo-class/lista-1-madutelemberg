public class ArteASCII {
    public static void main(String[] args) {
        String tipo = args[0];
        int tamanho = Integer.parseInt(args[1]);

        // Triângulo
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");

        // Losango (tamanho fixo 5)
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
        System.out.println(" ***");
        System.out.println("  *");

        // Retângulo vazado (tamanho fixo 4)
        System.out.println("* * * *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("* * * *");
    }
}