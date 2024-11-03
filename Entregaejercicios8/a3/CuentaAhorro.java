/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a3;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class CuentaAhorro extends Cuenta {
    // Atributo privado
    private double saldoMinimo;

    // Constructor parametrizado
    public CuentaAhorro(Persona cliente, long numeroCuenta, double saldoMinimo) {
        super(cliente, numeroCuenta);
        this.saldoMinimo = saldoMinimo;
    }

    // Métodos de acceso para saldoMinimo
    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    // Implementación del método retirar
    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && (getSaldo() - cantidad) >= saldoMinimo) {
            setSaldo(getSaldo() - cantidad);
        } else {
            System.out.println("No se puede retirar la cantidad solicitada debido al saldo mínimo.");
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "numeroCuenta=" + getNumeroCuenta() +
                ", saldo=" + getSaldo() +
                ", cliente=" + getCliente().getNombre() +
                ", saldoMinimo=" + saldoMinimo +
                '}';
    }
}

