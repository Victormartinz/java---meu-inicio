import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome +" Digite a sua Primeira nota: ");
        int notaUm = scanner.nextInt();

        System.out.println("Digite a sua segunda nota: ");
        int notaDois = scanner.nextInt();

        int media = (notaUm + notaDois) / 2;

        if (media >= 7){
            System.out.println("Olá " + nome + " Você está aprovado.");
            System.out.println("Sua Media: " + media);
        } else if (media >= 5) {
            System.out.println("Olá " + nome + " Você está de recuperação.");
            System.out.println("Sua Media: " + media);
        }
        else {
            System.out.println("Olá " + nome + " Você está reprovado");
            System.out.println("Sua Media: " + media);
        }

    }
}