import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        double notaFilme = 0;
        double mediaAvaliacao = 0;
        int totalDeNotas = 0;

        while (notaFilme != -1) {
            System.out.println("Diga sua avaliacao para o filme");
            notaFilme = leitura.nextDouble();
            
            if (notaFilme != -1){
                mediaAvaliacao += notaFilme;
                totalDeNotas += 1;
            }
        }

        System.out.println("Média de avaliacoes: " + mediaAvaliacao / totalDeNotas);
        System.out.println("Média de avaliacoes: " + mediaAvaliacao / totalDeNotas);
    }
}
