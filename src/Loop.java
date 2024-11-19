import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        double notaFilme = 0;
        double mediaAvaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliacao para o filme");
            notaFilme = leitura.nextDouble();
            mediaAvaliacao += notaFilme;
        }

        System.out.println("Média de avaliacoes: " + mediaAvaliacao / 3);
    }
}
