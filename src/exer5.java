import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {

        // parte do código que imprime ha tela

        Scanner scanner = new Scanner(System.in);
        System.out.println("busque nomes de comidas:");
        String nome = scanner.nextLine();

        // adicionando lista

        List<String> nomesfrutas = new ArrayList<>();

        System.out.println(nomesfrutas);
    }
}




// Faça um programa que adicionei e busque nomes de comidas em uma lista.
// Nenhum nome de comida pode ter menos de 3 letras