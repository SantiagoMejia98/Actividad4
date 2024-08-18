package inmuebles;

public class ApartamentoFamiliar extends Apartamento {

    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int valorArea) {
        super(identificadorInmobiliario,area,direccion,numeroHabitaciones,numeroBanos);
        this.valorArea = valorArea;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administración: $" + valorAdministracion);
    }


}
