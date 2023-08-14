package Ifelse;
// Crie uma classe chamada Pessoa. Uma pessoa possui nome, sexo, idade, altura, quantidade de irmãos e endereço.
// Crie o construtor e os métodos de acesso dos atributos
public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    private double altura;
    private int quantIrmaos;
    private String endereco;

    public Pessoa(String nome, String sexo, int idade, double altura, int quantIrmaos, String endereco){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.quantIrmaos = quantIrmaos;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public int getQuantIrmaos(){
        return quantIrmaos;
    }
    public void setQuantIrmaos(int quantIrmaos){
        this.quantIrmaos = quantIrmaos;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    //Na classe Pessoa, crie um método chamado imprimeInformacoes, que não recebe parâmetros e imprima na tela as informações da pessoa de maneira organizada;
    public void imprimeInformacoes(){
        System.out.println("\nI N F O R M A Ç Õ E S");
        System.out.println("Nome: "+nome);
        System.out.println("Sexo: "+sexo);
        System.out.println("Idade: "+idade+" anos");
        System.out.println("Altura: "+altura);
        System.out.println("Quantidade de Irmãos: "+quantIrmaos);
        System.out.println("Endereço: "+endereco);
    }

    //Na classe Pessoa, crie um método chamado isFilhoUnico, que retorna verdadeiro caso a pessoa seja filha única e falso caso contrário;
    public boolean isFilhoUnico(){
        if (quantIrmaos == 0){
            return true;
        }else{
            return false;
        }
    }
}
