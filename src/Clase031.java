import java.util.Scanner;

public class Clase031 {
  
    public static void main(String[] args) {
        int a = 2 + 3 -7;
        int b = 10 + 3 -7;
        int c = 5 + 8 * 4 - 2 * 6;
        int d = (5 + 8) * 4 - (2 * 6);
        int e = (5 + 8) * (4 - 2) * 6;
        System.out.println("L variable a es: " + a);
        System.out.println("L variable b es: " + b);
        System.out.println("L variable c es: " + c);
        System.out.println("L variable d es: " + d);
        System.out.println("L variable e es: " + e);
        elsaludo();
    }
    public static void elsaludo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite el nombre: ");
        var nombre = sc.nextLine();
        //var nombre = " Willian Sanchez";
        var resultado = saludo(nombre);
        System.out.println(resultado);
    }
    public static String saludo(String nombre){
        return "Hola " + nombre + "!";
    }
}
