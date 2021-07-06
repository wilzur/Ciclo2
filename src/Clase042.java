import java.io.IOException;
import java.util.Scanner;

public class Clase042 {
    public static void main(String[] args) throws IOException {
     
     Scanner sc = new Scanner(System.in);
     //System.out.println("Por favor digite el salario: ");
     var salary = sc.nextDouble();
     var taxes = "";
     if(salary > 0.00 && salary <= 2000.00) {
         taxes = "Isento";
        }
     else if(salary >= 2000.01 && salary <= 3000.00) {
         taxes = "R$ " + (salary * 0.08);
        }
     else if(salary >= 3000.01 && salary <= 4500.00) {
         taxes = "R$ " + (salary * 0.18);
        }
     else if (salary > 4500.00) {
        taxes = "R$ " + Double.toString(salary * 0.28);
        }
     return taxes;
    }
}