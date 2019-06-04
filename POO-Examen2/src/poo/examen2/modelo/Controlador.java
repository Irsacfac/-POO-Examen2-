/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.examen2.modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author irsac
 */
public class Controlador implements ActionListener{
    
    private venCrearCliente venCrearCliente;
    private venSolicitarPrestamo venSolicitarPrestamo;
    private venPrestamosVigentes venPrestamosVigentes;
    private Coopena modelo;
    
    private Coopena master;
    
    
    public Controlador(venCrearCliente venCreateClient, venSolicitarPrestamo venSolicitatePrestamo, venPrestamosVigentes venPrestamosV, Coopena modelo){
        this.venCrearCliente=venCreateClient;
        this.venPrestamosVigentes=venPrestamosV;
        this.venSolicitarPrestamo=venSolicitatePrestamo;
        this.venCrearCliente.jButton1.addActionListener(this);
        this.venSolicitarPrestamo.jButton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String id=venCrearCliente.jTextField1.getText();
        String nombre=venCrearCliente.jTextField2.getText();
        String apellido=venCrearCliente.jTextField3.getText();
        String home=venCrearCliente.jTextField4.getText();
        String cellphone=venCrearCliente.jTextField5.getText();
        modelo.agregarCliente(id, nombre, apellido, home, cellphone);
    }

    public void actionPerformed2(ActionEvent e){
        
    }
}
