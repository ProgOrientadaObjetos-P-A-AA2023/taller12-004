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
public class MatriculaJardin extends Matricula {

    private double costoDesayunos;
    private double costolibros;
    private double costoPaseos;

    public MatriculaJardin(double cosotoD, double costoLib, double costoPas) {
        costoDesayunos = cosotoD;
        costolibros = costoLib;
        costoPaseos = costoPas;
    }

    public double obtenerCostoDesayunos() {
        return costoDesayunos;
    }

    public void establecerCostoDesayunos(double n) {
        costoDesayunos = n;
    }

    public double obtenerCostolibros() {
        return costolibros;
    }

    public void establecerCostolibros(double n) {
        costolibros = n;
    }

    public double obtenerCostoPaseos() {
        return costoPaseos;
    }

    public void establecerCostoPaseos(double n) {
        costoPaseos = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = costoDesayunos + costolibros + costoPaseos;
    }

    @Override
    public String toString() {
        String m = String.format("=====Matricula Jardin=====\n"
                + "  *Costo Desayunos: $%.2f\n"
                + "  *Costo Libros: $%.2f\n"
                + "  *Costo Paseo: $%.2f\n"
                + "  *Tarifa: $%.2f\n\n",
                costoDesayunos,
                costolibros,
                costoPaseos,
                tarifa);

        return m;
    }
}
