
//Reto Unidad 1 - Ciclo 2


public class NuevaInversion {
        
    public double interesSimple = 0;
    public double interesCompuesto = 0;
    public double diferencia = 0;

    public NuevaInversion(int pTiempo, double pCapital, double pInteres)
    {
        interesCompuesto = pCapital * ((Math.pow(1 + (pInteres / 100), pTiempo) -1));
        interesSimple = pCapital * (pInteres / 100) * pTiempo;
        diferencia = Math.round(interesCompuesto - interesSimple);
    }

    public NuevaInversion()
    {
    }

    public double calcularInteresSimple()
    {
        return Math.round(interesSimple);
    }
    
    public double calcularInteresCompuesto()
    {
        return Math.round(interesCompuesto);
    }
 public double compararInversion(int pTiempo, int pCapital, double pInteres)
    {
        interesCompuesto = pCapital * ((Math.pow(1 + (pInteres / 100), pTiempo) -1));
        interesSimple = pCapital * (pInteres / 100) * pTiempo;
        diferencia = Math.round(interesCompuesto - interesSimple);
        return diferencia;
    }
    
    public double compararInversion()
    {
        return Math.round(diferencia);
    }
//}

public static void main(String[] args)
{
    NuevaInversion ni = new NuevaInversion();
    System.out.println(ni.calcularInteresSimple());
    System.out.println(ni.calcularInteresCompuesto());
    System.out.println(ni.compararInversion(3,5000000,3));
    
    NuevaInversion n2 = new NuevaInversion(3,5000000,3);
    System.out.println(n2.calcularInteresSimple());
    System.out.println(n2.calcularInteresCompuesto());
    System.out.println(n2.compararInversion());
}
}
