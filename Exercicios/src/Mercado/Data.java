package Mercado;

public class Data {
    // Uma data possui um dia, um mês e um ano
    private int dia;
    private int mes;
    private int ano;

    // Crie um construtor que recebe parâmetros para inicializar todos os atributos
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Crie o método toString e os métodos GET e SET dos atributos
    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    @Override
    public String toString(){
        return dia+"/"+mes+"/"+ano;
    }
}
