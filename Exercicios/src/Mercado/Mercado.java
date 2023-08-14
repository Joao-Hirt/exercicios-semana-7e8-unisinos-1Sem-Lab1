package Mercado;

public class Mercado {
    // Um mercado possui 2 prateleiras;
    private Prateleira prateleiraA;
    private Prateleira prateleiraB;

    // Crie um construtor que recebe parâmetros para inicializar todos os atributos
    public Mercado(Prateleira prateleiraA, Prateleira prateleiraB){
        this.prateleiraA = prateleiraA;
        this.prateleiraB = prateleiraB;
    }

    // Crie os métodos GET dos atributos (não é necessário fazer SET);
    public Prateleira getPrateleiraA(){
        return prateleiraA;
    }

    public Prateleira getPrateleiraB(){
        return prateleiraB;
    }

    // Crie o método mediaValorProdutos, que retorna a média do preço dos produtos que estão nas prateleiras do mercado.
    // Atenção: algumas prateleiras podem ter 1, 2 ou até mesmo não ter produtos;
    public double mediaValorProdutos(){
        int qtdProdutos = 0;
        double somaPrecos = 0.0;

        if (prateleiraA.getProduto1() != null){
            qtdProdutos++;
            somaPrecos += prateleiraA.getProduto1().getPreco();
        }
        if (prateleiraA.getProduto2() != null){
            qtdProdutos++;
            somaPrecos += prateleiraA.getProduto2().getPreco();
        }
        if (prateleiraA.getProduto3() != null){
            qtdProdutos++;
            somaPrecos += prateleiraA.getProduto3().getPreco();
        }

        if (prateleiraB.getProduto1() != null){
            qtdProdutos++;
            somaPrecos += prateleiraB.getProduto1().getPreco();
        }
        if (prateleiraB.getProduto2() != null){
            qtdProdutos++;
            somaPrecos += prateleiraB.getProduto2().getPreco();
        }
        if (prateleiraB.getProduto3() != null){
            qtdProdutos++;
            somaPrecos += prateleiraB.getProduto3().getPreco();
        }

        if (qtdProdutos == 0){
            return 0;
        }else{
            return somaPrecos/qtdProdutos;
        }

    }
}
