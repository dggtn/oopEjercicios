package Ejercicio12;

import java.util.Calendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

public Fecha(){
    dia= Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    mes= Calendar.getInstance().get(Calendar.MONTH)+1;
    anio= Calendar.getInstance().get(Calendar.YEAR);
}
    @Override
    public String toString() {
        return   "dia=" + dia +
                ", mes=" + mes +
                ", anio=" + anio +
                '}';
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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }




    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio= anio;
    }


}
