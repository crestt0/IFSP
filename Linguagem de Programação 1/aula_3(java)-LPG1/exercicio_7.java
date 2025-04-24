import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        List<String> lista = new ArrayList<>();
        
        lista.add ("Maçã");
        lista.add ("Banana");
        lista.add ("Pera");
        lista.add ("Laranja");
        
        Collections.reverse(lista);
        
        System.out.println(lista);
    }
}
