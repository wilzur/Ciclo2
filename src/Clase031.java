import java.util.Scanner;

public class Clase031 {
  
    public static void main(String[] args) {
        int j = 2 + 3 -7;
        int c = 10 + 3 -7;
        int d = 5 + 8 * 4 - 2 * 6;
        int e = (5 + 8) * 4 - (2 * 6);
        int f = (5 + 8) * (4 - 2) * 6;
        System.out.println(j);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
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
