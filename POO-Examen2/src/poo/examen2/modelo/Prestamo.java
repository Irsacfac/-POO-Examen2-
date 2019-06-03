/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.examen2.modelo;

import java.util.ArrayList;
import java.util.Calendar;
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
    public void setFechaAutorizacion() {
      Calendar calendar = Calendar.getInstance();
      Date fecha = calendar.getTime();
      if(this.getValPrestamo()<200000.00){
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, 5);
        if(calendar.get(Calendar.DAY_OF_MONTH)>20){
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            this.fechaAutorizacion = calendar.getTime();
        }
        else{
            this.fechaAutorizacion = calendar.getTime();
        }
      }
      else if(500000.00>this.getValPrestamo()){
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        if(calendar.get(Calendar.DAY_OF_MONTH)>20){
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            this.fechaAutorizacion = calendar.getTime();
        }
        else{
            this.fechaAutorizacion = calendar.getTime();
        }
      }
      else{
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, 15);
        if(calendar.get(Calendar.DAY_OF_MONTH)>20){
          calendar.add(Calendar.MONTH, 1);
          calendar.set(Calendar.DAY_OF_MONTH, 1);
          this.fechaAutorizacion = calendar.getTime();
        }
        this.fechaAutorizacion = calendar.getTime();
      }
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
        Calendar calendar = Calendar.getInstance();
        Date fecha = this.getFechaAutorizacion();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        this.fechaTentativa = calendar.getTime();
    }
    
}
