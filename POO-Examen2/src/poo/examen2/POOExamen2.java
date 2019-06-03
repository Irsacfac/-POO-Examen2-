/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.examen2;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author irsac
 */
public class POOExamen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Calendar calendar = Calendar.getInstance();
      Date fecha = calendar.getTime();
      calendar.setTime(fecha); // Configuramos la fecha que se recibe
      calendar.add(Calendar.DAY_OF_YEAR, 30);  	
      Date fechaMax = calendar.getTime();
      SimpleDateFormat mascara=new SimpleDateFormat("dd/MM/yy");
      int dia = calendar.get(Calendar.DAY_OF_MONTH);
      System.out.println( mascara.format(fechaMax));
      System.out.println(dia);
      calendar.setTime(fecha); // Configuramos la fecha que se recibe
      calendar.add(Calendar.DAY_OF_YEAR, 18);
      if(calendar.get(Calendar.DAY_OF_MONTH)>20){
          System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
      }
      calendar.add(Calendar.MONTH, 1);
      calendar.set(Calendar.DAY_OF_MONTH, 1);
      System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
      Date fechaCreacion=calendar.getTime();
      System.out.println( mascara.format(fechaCreacion));
      //Date fechaTentativa=this.getFechaTentativa();
        Date fechaPago;
        //calendar.setTime(fechaTentativa);
        for(int i=0;i<6;i++){
            calendar.add(Calendar.DAY_OF_YEAR, 30);
            fechaPago = calendar.getTime();
            System.out.println( mascara.format(fechaPago));
        }
    }
    
}
