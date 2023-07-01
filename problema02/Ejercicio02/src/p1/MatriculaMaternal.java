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
public class MatriculaMaternal extends Matricula{
    
    private double costoDesayunos;
    private double costoAlmuerzo;
    private double costoMedico;

    public MatriculaMaternal(double costoD, double costoAl, double costoMe) {
        costoDesayunos = costoD;
        costoAlmuerzo = costoAl;
        costoMedico = costoMe;
    }

    public double getCostoDesayunos() {
        return costoDesayunos;
    }

    public void setCostoDesayunos(double n) {
        this.costoDesayunos = n;
    }

    public double getCostoAlmuerzo() {
        return costoAlmuerzo;
    }

    public void setCostoAlmuerzo(double n) {
        costoAlmuerzo = n;
    }

    public double getCostoMedico() {
        return costoMedico;
    }

    public void setCostoMedico(double n) {
        costoMedico = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = costoDesayunos + costoAlmuerzo + costoMedico;
    }

    @Override
    public String toString() {
        String m = String.format("=====Matricula Maternal=====\n"
                + "  *Costo Desayunos: $%.2f\n"
                + "  *Costo Almuerzo: $%.2f\n"
                + "  *Costo Medico: $%.2f\n"
                + "  *Tarifa: $%.2f\n\n", 
                costoDesayunos,
                costoAlmuerzo,
                costoMedico,
                tarifa);
        
        return m;
    }
}