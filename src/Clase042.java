import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Clase042 {
    public static void main(String[] args) throws IOException {
     
     Scanner sc = new Scanner(System.in);
     var salary = sc.nextDouble();
     var taxes = "";
     DecimalFormat df = new DecimalFormat("#.00");
     if(salary > 0.00 && salary <= 2000.00) {
         taxes = "Isento";
        }
     else if(salary >= 2000.01 && salary <= 3000.00) {
        Double tax1 = ((salary - 2000) * 0.08); 
        taxes = "R$ " + df.format(tax1);
        }
     else if(salary >= 3000.01 && salary <= 4500.00) {
        Double tax1 = ((1000 * 0.08) + ((salary - 3000.01) * 0.18));  
        taxes = "R$ " + df.format(tax1);
        }
     else if (salary > 4500.00) {
        Double tax1 = ((1000 * 0.08) + (1500 *0.18) + ((salary - 4500) *0.28)); 
        taxes = "R$ " + df.format(tax1);
        }
        System.out.println(taxes);
    }
}