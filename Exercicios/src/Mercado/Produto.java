package Mercado;

public class Produto {
    // Um produto possui um nome, um preço e uma data de validade (objeto do tipo Data).
    private String nome;
    private double preco;
    private Data dataValidade;

    // Crie um construtor que recebe parâmetros para inicializar todos os atributos.
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // Crie o método toString e os métodos GET e SET dos atributos.
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public Data getDataValidade(){
        return dataValidade;
    }
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString(){
        return "\nNome do Produto: "+nome+"\nPreço do Produto: "+preco+"\nValidade do Produto: "+dataValidade;
    }

    // Crie um método chamado verificaProdutoVencido, que recebe uma Data por parâmetro. Este método compara a data recebida por parâmetro
    // com a data de vencimento do produto, retornando verdadeiro caso o produto esteja vencido naquela data e falso caso contrário.

    public boolean verificaProdutoVencido(Data dataAtual){
        if (dataAtual.getAno() > dataValidade.getAno()){
            return true;
        }else if (dataAtual.getAno() == dataValidade.getAno() && dataAtual.getMes() > dataValidade.getMes()){
            return true;
        }else if (dataAtual.getAno() == dataValidade.getAno() && dataAtual.getDia() == dataValidade.getMes() && dataAtual.getDia() > dataValidade.getDia()){
            return true;
        }else{
            return false;
        }
    }
}
