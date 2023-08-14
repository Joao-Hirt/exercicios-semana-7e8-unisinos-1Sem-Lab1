package Funcionario;
import java.sql.SQLOutput;
import java.util.Scanner;

// Esta classe possui apenas o método “public static void main(String args[])”
public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Neste método, crie um objeto do tipo FuncionarioCaixa, chamado funcionario. Tudo que for necessário para criar este objeto,
        // deve ser solicitado pelo Teclado.
        System.out.println("Digite o nome do Funcionário: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o endereço do Funcionário: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite o sexo do Funcionário: ");
        String sexo = scanner.nextLine();
        System.out.println("Digite a cor da Calculadora: ");
        String cor = scanner.nextLine();
        Calculadora calculadora = new Calculadora(cor);
        FuncionarioCaixa funcionario = new FuncionarioCaixa(nome, endereco, sexo, calculadora);

        //Imprima o resultado das operações: 2+2, 5-4, 2x3, 6/3, 72, 83. As operações devem ser feitas através da calculadora do objeto funcionário criado.
        System.out.println("\nResultado das operações: ");
        System.out.println("\n2+2 = "+funcionario.soma(2,2));
        System.out.println("\n5-4 = "+funcionario.subtrai(5,4));
        System.out.println("\n2x3 = "+funcionario.multiplica(2,3));
        System.out.println("\n6/3 = "+funcionario.divide(6,3));
        System.out.println("\n72² = "+funcionario.elevaAoQuadrado(72));
        System.out.println("\n83³ = "+funcionario.elevaAoCubo(83));

        //Neste método, crie um objeto do tipo Empresa chamado empresa1, com nome solicitado pelo usuário via Teclado, com o funcionário criado
        //anteriormente e um novo funcionário que deve ser criado. Tudo que for necessário para criar esta empresa (que já não tenha sido criado)
        // deve ser solicitado pelo Teclado.
        System.out.println("\nDigite o nome da Empresa: ");
        String nomeEmpresa = scanner.nextLine();
        System.out.println("Digite o nome do Funcionário 2: ");
        String nomeFuncionario2 = scanner.nextLine();
        System.out.println("Digite o endereço do Funcionário 2: ");
        String enderecoFuncionario2 = scanner.nextLine();
        System.out.println("Digite o sexo do Funcionário 2: ");
        String sexoFuncionario2 = scanner.nextLine();
        System.out.println("Digite a cor da Calculadora 2: ");
        String corFuncionario2 = scanner.nextLine();
        Calculadora calculadora2 = new Calculadora(corFuncionario2);
        FuncionarioCaixa funcionario2 = new FuncionarioCaixa(nomeFuncionario2, enderecoFuncionario2, sexoFuncionario2, calculadora2);
        Empresa empresa1 = new Empresa(nomeEmpresa, funcionario, funcionario2);

        // Imprima as informações desta empresa.
        System.out.println("\nInformações da Empresa: ");
        System.out.println("Nome da Empresa: "+empresa1.getNomeEmpresa());
        System.out.println("Funcionário 1: "+empresa1.getFuncionario1().getNome()+" - "+empresa1.getFuncionario1().getSexo());
        System.out.println("Cor da Calculadora do Funcionário 1: "+empresa1.getFuncionario1().getCalculadora().getCor());
        System.out.println("Funcionário 2: "+empresa1.getFuncionario2().getNome()+" - "+empresa1.getFuncionario2().getSexo());
        System.out.println("Cor da Calculadora do Funcionário 1: "+empresa1.getFuncionario2().getCalculadora().getCor());
    }
}
