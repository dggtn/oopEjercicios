package Ejercicio2;

public class Ascensor {
    int pisos;
    private int pisoActual;

    public Ascensor(int pisosMaximo) {
        this.pisos = pisosMaximo;
        this.pisoActual=0;
    }
    private void bajar() {
        pisoActual--;
    }

    private void subir() {
        pisoActual++;

    }



    public void llamar(int pisoDedondeSeLoLlama) {
    if(pisoDedondeSeLoLlama<pisoActual) {
        int pisosAbajar=pisoActual-pisoDedondeSeLoLlama;
        for (int i = 0; i < pisosAbajar; i++) {
            bajar();
        }
        System.out.println("Llegaste a tu piso: "+pisoActual);

    }
    else if(pisoDedondeSeLoLlama==pisoActual){
        System.out.println("el ascensor ya se encuentra en tu piso");
    }
    else{
        int pisosAsubir=pisoDedondeSeLoLlama-pisoActual;
        for (int i = 0; i < pisosAsubir; i++) {
            subir();
        }
        System.out.println("Llegaste a tu piso: "+pisoActual);
    }
    }

    public void ir(int pisoAlqueQuieroIr){
        if( pisoAlqueQuieroIr<pisoActual) {
            int pisosAbajar = pisoActual - pisoAlqueQuieroIr;
            for (int i = 0; i < pisosAbajar; i++) {
                bajar();
            }
        }
        else if(pisoAlqueQuieroIr==pisoActual) {
            System.out.println("Ya estas en ese piso");
        }
        else{
            int pisosAsubir=pisoAlqueQuieroIr-pisoActual;
            for (int i = 0; i < pisosAsubir; i++) {
                subir();
            }
            System.out.println("Llegaste a tu piso: "+pisoActual);
        }

    }
    public int pisoActual() {
        return pisoActual;
    }
    }
;

