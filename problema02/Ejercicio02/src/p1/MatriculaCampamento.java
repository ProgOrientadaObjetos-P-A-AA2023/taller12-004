/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author reroes
 */
public class MatriculaCampamento extends Matricula {

    private double costoTransporte;
    private double costoComida;
    private double costoInstructores;

    public MatriculaCampamento(double costoT, double costoC, double costoI) {
        costoTransporte = costoT;
        costoComida = costoC;
        costoInstructores = costoI;
    }

    public void establecerCostoTransporte(double n) {
        costoTransporte = n;
    }

    public void establecerCostoComida(double n) {
        costoComida = n;
    }

    public void establecerCostoInstructores(double n) {
        costoInstructores = n;
    }

    public double obtenerCostoTransporte() {
        return costoTransporte;
    }

    public double obtenerCostoComida() {
        return costoComida;
    }

    public double obtenerCostoInstructores() {
        return costoInstructores;
    }

    @Override
    public void establecerTarifa() {
        tarifa = costoTransporte + costoComida + costoInstructores;
    }

    @Override
    public String toString() {
        String m = String.format("====Matricula Campamento====\n"
                + "  *Costo Transporte: $%.2f\n"
                + "  *Costo Comida: $%.2f\n"
                + "  *Costo Instructores: $%.2f\n"
                + "  *Tarifa: $%.2f\n\n",
                costoTransporte,
                costoComida,
                costoInstructores,
                tarifa);

        return m;
    }
}
