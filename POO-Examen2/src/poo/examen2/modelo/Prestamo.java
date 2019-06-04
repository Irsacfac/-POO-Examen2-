/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.examen2.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import poo.examen2.Persona;

/**
 *
 * @author irsac
 */
public class Prestamo {
    private static int cantPrestamos=1;//
    private int numPrestamo;//
    private Cliente solicitante;//
    private int valPrestamo;//
    private ArrayList<Date> fechasDePago;//
    private Date fechaAutorizacion;//
    private Date fechaTentativa;//
    private boolean cancelado;
    private SimpleDateFormat mascara=new SimpleDateFormat("dd/MM/yy");
    
    public Prestamo(int cant){
        setNumPrestamo();
        this.setValPrestamo(cant);
    }
    public String toString(){
        String msg="";
        msg+="Numero de prestamo: "+this.getNumPrestamo()+"\n";
        msg+="Solicitante: " + "\n" + solicitante.toString();
        msg+="El valor del prestamo es: "+this.getValPrestamo();
        msg+="Fecha de autorizacion: " + this.getFechaAutorizacion();
        msg+="Fechas de pago: "+this.getFechasDePago();
        if(this.isCancelado()){
            msg += "Estado: Cancelado";
            return msg;
        }
        msg += "Estado: pendiente";
        return msg;
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
        this.numPrestamo = getCantPrestamos();
        setCantPrestamos(getCantPrestamos() + 1);
    }

    /**
     * @return the solicitante
     */
    public Cliente getSolicitante() {
        return solicitante;
    }

    /**
     * @param solicitante the solicitante to set
     */
    public void setSolicitante(Cliente solicitante) {
        this.solicitante = solicitante;
    }

    /**
     * @return the valPrestamo
     */
    public int getValPrestamo() {
        return valPrestamo;
    }

    /**
     * @param valPrestamo the valPrestamo to set
     */
    public void setValPrestamo(int valPrestamo) {
        this.valPrestamo = valPrestamo;
    }

    /**
     * @return the fechasDePago
     */
    public String getFechasDePago() {
        String msg="";
        Date fecha;
        for(int i=0;i<6;i++){
            fecha=fechasDePago.get(i);
            msg+=mascara.format(fecha)+"\n";
        }
        return msg;
    }

    /**
     * @param fechasDePago the fechasDePago to set
     */
    public void setFechasDePago() {
        Calendar calendar = Calendar.getInstance();
        Date fechaTentativa=this.fechaTentativa;
        Date fechaPago;
        calendar.setTime(fechaTentativa);
        for(int i=0;i<6;i++){
            calendar.add(Calendar.DAY_OF_YEAR, 30);
            fechaPago = calendar.getTime();
            this.fechasDePago.add(fechaPago);
        }
    }

    /**
     * @return the fechaAutorizacion
     */
    public String getFechaAutorizacion() {
        Date fecha=this.fechaAutorizacion;
        return mascara.format(fecha);
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
    public String getFechaTentativa() {
        Date fecha=this.fechaTentativa;
        return mascara.format(fecha);
    }

    /**
     * @param fechaTentativa the fechaTentativa to set
     */
    public void setFechaTentativa(Date fechaTentativa) {
        Calendar calendar = Calendar.getInstance();
        Date fecha = this.fechaAutorizacion;
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        if(calendar.get(Calendar.DAY_OF_WEEK)==1){
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            this.fechaTentativa = calendar.getTime();
        }
        this.fechaTentativa = calendar.getTime();
    }

    /**
     * @return the cantPrestamos
     */
    public static int getCantPrestamos() {
        return cantPrestamos;
    }

    /**
     * @param aCantPrestamos the cantPrestamos to set
     */
    public static void setCantPrestamos(int aCantPrestamos) {
        cantPrestamos = aCantPrestamos;
    }

    /**
     * @return the cancelado
     */
    public boolean isCancelado() {
        return cancelado;
    }

    /**
     * @param cancelado the cancelado to set
     */
    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }
    
}
