package Mercado;

public class Prateleira {
    // Uma prateleira pode armazenar 3 produtos;
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;

    // Crie um construtor que recebe parâmetros para inicializar todos os atributos;
    public Prateleira(Produto produto1, Produto produto2, Produto produto3){
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
    }

    // Crie um construtor que não recebe parâmetros (ou seja, uma prateleira criada sem produtos);
    public Prateleira(){
        this.produto1 = null;
        this.produto2 = null;
        this.produto3 = null;
    }

    // Crie os métodos de acesso dos atributos (GET e SET);
    public Produto getProduto1(){
        return produto1;
    }
    public void setProduto1(Produto produto1){
        this.produto1 = produto1;
    }

    public Produto getProduto2(){
        return produto2;
    }
    public void setProduto2(Produto produto2){
        this.produto2 = produto2;
    }

    public Produto getProduto3(){
        return produto3;
    }
    public void setProduto3(Produto produto3){
        this.produto3 = produto3;
    }

    // Adiciona um produto na prateleira caso haja espaço, se não imprime mensagem de erro (Video Aula)
    public boolean adicionarProduto(Produto produto){
        if (produto1 == null){
            produto1 = produto;
            return true;
        }else if (produto2 == null){
            produto2 = produto;
            return true;
        }else if (produto3 == null){
            produto3 = produto;
            return true;
        }else {
            System.out.println("\nA prateleira está cheia.");
            return false;
        }
    }

    // Crie um método chamado produtoMaisCaro, que retorna o produto mais caro da prateleira (caso haja produtos). Atenção: este método retorna
    // o produto mais caro, ou seja, um objeto do tipo Produto.
    public Produto produtoMaisCaro(){
        if (produto1 == null && produto2 == null && produto3 == null){
            return null;
        }
        Produto maisCaro = produto1;
        if (produto2 != null && produto2.getPreco() > maisCaro.getPreco()){
            maisCaro = produto2;
        }
        if (produto3 != null && produto3.getPreco() > maisCaro.getPreco()){
            maisCaro = produto3;
        }
        return maisCaro;
    }

    // Crie o método toString.
    @Override
    public String toString(){
        String strProdutos = "";
        if (produto1 != null){
            strProdutos += produto1.toString()+"\n";
        }
        if (produto2 != null){
            strProdutos += produto2.toString()+"\n";
        }
        if (produto3 != null){
            strProdutos += produto3.toString()+"\n";
        }
        return strProdutos;
    }
}
