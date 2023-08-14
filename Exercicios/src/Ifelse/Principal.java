package Ifelse;
//Crie uma classe chamada Principal. Nela, coloque o método main. No main, faça o que se pede;
public class Principal {
    public static void main(String[] args) {
        //Crie as pessoas;
        Pessoa p1 = new Pessoa("Joaquim","M",19,1.78,0,"Rua C, 145");
        Pessoa p2 = new Pessoa("Manuelita", "F", 30, 1.67, 3, "Rua dos Camelos, 12");
        Pessoa p3 = new Pessoa("Pedro", "M", 10, 1.91, 1, "Rua dos Gigantes, 189");

        //Imprima as informações de todas as pessoas, de forma legível e organizada;
        p1.imprimeInformacoes();
        p2.imprimeInformacoes();
        p3.imprimeInformacoes();

        //Imprima na tela a frase “Filho único” ou “Filha única” para as pessoas que foram filhas únicas, e a frase “Não é filho único” ou
        //“Não é filha única” para as pessoas que não forem filhas únicas;
        if(p1.isFilhoUnico()){
            System.out.println("\n"+p1.getNome()+" é filho único.");
        }else{
            System.out.println("\n"+p1.getNome()+" não é filho único.");
        }

        if(p2.isFilhoUnico()){
            System.out.println(p2.getNome()+" é filha única.");
        }else{
            System.out.println(p2.getNome()+" não é filha única.");
        }

        if(p3.isFilhoUnico()){
            System.out.println(p3.getNome()+" é filho único.");
        }else{
            System.out.println(p3.getNome()+" não é filho único.");
        }
    }
}
