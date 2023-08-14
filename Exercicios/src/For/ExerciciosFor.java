package For;
import java.util.Scanner;

public class ExerciciosFor {
    Scanner scanner = new Scanner(System.in);
    public void exercicio1(int x){
        for (int i = 0; i<x; i++){
            System.out.println("Digite o nome da pessoa "+(i+1)+": ");
            String nome = scanner.nextLine();
            System.out.println("Nome da pessoa "+(i+1)+": "+nome);
        }
        System.out.println();
    }

    public void exercicio2(int x){
        for (int i = 0; i<=x; i++){
            System.out.println(i);
        }
        System.out.println();
    }

    public void exercicio3(int x){
        if (x<0){
            System.out.println("Valor inválido. Digite um número positivo.");
            return;
        }
        for (int i = 0; i<=x; i++){
            if (i%2==0){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public void exercicio4(int x){
        if (x<0){
            System.out.println("Valor inválido. Digite um número positivo.");
            return;
        }
        for (int i = x; i>=0; i--){
            System.out.println(i);
        }
        System.out.println();
    }

    public void exercicio5(int x){
        int torcedorGremio = 0;
        for (int i = 0; i<x; i++){
            System.out.println("Digite o time que a "+(i+1)+"a pessoa torce: ");
            String time = scanner.nextLine();
            if(time.equalsIgnoreCase("Grêmio")){
                torcedorGremio++;
            }
        }
        System.out.println("Quantidade de torcedores Gremistas: "+torcedorGremio);
    }

    public double exercicio6(int x){
        double soma = 0;
        for (int i = 0; i<x; i++){
            System.out.println("Digite o "+(i+1)+"o número: ");
            double numero = scanner.nextDouble();
            soma+=numero;
        }
        return soma;
    }

    public void exercicio7(){
        double somaDosDez = 0;
        for (int i = 0; i<10; i++){
            System.out.println("Digite o "+(i+1)+"o número: ");
            double numero = scanner.nextDouble();
            somaDosDez+=numero;
        }
        System.out.println("\nA soma dos números digitados é: "+somaDosDez);
        System.out.println();
    }

    public void exercicio8(){
        System.out.println("Quantos números você quer digitar? ");
        int quant = scanner.nextInt();
        for (int i = 0; i<quant; i++){
            System.out.println("Digite o "+(i+1)+"o número: ");
            int numero = scanner.nextInt();
            if (numero == 0){
                System.out.println("O número é Zero.");
            }else if(numero < 0){
                System.out.println("Número negativo.");
            }else {
                System.out.println("Número Positivo.");
            }
        }
    }

    public void exercicio9(int val1, int val2){
        if (val1 > 0 && val2 > 0){
            int menor = Math.min(val1, val2);
            int maior = Math.max(val1, val2);
            for (int i = menor; i<= maior; i++){
                if (i%2==0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Erro, um ou mais valores são negativos.");
        }
    }

    public void exercicio10(){
        for (int i = 0; i<=198; i++){
            System.out.println(i);
        }
    }

    public void exercicio11(int n1, int n2){
        if (n1 > 0 && n2 > 0){
            int menor = Math.min(n1, n2);
            int maior = Math.max(n1, n2);
            for (int i = menor; i <= maior; i++){
                if (i%2==1){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Erro, um ou mais valores são negativos.");
        }
    }

    public void exercicio12(){
        int soma = 0;
        int quant = 0;
        for (int i = 0; i>=0; i=scanner.nextInt()){
            System.out.println("Digite um número Positivo (ou negativo para encerrar): ");
            i = scanner.nextInt();
            if (i>=0){
                quant++;
                soma+=i;
            }
        }
        if (quant>0){
            double media = (double) soma/quant;
            System.out.println("A média dos números digitados é: "+media);
        }else{
            System.out.println("Não foi digitado nenhum número Positivo.");
        }
    }

    public int exercicio13(int x){
        if (x<=0){
            System.out.println("Número Invalido.");
            return -1;
        }else{
            int fatorial = 1;
            for (int i = x; i>=1; i--){
                fatorial *=i;
            }
            return fatorial;
        }
    }

    public boolean exercicio14(int x){
        if (x <= 1){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(x); i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }

    public void exercicio15(int x){
        int soma = 0;
        for (int i = 2; i<=x; i++){
            if (exercicio14(i)){
                System.out.println(i);
                soma += i;
            }
        }
        System.out.println("Soma dos números primos entre 0 e "+x+": "+soma);
    }
}
