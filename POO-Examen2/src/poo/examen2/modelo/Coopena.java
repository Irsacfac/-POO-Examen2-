/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.examen2.modelo;

import java.util.ArrayList;
import poo.examen2.Controlador;

/**
 *
 * @author irsac
 */
public class Coopena {
    private ArrayList<Cliente> clientes;
    private final double maxVal=10000000.00;
    private Controlador controlador;
    
    public Coopena(){}
    public boolean solicitarPrestamo(Prestamo nPrestamo, int ID){
        Cliente actual=null;
        for(int i=0;i<clientes.size();i++){
            if(clientes.get(i).getCliente().getNoID()==ID){
                actual=clientes.get(i);
            }    
        }
        if(actual==null){
            return false;
        }
        double newTotal=actual.getTotalPrestamo()+ nPrestamo.getValPrestamo();
        if(newTotal>this.maxVal){
            return false;
        }
        actual.setTotalPrestamo(newTotal);
        actual.agregarPrestamo(nPrestamo);
        return true;
    }
    public boolean cancelarPrestamo(int numPrestamo,int ID){
        Cliente actual=null;
        for(int i=0;i<clientes.size();i++){
            if(clientes.get(i).getCliente().getNoID()==ID){
                actual=clientes.get(i);
            }    
        }
        Prestamo p = actual.getPrestamos(numPrestamo);
        if(p.isCancelado()){
            p.setCancelado(true);
            actual.setTotalPrestamo(-p.getValPrestamo());
            return true;
        }
        else{
            return false;
        }
    }
    public boolean realizarPago(int numPrestamo,int ID, double monto){
        Cliente actual=null;
        for(int i=0;i<clientes.size();i++){
            if(clientes.get(i).getCliente().getNoID()==ID){
                actual=clientes.get(i);
            }    
        }
        Prestamo p = actual.getPrestamos(numPrestamo);
        if(!p.isCancelado()){
            double resta=p.getValPrestamo()-monto;
            if((resta)<0){
                
                p.setValPrestamo(-monto);
                if(p.getValPrestamo()==0){
                    this.cancelarPrestamo(numPrestamo, ID);
                }
                return true;
            }
        }
        return true;
    }
}
