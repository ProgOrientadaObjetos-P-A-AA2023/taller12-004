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
public class MatriculaEscuela extends Matricula {

    private double costoLibro;
    private double costoDeportes;
    private double costoFolletos;

    public MatriculaEscuela(double costoL, double costoD, double costoF) {
        costoLibro = costoL;
        costoDeportes = costoD;
        costoFolletos = costoF;
    }

    public void establecerCostoLibro(double n) {
        costoLibro = n;
    }

    public void establecerCostoDeportes(double n) {
        costoDeportes = n;
    }

    public void establecerCostoFolletos(double n) {
        costoFolletos = n;
    }

    public double obtenerCostoLibro() {
        return costoLibro;
    }

    public double obtenerCostoDeportes() {
        return costoDeportes;
    }

    public double obtenerCostoFolletos() {
        return costoFolletos;
    }

    @Override
    public void establecerTarifa() {
        tarifa = costoLibro + costoDeportes + costoFolletos;
    }
    
        @Override
    public String toString() {
        String m = String.format("=====Matricula Escuela====\n"
                + "  *Costo Libro: $%.2f\n"
                + "  *Costo Deportes: $%.2f\n"
                + "  *Costo Folleto: $%.2f\n"
                + "  *Tarifa: $%.2f\n\n", 
                costoLibro,
                costoDeportes,
                costoFolletos,
                tarifa);
        
        return m;
    }
}
