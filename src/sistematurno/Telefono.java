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
public class Telefono {
    private int codPais;
    private int codigoArea;
    private int numero;

    public int getCodPais() {
        return codPais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void mostrar(){
        System.out.println("+"+this.getCodPais()
                            + " "+this.getCodigoArea()
                            + " "+this.getNumero());
    }
}
