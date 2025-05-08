import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		HashSet<Produto> produtos = new HashSet();
        Scanner scan = new Scanner(System.in);

        System.out.println("digite: ");
        int n = scan.nextInt();
        System.out.println(n);
        
		Produto produto1 = new Produto(111, "Leite", 5.5);
        Produto produto2 = new Produto(222, "Pão", 2.65);
        Produto produto3 = new Produto(333, "Açúcar", 4);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        // Verificar se um produto com um código específico está no conjunto
        System.out.println("Digite o código do produto que deseja procurar: ");
        int codigoProcurar = scan.nextInt();
        
        Iterator<Produto> iterar = produtos.iterator();

        while (iterar.hasNext()) {
            System.out.println(iterar.next());
        }
	}
}
