/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.examen2.modelo;

import java.util.ArrayList;
import poo.examen2.Persona;

/**
 *
 * @author irsac
 */
public class Coopena {
    private ArrayList<Cliente> clientes;
    private final double maxVal=10000000.00;
    private Controlador controlador;
    
    public Coopena(){}
    public void agregarCliente(String id, String nombre, String apellido, String home, String cellphone){
        Cliente cliente=new Cliente();
        Persona persona=new Persona();
        persona.setNoID(Integer.parseInt(id));
        persona.setNombre(nombre);
        persona.setpApellido(apellido);
        persona.setHome(Integer.parseInt(home));
        persona.setPhone(Integer.parseInt(cellphone));
        cliente.setCliente(persona);
        clientes.add(cliente);
        
    }
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
    
     public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
