/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematurno;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Lisa
 */
public class Paciente {
    private int dni;
    private String nombre;
    private String apellido;
    private int nroLegajo;
    private GregorianCalendar fechaNacimiento;
    private char sexo;
    private ObraSocial os;
    public ArrayList<Telefono>telefonos;
    public ArrayList<Direccion>direcciones;
    public ArrayList<HistoriaClinica>hc;

    public Paciente(int dni, String nombre, String apellido, int nroLegajo, GregorianCalendar fechaNacimiento, char sexo, ObraSocial os, 
            Telefono telefono, Direccion direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroLegajo = nroLegajo;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.os = os;
        this.telefonos = new ArrayList<>();
        this.direcciones = new ArrayList<>();
        this.hc = new ArrayList<>();
        this.addTelefono(telefono);
        this.addDireccion(direccion);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public ObraSocial getOs() {
        return os;
    }

    public void setOs(ObraSocial os) {
        this.os = os;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public ArrayList<HistoriaClinica> getHc() {
        return hc;
    }

    public void setHc(ArrayList<HistoriaClinica> hc) {
        this.hc = hc;
    }

    
    private void addTelefono(Telefono telefono) {
        this.telefonos.add(telefono);
    }

    private void addDireccion(Direccion direccion) {
        this.direcciones.add(direccion);

    }
    public boolean addHistoriaClinica(HistoriaClinica hc){
        return this.hc.add(hc);
    }
    
    
    
    
    
    
}
