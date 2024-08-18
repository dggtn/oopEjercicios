package Ejercicio3;

public class Equipo {
    String nombre;

    public Equipo(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;

    }
    public int tirar(String tiro) {
        int puntos = 0;
        if (tiro == "tiro libre") {
            puntos += 1;
        } else if (tiro == "doble") {
            puntos += 2;
        } else if (tiro == "triple") {
            puntos += 3;
        } else {
            puntos += 0;
        }
        return puntos;
    }
};
