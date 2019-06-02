/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.examen2;

import java.util.Date;

/**
 *
 * @author irsac
 */
public class Prestamo {
    private static int cantPrestamos=1;
    private int numPrestamo;
    private Persona solicitante;
    private double valPrestamo;
    private Date[] fechasDePago=new Date[6];
    private Date fechaAutorizacion;
    private Date fechaTentativa;
    
    public Prestamo(){
        
    }

    /**
     * @return the numPrestamo
     */
    public int getNumPrestamo() {
        return numPrestamo;
    }

    /**
     * @param numPrestamo the numPrestamo to set
     */
    public void setNumPrestamo(int numPrestamo) {
        this.numPrestamo = numPrestamo;
    }

    /**
     * @return the solicitante
     */
    public Persona getSolicitante() {
        return solicitante;
    }

    /**
     * @param solicitante the solicitante to set
     */
    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    /**
     * @return the valPrestamo
     */
    public double getValPrestamo() {
        return valPrestamo;
    }

    /**
     * @param valPrestamo the valPrestamo to set
     */
    public void setValPrestamo(double valPrestamo) {
        this.valPrestamo = valPrestamo;
    }

    /**
     * @return the fechasDePago
     */
    public Date[] getFechasDePago() {
        return fechasDePago;
    }

    /**
     * @param fechasDePago the fechasDePago to set
     */
    public void setFechasDePago(Date[] fechasDePago) {
        this.fechasDePago = fechasDePago;
    }

    /**
     * @return the fechaAutorizacion
     */
    public Date getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    /**
     * @param fechaAutorizacion the fechaAutorizacion to set
     */
    public void setFechaAutorizacion(Date fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    /**
     * @return the fechaTentativa
     */
    public Date getFechaTentativa() {
        return fechaTentativa;
    }

    /**
     * @param fechaTentativa the fechaTentativa to set
     */
    public void setFechaTentativa(Date fechaTentativa) {
        this.fechaTentativa = fechaTentativa;
    }
    
}
