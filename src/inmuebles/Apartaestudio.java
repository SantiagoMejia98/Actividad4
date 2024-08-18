package inmuebles;

public class Apartaestudio extends Apartamento{

    protected static double valorArea = 1500000;

    public Apartaestudio(int identificadorInmobiliario, int area, String direccion) {
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }

    public void imprimir(){
        super.imprimir();
    }
}
