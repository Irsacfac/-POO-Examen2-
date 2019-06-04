/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.examen2.modelo;

import poo.examen2.modelo.Prestamo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import poo.examen2.Persona;

/**
 *
 * @author irsac
 */
public class Cliente {
    private int ID;//
    private Persona cliente;//
    private Date fechaMax;//
    private double totalPrestamo;
    private ArrayList<Prestamo> prestamos;

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }
    private boolean datosCompletos;

    public Cliente(){}
    private void setID(){
        this.ID=this.cliente.getNoID();
    }
    public String toString(){
        return cliente.toString();
    }
    
    public int getID(){
        return ID;
    }
    /**
     * @return the cliente
     */
    public Persona getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
        this.setID();
    }

    /**
     * @return the fechaMax
     */
    public Date getFechaMax() {
        return fechaMax;
    }

    /**
     * @param fechaMax the fechaMax to set
     */
    public void setFechaMax() {
      Calendar calendar = Calendar.getInstance();
      Date fecha = calendar.getTime();
      calendar.setTime(fecha); // Configuramos la fecha que se recibe
      calendar.add(Calendar.DAY_OF_YEAR, 30);
      this.fechaMax = calendar.getTime();
    }

    /**
     * @return the totalPrestamo
     */
    public double getTotalPrestamo() {
        return totalPrestamo;
    }

    /**
     * @param totalPrestamo the totalPrestamo to set
     */
    public void setTotalPrestamo(double totalPrestamo) {
        this.totalPrestamo = totalPrestamo;
    }

    /**
     * @return the prestamos
     */
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * @param prestamos the prestamos to set
     */
    public void agregarPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    /**
     * @return the datosCompletos
     */
    public boolean isDatosCompletos() {
        return datosCompletos;
    }

    /**
     * @param datosCompletos the datosCompletos to set
     */
    public void setDatosCompletos(boolean datosCompletos) {
        this.datosCompletos = datosCompletos;
    }
    
    public String getNombre() {
        return this.cliente.getNombre();
    }
}
