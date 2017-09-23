/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematurno;

/**
 *
 * @author Lisa
 */
public class ObraSocial {
    private String nombre;
    private String nroSocio;

    public ObraSocial(String nombre, String nroSocio) {
        this.nombre = nombre;
        this.nroSocio = nroSocio;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(String nroSocio) {
        this.nroSocio = nroSocio;
    }
    
    public String mostrar(){
        return this.getNombre()+ " - N° Socio "+this.getNroSocio();
    }
}
