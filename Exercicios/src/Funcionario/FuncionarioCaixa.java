package Funcionario;

//Possui um nome, um endereço, um sexo e uma calculadora;
public class FuncionarioCaixa{
    private String nome;
    private String endereco;
    private String sexo;
    private Calculadora calculadora;

    //Crie dois construtores: um não recebe parâmetros (inicializa os atributos com algum valor padrão)
    public FuncionarioCaixa(){
        this.nome = "Nome não Cadastrado";
        this.endereco = "Endereço não Cadastrado";
        this.sexo = "Sexo não Cadastrado";
        this.calculadora = new Calculadora("Preto");
    }

    //O outro recebe os parâmetros para inicializar todos os atributos
    public FuncionarioCaixa(String nome, String endereco, String sexo, Calculadora calculadora){
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.calculadora = calculadora;
    }

    //Crie os métodos de acesso dos atributos desta classe (get e set)
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public Calculadora getCalculadora(){
        return this.calculadora;
    }
    public void setCalculadora(Calculadora calculadora){
        this.calculadora = calculadora;
    }

    //Crie os métodos soma, subtrai, multiplica, divide, elevaAoQuadrado e elevaAoCubo. Cada método destes deve chamar o método correspondente da calculadora, retornando o valor obtido na operação.
    public double soma(double a, double b){
        return this.calculadora.soma(a,b);
    }

    public double subtrai(double a, double b){
        return this.calculadora.subtrai(a,b);
    }

    public double multiplica(double a, double b){
        return this.calculadora.multiplica(a,b);
    }

    public double divide(double a, double b){
        return this.calculadora.divide(a,b);
    }

    public int elevaAoQuadrado(int a){
        return this.calculadora.elevaAoQuadrado(a);
    }

    public int elevaAoCubo(int a){
        return this.calculadora.elevaAoCubo(a);
    }

    //Crie um método chamado “imprimeInfo”, que não recebe parâmetros de entrada e imprime na tela as informações da classe, inclusive da calculadora (sem as operações, apenas os atributos).
    public void imprimeInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Sexo: "+sexo);
        System.out.println("Cor Calculadora: "+calculadora.getCor());
        System.out.println("Memória Calculadora: "+calculadora.getMemoria());
    }



}
