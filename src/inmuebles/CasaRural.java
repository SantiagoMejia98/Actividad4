package inmuebles;

public class CasaRural extends Casa{

    protected int distanciaCabecera;
    protected int altitud;
    protected static double valorArea = 1500000;

    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones,
                     int numeroBanos, int numeroPisos, int distanciaCabecera, int altitud){
        super(identificadorInmobiliario,area,direccion,numeroHabitaciones,numeroBanos,numeroPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    public void imprimir(){
        System.out.println("\nCasa rural");
        super.imprimir();
        System.out.println("Distancia la cabecera municipal: " + distanciaCabecera + " km");
        System.out.println("Altitud sobre el nivel del mar: " + altitud + " metros");
    }
}
