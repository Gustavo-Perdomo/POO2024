/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a3;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class CuentaCorriente extends Cuenta {

    private double maximoRetirable;

  
    public CuentaCorriente(Persona cliente, long numeroCuenta, double maximoRetirable) {
        super(cliente, numeroCuenta);
        this.maximoRetirable = maximoRetirable;
    }

  
    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    public void setMaximoRetirable(double maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }


    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= maximoRetirable && cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
        } else {
            System.out.println("No se puede retirar la cantidad solicitada.");
        }
    }

 
    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroCuenta=" + getNumeroCuenta() +
                ", saldo=" + getSaldo() +
                ", cliente=" + getCliente().getNombre() +
                ", maximoRetirable=" + maximoRetirable +
                '}';
    }
}

