public class ResistorSimples {
    public static void main(String[] args) {
        String[] cores = {"preto","marrom","vermelho","laranja","amarelo",
                "verde","azul","violeta","cinza","branco"};

        int d1 = 1; // Valor padrão se não achar a cor
        int d2 = 0;
        int mult = 1;

        // Procura as cores nas primeiras posições
        for(int i=0; i<cores.length; i++) {
            if(cores[i].equals(args[0])) d1 = i;
            if(cores[i].equals(args[1])) d2 = i;
            if(cores[i].equals(args[2])) mult = (int)Math.pow(10, i);
        }

        System.out.println((d1*10 + d2) * mult + " Ohms");
    }
}