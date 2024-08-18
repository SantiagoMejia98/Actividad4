package cuenta;

public class CuentaDeAhorros extends Cuenta{

    protected boolean activa;

    public CuentaDeAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);

        if(saldo < 10000){
            this.activa = false;
        }else{
            this.activa = true;
        }
    }

    public void consignar(float cantidad){
        if(activa){
            super.consignar(cantidad);
        }else{
            System.out.println("La cuenta no esta activa");
        }
    }

    public void retirar(float cantidad){
        if(activa){
            super.retirar(cantidad);
        }else{
            System.out.println("La cuenta no esta activa");
        }
    }

    public void extractoMensual(){
        if(numeroRetiros > 4){
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();

        if(saldo < 10000){
            this.activa = false;
        }
    }

    public void imprimir(){
        super.imprimir();
    }
}
