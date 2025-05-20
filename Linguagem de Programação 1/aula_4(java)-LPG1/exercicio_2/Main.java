import java.util.TreeSet;
import java.util.Scanner;

public class Main {

    public static String procurar(String dataProcurada, TreeSet<Compromisso> compromissos){
        for (Compromisso c : compromissos){
            if (c.getData().equals(dataProcurada)){
                return "O Compromisso da data informada é o " + c.getDescricao();
            }
        }
        return "Nenhum compromisso na data informada";
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Compromisso compromisso1 = new Compromisso("12/06/2025", "9:30", "Conferência de artigos científicos");
        Compromisso compromisso2 = new Compromisso("20/06/2025", "12:30", "Almoço com amigos");
        Compromisso compromisso3 = new Compromisso("01/07/2025", "15:00", "Dentista");

        TreeSet<Compromisso> compromissos = new TreeSet<>();

        compromissos.add(compromisso1);
        compromissos.add(compromisso2);
        compromissos.add(compromisso3);

        System.out.println("Digite uma data (formato dd/mm/aaaa) a ser procurada nos compromissos: ");
        String dataProcurada = scan.nextLine();

        System.out.println(procurar(dataProcurada, compromissos));


    }
}
