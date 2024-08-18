package inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana {

    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;
    protected static double valorArea = 2500000;

    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administración: " + valorAdministracion);
        System.out.println("Tiene piscina?: " + tienePiscina);
        System.out.println("Tiene campos deportivos?: " + tieneCamposDeportivos);
    }

}
