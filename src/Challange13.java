import java.util.Scanner;

public class Challange13 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // ********************************************************************
        // Primeiro exercicio
        System.out.println("""

                1) Crie um programa que solicite ao usuário digitar um número.
                Se o número for positivo, exiba "Número positivo", caso contrário,
                exiba "Número negativo".
                """);

        System.out.println("Positivo ou negativo? Digite seu numero");
        int numeroInput = leitura.nextInt();

        if (numeroInput < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Numero positivo");
        }


        // ********************************************************************
        // Segundo exercicio
        System.out.println("""
                
                2) Peça ao usuário para inserir dois números inteiros. Compare os números
                e imprima uma mensagem indicando se são iguais, diferentes, o primeiro
                é maior ou o segundo é maior.
                """);

        System.out.println("Digite dois numeros:");
        int primeiroNum = leitura.nextInt();
        int segundoNum = leitura.nextInt();

        if (primeiroNum == segundoNum) {
            System.out.println("Os numeros sao iguais");
        } else {
            System.out.println("Os numeros sao diferentes");
        }
        if (primeiroNum > segundoNum) {
            System.out.println("Primeiro maior que segundo");
        } else if (segundoNum > primeiroNum){
            System.out.println("Segundo maior que primeiro");
        }
        

        // ********************************************************************
        // Terceiro Exercicio
        System.out.println("""

                3) Crie um menu que oferece duas opções ao usuário: "1. Calcular
                área do quadrado" e "2. Calcular área do círculo". Solicite a
                escolha do usuário e realize o cálculo da área com base na
                opção selecionada.
                """);

        int inputOpcao = 0;
        System.out.println("""
                Selecione uma das seguintes opcoes:
                Calcular a area do quadrado (1)
                Calcular a area do circulo  (2)
                """);
        while (inputOpcao < 1 || inputOpcao > 2) {
            inputOpcao = leitura.nextInt();
            if (inputOpcao < 1 || inputOpcao > 2) {
                System.out.println("Opcao invalida");
            }
        }
        int ladoQuadrado;
        double raioCirculo;
        if (inputOpcao == 1) {
            System.out.println("Medida de um dos lados do quadrado:");
            ladoQuadrado = leitura.nextInt();
            System.out.println("A area do quadrado = %d".formatted(ladoQuadrado * 2));
        } else {
            System.out.println("Medida do raio do circulo:");
            raioCirculo = leitura.nextDouble();
            System.out.println("A area do circulo = %f".formatted(Math.pow(3.14 * raioCirculo, 2)));
        }


        // ********************************************************************
        // Quarto Exercicio
        System.out.println("""
                
                4) Crie um programa que solicite ao usuário um número e exiba a
                tabuada desse número de 1 a 10.
                """);
        
        System.out.println("Digite um numero de 1 a 10");
        int inputTabuada = 0;
        while (inputTabuada < 1 || inputTabuada > 10) {
            inputTabuada = leitura.nextInt();
            if (inputTabuada < 1 || inputTabuada > 10) {
                System.out.println("Opcao invalida");
            }
        }
        System.out.println("Tabuada do numero %d".formatted(inputTabuada));
        for (int i = 1; i < 11; i++) {
            System.out.println("%d * %d = %d".formatted(inputTabuada, i, inputTabuada*i));
        }


        // ********************************************************************
        // Quinto Exercicio
        System.out.println("""
                
                5) Crie um programa que solicite ao usuário a entrada de um número
                inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem
                correspondente.
                """);

        System.out.println("Digite um numero inteiro");
        int numInteiro = leitura.nextInt();
        if (numInteiro % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
        

        // ********************************************************************
        // Sexto Exercicio
        System.out.println("""
                
                6) Crie um programa que solicite ao usuário um número e
                calcule o fatorial desse número.
                """);

        System.out.println("Digite um numero para eu calcular o fatorial");
        int numFat = leitura.nextInt();
        int tempNum = numFat;
        while (numFat > 1) {
            tempNum *= (numFat - 1);
            numFat -= 1;
        }
        System.out.println("Resultado: %d".formatted(tempNum));


        leitura.close();
    }
}
