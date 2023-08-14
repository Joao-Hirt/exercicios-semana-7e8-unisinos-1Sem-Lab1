package For;
import java.util.Scanner;

public class TesteExerciciosFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExerciciosFor ex = new ExerciciosFor();

        //Exercicio 1
        System.out.println("Digite um inteiro x: ");
        int x = scanner.nextInt();
        ex.exercicio1(x);

        //Exercicio 2
        System.out.println("Digite um inteiro x: ");
        x = scanner.nextInt();
        ex.exercicio2(x);

        //Exercicio 3
        System.out.println("Digite um inteiro x: ");
        x = scanner.nextInt();
        ex.exercicio3(x);

        //Exercicio 4
        System.out.println("Digite um inteiro x: ");
        x = scanner.nextInt();
        ex.exercicio4(x);

        //Exercicio 5
        System.out.println("Digite um inteiro x: ");
        x = scanner.nextInt();
        ex.exercicio5(x);

        //Exercicio 6
        System.out.println("Digite um inteiro x: ");
        x = scanner.nextInt();
        double soma = ex.exercicio6(x);
        System.out.println("A soma dos números é: "+soma);

        //Exercicio 7
        ex.exercicio7();

        //Exercicio 8
        ex.exercicio8();

        //Exercicio 9
        System.out.println("Digite o primeiro valor: ");
        int val1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int val2 = scanner.nextInt();
        ex.exercicio9(val1, val2);

        //Exercicio 10
        ex.exercicio10();

        //Exercicio 11
        System.out.println("Digite o primeiro valor: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int n2 = scanner.nextInt();
        ex.exercicio11(n1, n2);

        //Exercicio 12
        ex.exercicio12();

        //Exercicio 13
        System.out.println("Digite um valor para calcular o fatorial: ");
        int num = scanner.nextInt();
        int fatorial = ex.exercicio13(num);
        System.out.println(num+"! = "+fatorial);

        //Exercicio 14
        System.out.println("Digite um valor para saber se é primo: ");
        int valor = scanner.nextInt();
        boolean primo = ex.exercicio14(valor);
        if(primo){
            System.out.println(valor+" é primo.");
        }else{
            System.out.println(valor+" não é primo.");
        }

        //Exercicio 15
        System.out.println("Digite um inteiro x: ");
        x = scanner.nextInt();
        ex.exercicio15(x);
    }
}
