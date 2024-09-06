package youtube;

import java.util.Calendar;

public class Fecha {
    private int anio;
    private int dia;
    private int mes;



    public Fecha(int anio,int dia,int mes) {
        this.anio = anio;
        this.dia = anio;
        this.mes= mes;
    }

    public Fecha() {
        dia = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        mes=Calendar.getInstance().get(Calendar.MONTH)+1;
        anio=Calendar.getInstance().get(Calendar.YEAR);

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }



    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }




    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return " anio=" + anio +
                ", dia=" + dia +
                ", mes=" + mes ;
    }
}
