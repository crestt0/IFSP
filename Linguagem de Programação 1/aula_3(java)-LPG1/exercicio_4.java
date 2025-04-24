import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        List<Integer> numeros = new ArrayList<>();
        int[] vetor = {30, 10, 50, 20, 40};
        int aux, indexMenor, i, j;
        
        for (int a : vetor)
            numeros.add(a);
        
        //selection sort
        for (i = 0; i < numeros.size(); i++){
            indexMenor = i;
            for (j = i; j < numeros.size(); j++){
                if (numeros.get(j) < numeros.get(indexMenor)){
                    indexMenor = j;
                }
            }
            aux = numeros.get(indexMenor);
            numeros.set(indexMenor, numeros.get(i));
            numeros.set(i, aux);
        }
        
        Collections.sort(numeros);
        
        System.out.println(numeros);
    }
}
