public class App {
    public static void main(String[] args){
        System.out.println("""

                Crie um programa que realize a média 
                de duas notas decimais e exiba o resultado.
                """);
        double nota1 = 9.5;
        double nota2 = 7.5;

        double media = (nota1 + nota2) / 2;
        System.out.println("Resultado: " + media);

        System.out.println("""

                Declare uma variável do tipo double. Faça o casting 
                da variável double para int e imprima o resultado.
                """);

        double varCastingTest = 10.5;
        int varCastadaTest = (int) varCastingTest;

        System.out.println("Resultado: " + varCastadaTest);

        System.out.println("""
                
                Declare uma variável do tipo char (letra) e uma variável 
                do tipo String (palavra). Atribua valores a essas variáveis 
                e concatene-as em uma mensagem
                """);

        char concatVar = 'a';
        String concatString = "Test concat";

        System.out.println("Resultado: " + concatVar + concatString);

        System.out.println("""

                Declare uma variável do tipo double precoProduto 
                e uma variável do tipo int (quantidade). 
                Calcule o valor total multiplicando o preço 
                do produto pela quantidade e apresente o resultado 
                em uma mensagem.
                """);

        double precoProduto = 10.99;
        int quantidade = 100;

        System.out.println("Resultado: " + precoProduto * quantidade);

        System.out.println("""
                
                Declare uma variável do tipo double valorEmDolares. Atribua um valor em
                dólares a essa variável. Considere que o valor de 1 dólar é equivalente 
                a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima
                resultado formatado.
                """);

        double valorEmDolares = 100.00;
        double conversaoReal = 4.94;

        System.out.println("Resultado: " + valorEmDolares * conversaoReal);

        System.out.println("""
                
                Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
                """);

        double precoOriginal = 99.89;
        double percentualDesconto = 10;
        double valorComDesconto = precoOriginal - (precoOriginal * (percentualDesconto/100));

        System.out.println("Resultado: " + valorComDesconto);

	System.out.println("Resultado: " + "Testttttty");

    }
}
