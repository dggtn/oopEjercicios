package Ejercicio2;

public class Ascensor {
    int pisos;
    int pisoActual;

    public Ascensor(int pisosMaximos){
        this.pisos= pisosMaximos;

    }
    private int subir(){
        return pisoActual++;

    }
    private int bajar(){
        return pisoActual--;
    }
    public void setPisoActual(){
        pisoActual=0;
    }
    public void llamar(int pisoEnelQueEstoy){
        pisoActual=pisoEnelQueEstoy;

    }
    public void ir(int pisoAir){
        pisoActual=pisoAir;
    }


}
