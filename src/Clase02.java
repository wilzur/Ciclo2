import java.util.Scanner;

public class Clase02 {
    public static void main (String[] args) {

        entreNumero();

    }

    public static void entreNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un número: ");
        int a = sc.nextInt();
        int b = a * 10;
        System.out.println("El número digitado por 10 es: " + b);
    }
}