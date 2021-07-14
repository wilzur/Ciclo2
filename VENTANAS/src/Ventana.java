import javax.swing.JOptionPane;

public class Ventana {


    public static void main(String[] args) {
        
        String cadena;
        int entero;
        char letra;
        double decimal1;
        
        //Solicita datos por ventana
        cadena  =   JOptionPane.showInputDialog("Digite una cadena: ");
        entero  =   Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        letra   =   JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal1=   Double.parseDouble(JOptionPane.showInputDialog("Digite un número decimal: "));
        
        //Impresión de los datos digitados arriba
        JOptionPane.showMessageDialog(null, "La cadena de texto es: " + cadena);
        JOptionPane.showMessageDialog(null, "El número entero es: " + entero);
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);
        JOptionPane.showMessageDialog(null, "El número decimal es: " + decimal1);
    }
    
}