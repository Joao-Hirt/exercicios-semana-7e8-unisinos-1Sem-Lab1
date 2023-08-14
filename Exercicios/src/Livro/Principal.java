package Livro;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informações do Cliente 1: ");
        System.out.println("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.println("Idade: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Sexo: ");
        String sexo1 = scanner.nextLine();
        System.out.println("Email: ");
        String email1 = scanner.nextLine();
        System.out.println("Senha: ");
        String senha1 = scanner.nextLine();
        System.out.println("Título do Livro: ");
        String tituloLivro1 = scanner.nextLine();
        System.out.println("Autor do Livro: ");
        String autorLivro1 = scanner.nextLine();
        System.out.println("Ano de Publicação: ");
        int anoPublicacao1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Preço do Livro: ");
        double precoLivro1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Quantidade de Páginas: ");
        int qntPaginas1 = scanner.nextInt();
        scanner.nextLine();

        Livro livro1 = new Livro(tituloLivro1, autorLivro1, anoPublicacao1, precoLivro1, qntPaginas1);
        Cliente cliente1 = new Cliente(nome1, idade1, sexo1, email1, senha1, livro1);


        System.out.println("\nInformações do Cliente 2: ");
        System.out.println("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.println("Idade: ");
        int idade2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Sexo: ");
        String sexo2 = scanner.nextLine();
        System.out.println("Email: ");
        String email2 = scanner.nextLine();
        System.out.println("Senha: ");
        String senha2 = scanner.nextLine();
        System.out.println("Título do Livro: ");
        String tituloLivro2 = scanner.nextLine();
        System.out.println("Autor do Livro: ");
        String autorLivro2 = scanner.nextLine();
        System.out.println("Ano de Publicação: ");
        int anoPublicacao2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Preço do Livro: ");
        double precoLivro2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Quantidade de Páginas: ");
        int qntPaginas2 = scanner.nextInt();
        scanner.nextLine();

        Livro livro2 = new Livro(tituloLivro2, autorLivro2, anoPublicacao2, precoLivro2, qntPaginas2);
        Cliente cliente2 = new Cliente(nome2, idade2, sexo2, email2, senha2, livro2);


        System.out.println("\nInformações do Cliente 2: ");
        System.out.println("Nome: ");
        String nome3 = scanner.nextLine();
        System.out.println("Idade: ");
        int idade3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Sexo: ");
        String sexo3 = scanner.nextLine();
        System.out.println("Email: ");
        String email3 = scanner.nextLine();
        System.out.println("Senha: ");
        String senha3 = scanner.nextLine();
        System.out.println("Título do Livro: ");
        String tituloLivro3 = scanner.nextLine();
        System.out.println("Autor do Livro: ");
        String autorLivro3 = scanner.nextLine();
        System.out.println("Ano de Publicação: ");
        int anoPublicacao3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Preço do Livro: ");
        double precoLivro3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Quantidade de Páginas: ");
        int qntPaginas3 = scanner.nextInt();
        scanner.nextLine();


        Livro livro3 = new Livro(tituloLivro3, autorLivro3, anoPublicacao3, precoLivro3, qntPaginas3);
        Cliente cliente3 = new Cliente(nome3, idade3, sexo3, email3, senha3, livro3);

        System.out.println("\nO Cliente "+cliente1.getNome()+"está com o livro chamado "+cliente1.getLivro().getTitulo()+", e o preço por página deste livro é R$"+cliente1.getLivro().calculaPrecoPorPagina());
        System.out.println("\nO Cliente "+cliente2.getNome()+"está com o livro chamado "+cliente2.getLivro().getTitulo()+", e o preço por página deste livro é R$"+cliente2.getLivro().calculaPrecoPorPagina());
        System.out.println("\nO Cliente "+cliente3.getNome()+"está com o livro chamado "+cliente3.getLivro().getTitulo()+", e o preço por página deste livro é R$"+cliente3.getLivro().calculaPrecoPorPagina());
    }
}
