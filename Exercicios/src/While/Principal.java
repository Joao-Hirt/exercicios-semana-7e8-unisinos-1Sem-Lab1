package While;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Crie um objeto da classe Exercicios;
        Exercicios ex = new Exercicios();
        int opcao = 1;

        //Imprima na tela um menu, com opções de 1 a 3, da seguinte forma;
        while (opcao > 0 && opcao <= 3){
            System.out.println("=== MENU DE OPÇÕES ===");
            System.out.println("(1) Conta até 300");
            System.out.println("(2) Imprime pares");
            System.out.println("(3) Verifica Primo");
            System.out.println("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            //Solicite ao usuário que ele digite o número da opção desejada;
            switch (opcao){
                case 1:
                    System.out.println("Digite o valor de x: ");
                    int x1 = scanner.nextInt();
                    ex.contador(x1);
                    break;
                case 2:
                    System.out.println("Digite o valor de x: ");
                    int x2 = scanner.nextInt();
                    ex.imprimePares(x2);
                    break;
                case 3:
                    System.out.println("Digite o valor de x: ");
                    int x3 = scanner.nextInt();
                    boolean ehPrimo = ex.verificaPrimo(x3);
                    if (ehPrimo){
                        System.out.println(x3+" é primo!");
                    } else {
                        System.out.println(x3+" não é primo!");
                    }
                    break;
                default:
                    System.out.println("Saindo...");
                    break;
            }
        } scanner.close();
    }
}
