package cuenta;

import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Cuenta de ahorros");
        System.out.print("\nIngrese saldo inicial: $ ");
        float saldoInicialAhorros = input.nextFloat();
        System.out.print("Ingrese tasa de interés: ");
        float tasaAhorros = input.nextFloat();
        CuentaDeAhorros cuenta1 = new CuentaDeAhorros(saldoInicialAhorros, tasaAhorros);
        System.out.print("Ingresar cantidad a consignar: $ ");
        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        System.out.print("Ingresar cantidad a retirar: $ ");
        float cantidadRetirar = input.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
    }
}