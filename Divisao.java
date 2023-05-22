import java.util.Scanner;

public class Divisao {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int primeiroNumero = input.nextInt();

        System.out.println("Digite mais um número: ");

        int segundoNumero = input.nextInt();

        input.close();

        int resultado = primeiroNumero / segundoNumero;

        System.out.println("A divisão de " + primeiroNumero + " por " + segundoNumero + " é igual a " + resultado + "!");
    }
}
