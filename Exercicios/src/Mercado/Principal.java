package Mercado;
import java.util.Scanner;

public class Principal {
    // Nesta classe, crie o método main. No main, faça o que se pede;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crie uma prateleira com 3 produtos, conforme listagem;
        System.out.println("\n=== CADASTRO DE PRODUTOS ===");
        System.out.println("\nProduto 1");
        Produto produto1 = new Produto("amaciante", lerPreco(scanner), new Data(10,4,2014));
        System.out.println("\nProduto 2");
        Produto produto2 = new Produto("creme dental", lerPreco(scanner), new Data(5,5,2015));
        System.out.println("\nProduto 3");
        Produto produto3 = new Produto("leite condensado", lerPreco(scanner), new Data(4,12,2012));
        Prateleira prateleira1 = new Prateleira(produto1, produto2, produto3);

        // Crie uma prateleira sem produto algum. Em seguida, insira nesta prateleira o produto "cortina", que custa R$167,98 e tem data de validade 13/10/2025
        System.out.println("\n=== CADASTRO DE PRODUTOS ===");
        Produto cortina = new Produto("cortina", 167.98, new Data(13,10,2025));
        Produto carro = new Produto("Nissan",3000, new Data(1,1,2080));
        Prateleira prateleira2 = new Prateleira();
        prateleira2.setProduto1(cortina);

        // Crie um mercado com estas duas prateleiras;
        Mercado mercado = new Mercado(prateleira1,prateleira2);

        // Mostre na tela as informações dos produtos vencidos, supondo a data 25/04/2023;
        System.out.println("\n=== PRODUTOS VENCIDOS ===");
        Data dataAtual = new Data(25,4,2023);
        prateleira1.getProduto1().verificaProdutoVencido(dataAtual);
        prateleira1.getProduto2().verificaProdutoVencido(dataAtual);
        prateleira1.getProduto3().verificaProdutoVencido(dataAtual);
        prateleira2.getProduto1().verificaProdutoVencido(dataAtual);
        //prateleira2.getProduto2().verificaProdutoVencido(dataAtual);
        //prateleira2.getProduto3().verificaProdutoVencido(dataAtual);

        // Imprima as informações do produto mais caro do mercado;
        System.out.println("\n=== PRODUTO MAIS CARO ===");
        System.out.println("\nPrateleira 1: ");
        System.out.println(prateleira1.produtoMaisCaro());
        System.out.println("\nPrateleira 2: ");
        System.out.println(prateleira2.produtoMaisCaro());

        // Imprima a média de preço dos produtos do mercado;
        System.out.println("\n=== MEDIA DE PREÇO DOS PRODUTOS ===");
        System.out.println("R$"+mercado.mediaValorProdutos());

    }
    private static double lerPreco(Scanner scanner){
        double preco;
        do{
            System.out.println("Digite o preço do produto: R$");
            preco = scanner.nextDouble();
            if (preco <= 0){
                System.out.println("O preço deve ser maior que zero. Digite novamente.");
            }
        } while (preco <=0 );
        return preco;
    }
}
