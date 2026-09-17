import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a seu Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua Idade:");
        int idade = scanner.nextInt();

        System.out.println("Óla " + nome + " Você tem " + idade + " anos");

    }
}