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
}
