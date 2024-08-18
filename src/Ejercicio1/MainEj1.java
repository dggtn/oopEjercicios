package Ejercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainEj1 {
    public static void main(String[] args) {
        CajaDeSeguridad caja1 = new CajaDeSeguridad(123456,false);
        CajaDeSeguridad caja2 = new CajaDeSeguridad(1234,false);


        System.out.println("Estado de la caja 1:  "+ caja1.estaAbierta());
        caja1.abrir(365298);
        System.out.println("Estado de la caja 1:  "+ caja1.estaAbierta());
        caja1.abrir(6);
        System.out.println("Estado de la caja 1:  "+ caja1.estaAbierta());
        caja1.abrir(6);;
        System.out.println("Estado de la caja 1:  "+ caja1.estaAbierta());

        caja2.abrir(123);
        caja2.abrir(123);
        caja2.abrir(1234);
        System.out.println(caja2.estaAbierta());
        caja2.cerrar();
        caja2.abrir(12);
        caja2.abrir(23);
        caja2.abrir(34);
        caja2.abrir(1234);
        System.out.println(caja2.estaAbierta());



    }
}
