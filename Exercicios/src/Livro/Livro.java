package Livro;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;
    private int qtdPaginas;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.qtdPaginas = qtdPaginas;
    }

    public Livro(String titulo, String autor, int anoPublicacao, double preco, int qntPaginas1){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQtdPaginas(){
        return qtdPaginas;
    }
    public void setQtdPaginas(int qtdPaginas){
        this.qtdPaginas = qtdPaginas;
    }

    public double calculaPrecoPorPagina(){
        return preco/qtdPaginas;
    }

    @Override
    public String toString(){
        return "Livro {Titulo: "+titulo+", Autor: "+autor+", Ano de Publicação: "+anoPublicacao+", Quantidade de Páginas: "+qtdPaginas+". Preço: "+preco+"}";
    }
}
