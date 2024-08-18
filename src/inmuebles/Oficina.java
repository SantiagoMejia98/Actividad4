package inmuebles;

public class Oficina extends Local{

    protected boolean esGobierno;
    protected static double valorArea = 3500000;

    public Oficina(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, boolean esGobierno) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Es oficina del gobierno'. " + esGobierno);
    }
}
