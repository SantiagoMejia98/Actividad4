package cuenta;

public class CuentaCorriente extends Cuenta {

    protected float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public void retirar(float cantidad) {
        float resultado = saldo - cantidad;
        if(resultado < 0) {
            sobregiro -= resultado;
            super.retirar(saldo);
        }else{
            super.retirar(cantidad);
        }
        System.out.println("Sobregiro: " + sobregiro);
    }

    public void consignar(float cantidad) {
        float residuo = cantidad - sobregiro;
        if(sobregiro > 0) {
            if(residuo > 0) {
                sobregiro = 0;
                super.consignar(residuo);
            }else{
                sobregiro = -residuo;
                super.consignar(0);
            }
            System.out.println("Sobregiro: " + sobregiro);
        }else{
            super.consignar(cantidad);
        }
    }

    public void extractoMensual(){
        super.extractoMensual();
    }

    public void imprimir(){
        System.out.println("\nCuenta corriente");
        super.imprimir();
        System.out.println("Valor del sobregiro: $ " + sobregiro);
    }
}
