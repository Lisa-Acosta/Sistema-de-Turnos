
package sistematurno;

/**
 * Esta clase permite crear objetos dirección, según leyes de Argentina.
 * @author Lisa
 */
public class Direccion {
    private String barrio;
    private String calle;
    private String numero;
    private String piso;
    private String dpto;
    private String casa;
    private String manzana;
    private String CP;
    
     public Direccion(String barrio, String calle, String numero, String piso, String dpto, String casa, String manzana, String CP) {
        this.barrio = barrio;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.dpto = dpto;
        this.casa = casa;
        this.manzana = manzana;
        this.CP = CP;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getPiso() {
        return piso;
    }

    public String getDpto() {
        return dpto;
    }

    public String getCasa() {
        return casa;
    }

    public String getManzana() {
        return manzana;
    }

    public String getCP() {
        return CP;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }
    public String mostrar(){
        return "Calle: "+this.getCalle()+"\t"
                +"N°: "+this.getNumero()+"\n"
                +"Barrio: "+this.getBarrio()+"\t"
                +"Casa: "+this.getCasa()+"\t"
                +"Mza: "+this.getManzana()+"\n"
                +"Piso: "+this.getPiso()+"\t"
                +"Departamento: "+this.getDpto()+"\t"
                +"CP: "+this.getCP();
                
        
    }
}