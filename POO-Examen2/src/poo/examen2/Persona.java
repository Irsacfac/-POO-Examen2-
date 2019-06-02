/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.examen2;

/**
 *
 * @author irsac
 */
public class Persona {
    private int NoID;
    private String nombre;
    private String pApellido;
    private String sApellido;
    private int home;
    private int phone;
    
    public Persona(){}

    /**
     * @return the NoID
     */
    public int getNoID() {
        return NoID;
    }

    /**
     * @param NoID the NoID to set
     */
    public void setNoID(int NoID) {
        this.NoID = NoID;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the pApellido
     */
    public String getpApellido() {
        return pApellido;
    }

    /**
     * @param pApellido the pApellido to set
     */
    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    /**
     * @return the sApellido
     */
    public String getsApellido() {
        return sApellido;
    }

    /**
     * @param sApellido the sApellido to set
     */
    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    /**
     * @return the home
     */
    public int getHome() {
        return home;
    }

    /**
     * @param home the home to set
     */
    public void setHome(int home) {
        this.home = home;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }
    
}
