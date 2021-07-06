import java.util.Scanner;


public class Clase032 {
    public static void main(String[] args) {
        //(21/06/1971)  = 21+06+1971 = 1998 = 1+9+9+8 = 27
        var sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha de nacimiento (dd/mm/yyy): ");
        var fecha = sc.next();
        System.out.println(fecha);
        //System.out.println(fecha.trim());
        fecha = fecha.trim();
        //21/09/1971
        fecha = fecha.replaceAll("/", "");
        System.out.println(fecha);
        
        int dia = Integer.valueOf(fecha.substring(0,2));
        System.out.print(dia);
        
        int mes = Integer.valueOf(fecha.substring(2,4));
        System.out.print(mes);
        
        int anio = Integer.valueOf(fecha.substring(4));
        System.out.println(anio);

        int suma1 = dia + mes + anio;
        System.out.println(suma1);
        
        //int aux = (dia / 10) + (dia % 10) + (mes / 10) + (mes % 10) + anio;
        int numeroSuerte = 0;

        while (suma1 != 0) {
            //System.out.print("digito: " + suma1);
            numeroSuerte += (suma1 % 10);
            suma1 /= 10;
        }
        System.out.println(numeroSuerte);

        /*int dig1 = Integer.valueOf(suma1.Integer(0,1));
        System.out.println(dig1);
        */
        /*int suma2 = 0;
        while(suma2 != 0){
            suma1 %= 10;
            suma2 += suma1;
            break;
        }
        System.out.println(suma2);
        */

    }
}
