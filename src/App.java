import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;*/

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        holaMundo();
        /*dataScan();*/
        datoBuffer();
        
    }
    public static void holaMundo() {
        var hola = "Hola mundo";
        System.out.println("Mi primer " + hola);
        System.out.println("Hello, World!");
    }
        public static void dataScan() {
        Scanner input = new Scanner(System.in);
		System.out.print("Por favor introduzca un texto: ");
		String x = input.nextLine();
		System.out.print("El texto introducido es: ");
		System.out.println(x);
		input.close();
    }
    public static void datoBuffer()throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Por favor ingrese su nombre: ");
		    String nombre = br.readLine();
		    System.out.println("Hola " + nombre);
            br.close(); //Es posible comentar para que se ejecute el Buffer y Scanner

    }
}