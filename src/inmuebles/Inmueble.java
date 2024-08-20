package inmuebles;

public class Inmueble {

    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    public Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    public double calcularPrecioVenta(double valorArea){
        precioVenta = valorArea * area;
        return precioVenta;
    }

    public void imprimir(){
        System.out.println("Identificador inmobiliario: " + identificadorInmobiliario);
        System.out.println("Área: " + area + " metros cuadrados");
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio de venta: $ " + precioVenta);
    }
}
