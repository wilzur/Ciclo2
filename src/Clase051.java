//Ejercicio 6 de la unidad 1
import java.util.Scanner;
public class Clase051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese el género (H/M): ");
        //String genero = sc.next();
        char genero = sc.next().charAt(0);
        System.out.println("Genero digitado: " + genero);
        //var pesoIdeal = 0.00;
        //if(genero.equals("H")){
        if(genero == 'H'){
            System.out.print("Por favor ingrese la altura (cm): ");
            var altura = sc.nextInt();
            System.out.println("Altura: " + altura + "cm");
            int pesoIdeal = altura - 110;
            System.out.print("Su peso ideal es: " + pesoIdeal + "kg");
        }
        //else if (genero.equals("M")) {
        else if(genero == 'M') {    
            System.out.print("Por favor ingrese la altura (cm): ");
            var altura = sc.nextInt();
            System.out.println("Altura: " + altura + "cm");
            int pesoIdeal = altura - 120;
            System.out.print("Su peso ideal es: " + pesoIdeal + "kg");
        }
        else{
            System.out.println("El genero digitado " + genero + " no es correcto");
        }
    }
}