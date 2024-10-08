package inmuebles;

public class Oficina extends Local{

    protected boolean esGobierno;
    protected static double valorArea = 3500000;

    public Oficina(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal, boolean esGobierno) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    public void imprimir(){
        System.out.println("\nOficina");
        super.imprimir();
        if(esGobierno){
            System.out.println("Es oficina del gobierno");
        }else{
            System.out.println("No es oficina del gobierno");
        }
    }
}
