package Ejercicio5;

public class Cartero {
    Mapa mapa;
    private int envios=0;

    public Cartero(Mapa mapa) {
        this.mapa=mapa;
    }

    public void realizarEnvio(Envio envio){

    }
    public int kilometrosRecorridos(int kilometros){
        int kilometrosRecorridos=kilometros;
        return kilometrosRecorridos;
    }
    public int enviosRealizados(){
        envios+=1;
        return envios;
    }
}
