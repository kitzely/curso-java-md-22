public class Operaciones {
    public int numero1;
    public int numero2;

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Suma
    public void suma(){
        int suma = numero1 + numero2;
        System.out.println("Suma = " +suma);
    }

    // Resta
    public void resta(){
        int resta = numero1 - numero2;
        System.out.println("Resta = " +resta);
    }

    //Multiplicacion
    public void multiplicacion(){
        int multiplicacion = numero1 * numero2;
        System.out.println("Multiplicacion = " +multiplicacion);
    }

    //Division
    public void division(){
        int division = numero1 / numero2;
        System.out.println("Division = " +division);
    }
}
