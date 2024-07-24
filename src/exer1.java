import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer1 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("coloque um nome aleatório:");
        String n = scanner.nextLine();

        List<String> nomes = new ArrayList<>();
        nomes.add (n);

        for (int i = 0; i < 5; i++) {

        }

        System.out.println(nomes.get((int)(Math.random()*nomes.size())));
    }
}
