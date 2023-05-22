import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiro_numero = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundo_numero = input.nextInt();

        input.close();
        
        int resultado = primeiro_numero - segundo_numero;

        System.out.println("A subtração de " + primeiro_numero + " por " + segundo_numero + " é: " + resultado);
        
    }
}