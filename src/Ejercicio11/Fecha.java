package Ejercicio11;

import java.util.Calendar;

public class Fecha {
    int dia;
    int mes ;
    int anio;

    public Fecha(){
        dia= Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        mes= Calendar.getInstance().get(Calendar.MONTH);
        anio= Calendar.getInstance().get(Calendar.YEAR);

    }

    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", anio=" + anio +
                '}';
    }
}
