import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static String procurar(int codigoProcurado, HashSet<Produto> produtos){
        for (Produto p : produtos){
            if (p.getCodigo() == codigoProcurado){
                return "O produto com o código digitado é o " + p.getNome();
            }
        }
        return "Nenhum produto apresenta o código fornecido";
    }

    public static String remover(int codigoRemovido, HashSet<Produto> produtos) {
        for (Produto p : produtos){
            if (p.getCodigo() == codigoRemovido){
                produtos.remove(p);
                return "Elemento removido com sucesso";
            }
        }
        return "O código digitado não é correspondente a nenhum elemento da lista";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Produto produto1 = new Produto(111, "Leite", 5.0);
        Produto produto2 = new Produto(222, "Açucar", 3.5);
        Produto produto3 = new Produto(333, "Arroz", 4.75);

        HashSet<Produto> produtos = new HashSet<>();

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println("Digite o código do produto a ser procurado no HashSet: ");
        int codigoProcurado = scan.nextInt();

        System.out.println(procurar(codigoProcurado, produtos));

        System.out.println("Digite o código do produto a ser removido do HashSet: ");
        int codigoRemovido = scan.nextInt();

        System.out.println(remover(codigoRemovido, produtos));

        System.out.println("Produtos do conjunto: ");
        for (Produto p : produtos){
            System.out.println(p.toString());
        }
    }
}
