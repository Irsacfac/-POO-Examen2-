/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.examen2.modelo;

import java.util.ArrayList;

/**
 *
 * @author irsac
 */
public class Modelo {
    private ArrayList<Cliente> clientes;
    private final double maxVal=10000000.00;
    
    public Modelo(){}
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
        p.setCancelado(true);
        actual.setTotalPrestamo(-p.getValPrestamo());
        return true;
    }
}
