package inmuebles;

public class CasaIndependiente extends CasaUrbana {

    protected static double valorArea = 3000000;

    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones,
                             int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
    }

    public void imprimir(){
        super.imprimir();
    }
}
