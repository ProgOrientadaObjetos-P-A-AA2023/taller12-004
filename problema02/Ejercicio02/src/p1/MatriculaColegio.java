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
public class MatriculaColegio extends Matricula {

    private double costoDeportes;
    private double costoFolletos;
    private double costoUniformes;
    private double costoLaboratorios;

    public MatriculaColegio(double costoD,
            double costoF, double costoU, double costoL) {
        costoDeportes = costoD;
        costoFolletos = costoF;
        costoUniformes = costoU;
        costoLaboratorios = costoL;
    }

    public double obtenerCostoDeportes() {
        return costoDeportes;
    }

    public void establecerCostoDeportes(double n) {
        costoDeportes = n;
    }

    public double obtenerCostoFolletos() {
        return costoFolletos;
    }

    public void establecerCostoFolletos(double n) {
        costoFolletos = n;
    }

    public double obtenerCostoUniformes() {
        return costoUniformes;
    }

    public void establecerCostoUniformes(double n) {
        costoUniformes = n;
    }

    public double obtenerCostoLaboratorios() {
        return costoLaboratorios;
    }

    public void establecerCostoLaboratorios(double n) {
        costoLaboratorios = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = costoDeportes + costoFolletos + costoLaboratorios 
                + costoUniformes;
    }

    @Override
    public String toString() {
        String m = String.format("=====Matricula Colegio=====\n"
                + "  *Costo Deportes: $%.2f\n"
                + "  *Costo Folletos: $%.2f\n"
                + "  *Costo Uniformes: $%.2f\n"
                + "  *Costo Laboratorios: $%.2f\n"
                + "  *Tarifa: $%.2f\n\n",
                costoDeportes,
                costoFolletos,
                costoUniformes,
                costoLaboratorios,
                tarifa);

        return m;
    }
}
