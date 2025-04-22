import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        List<String> lista = new ArrayList<>();
        
        lista.add ("Maçã");
        lista.add ("Banana");
        lista.add ("Pera");
        lista.add ("Laranja");

        lista.remove("Pera");
        
        //int PosicaoBanana = lista.indexOf("Banana");
        //lista.set(PosicaoBanana, "Abacaxi");
        
        lista.set(lista.indexOf("Banana"), "Abacaxi");
        
        System.out.println(lista);
    }
}
