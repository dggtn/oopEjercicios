package Ejercicio3;

public class Partido {
    int puntuacion1;
    int puntuacion2;
    Equipo equipo1;
    Equipo equipo2;

    public Partido(Equipo equipo1,Equipo equipo2){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }


    public void encestar(String nombreEquipo,String tiro) {
        if(nombreEquipo==equipo1.getNombre()){
            puntuacion1+=equipo1.tirar(tiro);

        } else if (nombreEquipo==equipo2.getNombre()){
            puntuacion2+=equipo2.tirar(tiro);
        }else{
            System.out.println("No hay ese equipo");
        }

    }

    public void mostrarMarcador(){
        System.out.println("Equipo1: "+puntuacion1+ "Equipo2: "+puntuacion2);
    }
}
