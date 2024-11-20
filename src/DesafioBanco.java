import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        /*Inicializar dados do cliente
        Menu de opcoes
        Vizualizacao do saldo
        Envia valor
        Recebe valor*/

        // String nomeCliente = "Gustavo de Lima";
        // String tipoConta = "Corrente";
        
        Scanner leitura = new Scanner(System.in);
        double saldoConta = 2500.00;
        int oprOptions = 0;
        
        while (oprOptions != 9) {
            System.out.printf("""

                    ############################
                    Santander Brasil - Sua Conta
                    ############################
                    Nome         Gustavo de Lima
                    Tipo conta          Corrente
                    Saldo             R$ %.2f
                    
                    1) Consultar saldos;
                    2) Receber valor;
                    3) Transferir valor;
                    4) Sair.
                    """, saldoConta);
            oprOptions = leitura.nextInt();

            if (oprOptions < 1 || oprOptions > 4) {
                System.out.println("Valor invalido");

            } else if (oprOptions == 1) {
                System.out.println("Saldo atual: $%f".formatted(saldoConta));

            } else if (oprOptions == 2) {
                System.out.println("Digite o valor a receber");
                saldoConta += leitura.nextInt();
            
            } else if (oprOptions == 3) {
                System.out.println("Digite o valor a extrair");
                int addValue = leitura.nextInt();
                if ((saldoConta - addValue) < 0) {
                    System.out.println("Valor maior que o saldo em conta");
                } else {
                    saldoConta -= addValue;
                };
            
            } else if (oprOptions == 4) {
                System.out.println("Fim do programa");
                break;
            }
        }
        leitura.close();
    }
}
