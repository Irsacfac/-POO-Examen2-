/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.examen2.modelo;

import java.util.ArrayList;
import java.util.Date;
import poo.examen2.Persona;

/**
 *
 * @author irsac
 */
public class Prestamo {
    private static int cantPrestamos=1;
    private int numPrestamo;
    private Persona solicitante;
    private double valPrestamo;
    private ArrayList<Date> fechasDePago;
    private Date fechaAutorizacion;
    private Date fechaTentativa;
    
    public Prestamo(){
        setNumPrestamo();
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
    private void setNumPrestamo() {
        this.numPrestamo = cantPrestamos;
        cantPrestamos++;
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
    public Date getFechasDePago(int n) {
        return fechasDePago.get(n);
    }

    /**
     * @param fechasDePago the fechasDePago to set
     */
    public void setFechasDePago() {
        this.fechasDePago=null;
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
