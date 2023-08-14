package Funcionario;

//Uma empresa tem um nome e dois funcionários do caixa;
public class Empresa{
    private String nomeEmpresa;
    private FuncionarioCaixa funcionario1;
    private FuncionarioCaixa funcionario2;

    // Crie três construtores: um que recebe todos os parâmetros para inicializar os atributos; outro que recebe apenas o nome da empresa,
    // inicializando os funcionários em null; outro que não recebe parâmetros, inicializando os funcionários em null e o nome com algum valor padrão.
    public Empresa(){
        this.nomeEmpresa = "Nome não Cadastrado";
        this.funcionario1 = null;
        this.funcionario2 = null;
    }

    public Empresa (String nomeEmpresa, FuncionarioCaixa funcionario1, FuncionarioCaixa funcionario2){
        this.nomeEmpresa = nomeEmpresa;
        this.funcionario1 = funcionario1;
        this.funcionario2 = funcionario2;
    }

    public Empresa (String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
        this.funcionario1 = null;
        this.funcionario2 = null;
    }

    // Crie os métodos de acesso dos atributos desta classe (get e set).
    public String getNomeEmpresa(){
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }

    public FuncionarioCaixa getFuncionario1(){
        return funcionario1;
    }
    public void setFuncionario1(FuncionarioCaixa funcionario1){
        this.funcionario1 = funcionario1;
    }

    public FuncionarioCaixa getFuncionario2(){
        return funcionario2;
    }
    public void setFuncionario2(FuncionarioCaixa funcionario2){
        this.funcionario2 = funcionario2;
    }

    // Crie um método “imprimeInfo”, que imprime as informações da classe.
    public void imprimeInfo(){
        System.out.println("Nome da Empresa: "+nomeEmpresa);
        System.out.println("Funcionário do Caixa 1: "+funcionario1);
        System.out.println("Funcionário do Caixa 2: "+funcionario2);
    }
}
