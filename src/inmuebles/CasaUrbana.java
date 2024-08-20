package inmuebles;

public class CasaUrbana extends Casa{

    public CasaUrbana(int identificadorInmobiliario, int area, String direccion,
                      int numeroHabitaciones, int numeroBanos, int numeroPisos){
        super(identificadorInmobiliario,area,direccion,numeroHabitaciones,numeroBanos,numeroPisos);
    }

    public void imprimir(){
        super.imprimir();
    }
}
