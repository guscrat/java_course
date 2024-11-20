import java.util.Random;
import java.util.Scanner;

public class ChallangeWhileFor {
    public static void main(String[] args) {
        
        int numAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int numUsuario = 0;

        for (int i = 0; i < 5; i ++ ) {
            System.out.println("Adivinhe o numero: (tentativa %d)".formatted(i + 1));
            numUsuario = leitura.nextInt();

            if (numUsuario < numAleatorio) {
                System.out.println("Numero menor que o esperado");
            } else if (numUsuario > numAleatorio) {
                System.out.println("Numero maior que o esperado");
            } else {
                System.out.println("Acertou!!! Congrats");
                break;
            }
            if (i == 4) { // Tentativas
                System.out.println("Voce nao acertou em %d tentativas, o numero era %d".formatted(i + 1, numAleatorio));
            }
        }

    }
}