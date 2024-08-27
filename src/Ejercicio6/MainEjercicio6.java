package Ejercicio6;
public class MainEjercicio6 {
    public static void main(String[] args) {
        CajaDeSeguridad cajaDeSeguridad = new CajaDeSeguridad(1234);
        int llave;

        System.out.println(cajaDeSeguridad.intentarAbrirConClave( 1233));
        System.out.println(cajaDeSeguridad.intentarAbrirConClave( 1233));
        System.out.println(cajaDeSeguridad.intentarAbrirConClave( 1233));
        System.out.println(cajaDeSeguridad.DesbloquearUtilizandoLaLlave(1));
        System.out.println(cajaDeSeguridad.estaCerrada());
        System.out.println(cajaDeSeguridad.intentarAbrirConClave( 1234));
        System.out.println(cajaDeSeguridad.intentarCerrarConClave( 1266));
        System.out.println(cajaDeSeguridad.intentarCerrarConClave( 1234));
        System.out.println(cajaDeSeguridad.DesbloquearUtilizandoLaLlave(1));

        System.out.println(cajaDeSeguridad.CambiarClave(1234,1266));
        System.out.println(cajaDeSeguridad.estaAbierta());
        System.out.println(cajaDeSeguridad.estaBloqueada());
        System.out.println(cajaDeSeguridad.estaCerrada());
        System.out.println(cajaDeSeguridad.intentarAbrirConClave( 1234));
    }};