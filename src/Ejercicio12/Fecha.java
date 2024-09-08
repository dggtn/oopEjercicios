package Ejercicio12;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

public Fecha(){
    dia= LocalDateTime.now().getDayOfMonth();
    mes= LocalDateTime.now().getMonthValue();
    anio= LocalDateTime.now().getYear();
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
