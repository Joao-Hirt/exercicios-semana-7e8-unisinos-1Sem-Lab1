package While;

public class Exercicios {
    public void contador(int x){
        while (x <= 300){
            System.out.println(x);
            x++;
        }
    }

    public void imprimePares(int x){
        if (x<=0){
            System.out.println("ERRO!");
        }else{
            while (x>0){
                if (x%2==0){
                    System.out.println(x);
                    x--;
                }else{
                    x--;
                }
            }
        }
    }

    public boolean verificaPrimo(int x){
        if (x <= 1){
            return false;
        }
        int i = 2;
        while (i < x){
            if (x%i==0){
                return false;
            } i++;
        } return true;
    }
}
