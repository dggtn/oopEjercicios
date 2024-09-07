package Ejercicio12;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;


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
