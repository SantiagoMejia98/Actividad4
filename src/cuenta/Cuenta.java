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
        System.out.println("Consignación exitosa");
    }

    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
            System.out.println("Retiro exitoso");
            System.out.println("Nuevo saldo: " + saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void calcularInteresMensual(){
        saldo *= 1 + tasaAnual / 12;
        System.out.println("Saldo despues de intereses mensuales: " + saldo);
    }

    public void extractoMensual(){
        saldo -= comisionMensual;
        calcularInteresMensual();
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", numeroConsignaciones=" + numeroConsignaciones +
                ", numeroRetiros=" + numeroRetiros +
                ", tasaAnual=" + tasaAnual +
                ", comisionMensual=" + comisionMensual +
                '}';
    }
}
