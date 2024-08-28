package Ejercicio5;


public class MainEjercicio5 {
    public static void main(String[] args) {
        Mapa mapa = new Mapa(1,3,5);
        Cartero cartero = new Cartero(mapa);
        Envio envio = new Envio();

        envio.asignarOrigen("A");
        envio.asignarDestino("C");
        cartero.realizarEnvio(envio);

        int km=cartero.kilometrosRecorridos(5);
        int viajes=cartero.enviosRealizados();

        System.out.println(km);
        System.out.println(viajes);

    }};