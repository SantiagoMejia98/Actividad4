package cuenta;

public class CuentaCorriente extends Cuenta {

    protected float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public void retirar(float cantidad) {
        if(cantidad > saldo) {
            sobregiro += cantidad - saldo;
            saldo = 0;
        }else{
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;
        if(sobregiro > 0) {
            if(residuo > 0) {
                sobregiro = 0;
                saldo = residuo;
            }else{
                sobregiro = -residuo;
                saldo = 0;
            }
        }else{
            super.consignar(cantidad);
        }
    }

    public void extractoMensual(){
        super.extractoMensual();
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor del sobregiro: $" + sobregiro);
    }
}
