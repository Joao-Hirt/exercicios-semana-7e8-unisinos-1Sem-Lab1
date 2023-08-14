package Funcionario;

import java.sql.SQLOutput;

// Uma calculadora possui uma memória e uma cor;
public class Calculadora{
    private double memoria;
    private String cor;

    // Quando uma calculadora é criada, a memória deve ser inicializada com 0 e a cor deve ser recebida por parâmetro (construtor)
    public Calculadora(String cor){
        this.memoria = 0;
        this.cor = cor;
    }

    // Crie os métodos de acesso para os atributos da classe (get e set)
    public double getMemoria(){
        return this.memoria;
    }
    public void setMemoria(double memoria){
        this.memoria = memoria;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Crie os métodos: soma, subtrai, multiplica e divide. Todos recebem dois valores (double) por parâmetro e retornam o valor da operação realizada.
    public double soma(double a, double b){
        this.memoria = a+b;
        return this.memoria;
    }

    public double subtrai(double a, double b){
        this.memoria = a-b;
        return this.memoria;
    }

    public double multiplica(double a, double b){
        this.memoria = a*b;
        return this.memoria;
    }

    public double divide(double a, double b){
        this.memoria = a/b;
        return this.memoria;
    }

    // Crie os métodos elevaAoQuadrado e elevaAoCubo. Ambos recebem apenas um valor (int) e retornam o valor da operação realizada.
    public int elevaAoQuadrado(int a){
        this.memoria = a*a;
        return (int) this.memoria;
    }

    public int elevaAoCubo(int a){
        this.memoria = a*a*a;
        return (int) this.memoria;
    }

    // Crie um método “imprimeInfo”, que não recebe parâmetros e simplesmente imprime as informações da calculadora de maneira legível e organizada.
    public void imprimeInfo(){
        System.out.println("C A L C U L A D O R A");
        System.out.println("Cor: "+this.cor);
        System.out.println("Memória: "+this.memoria);
    }


}
