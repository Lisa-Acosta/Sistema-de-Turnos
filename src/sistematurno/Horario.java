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
public class Horario {
    private String dia;
    private String horaDesde;
    private String horaHasta;

    public Horario(String dia, String horaDesde, String horaHasta) {
        this.dia = dia;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(String horaDesde) {
        this.horaDesde = horaDesde;
    }

    public String getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(String horaHasta) {
        this.horaHasta = horaHasta;
    }
    public String mostrar(){
        return "Dia: "+this.getDia()
                +"\tHorario desde: "+this.getHoraDesde()
                +"\tHorario Hasta: "+this.getHoraHasta();
}
}