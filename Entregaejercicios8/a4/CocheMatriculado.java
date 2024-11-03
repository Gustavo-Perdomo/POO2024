/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Entregaejercicios8.a4;

/**
 *
 * @author Gustavo Perdomo 20241220595
 */
public class CocheMatriculado extends Coche {

    private final int anioMatriculacion;
    private final int mesMatriculacion;
    private double impuestoMatriculacion;


    public CocheMatriculado(String marca, String color, double precio, double factorContaminacion, int anio,
                            int anioMatriculacion, int mesMatriculacion, String matricula, String dniTitular) {
        super(marca, color, precio, factorContaminacion, anio);
        this.anioMatriculacion = anioMatriculacion;
        this.mesMatriculacion = mesMatriculacion;
        this.setMatricula(matricula);
        this.setDniTitular(dniTitular);
        calculaImpuestoMatriculacion();
    }


    public int getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public int getMesMatriculacion() {
        return mesMatriculacion;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion() {
        calculaImpuestoMatriculacion();
    }


    private void calculaImpuestoMatriculacion() {
        impuestoMatriculacion = getPrecio() / 20;
        int edadCoche = anioMatriculacion - getAnio();
        if (edadCoche > 10) {
            impuestoMatriculacion += 100;
        }
    }
}
