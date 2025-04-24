import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String lista[] = new String[4];
        
        lista[0] = "Maçã";
        lista[1] = "Banana";
        lista[2] = "Pera";
        lista[3] = "Laranja";
        
        for (int i = 0; i < 4; i++){
            System.out.printf("%s, ", lista[i]);
        }

        int[] vetor = {30, 10, 50, 20, 40};

        for (int i = 0; i < 4; i++){
            System.out.printf("%s, ", vetor[i]);
        }
    }
}
