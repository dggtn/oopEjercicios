package Ejercicio7;
public class MainEjercicio7 {
    public static void main(String[] args) {
        TarjetaDeViaje sube = new TarjetaDeViaje(0);

        System.out.println(sube.cargar(500.00));
        System.out.println(sube.viajar(400.00));
        System.out.println(sube.viajar(100.00));
        System.out.println(sube.viajar(200.00));
        System.out.println(sube.viajar(200.00));
        System.out.println(sube.cargar(1000.00));
        System.out.println(sube.menorPrecio());
        System.out.println(sube.precioMaximo());
    }
};