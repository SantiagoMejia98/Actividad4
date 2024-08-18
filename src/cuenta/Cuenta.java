package cuenta;

public class Cuenta {


    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        saldo += cantidad;
        numeroConsignaciones++;
    }

    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void calcularInteres(){
        saldo *= 1 + tasaAnual / 12;
    }

    public void extractoMensual(){
        saldo -= comisionMensual;
        calcularInteres();
    }

    public void imprimir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de transacciones: " + (numeroConsignaciones + numeroRetiros));
    }
}
