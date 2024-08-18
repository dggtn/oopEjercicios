package Ejercicio2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainControladorDeAscensor {
    public static void main(String[] args) {
        Ascensor ascensor1 = new Ascensor(20);
        Ascensor ascensor2 = new Ascensor(20);
        ControladorDeAscensor controlador = new ControladorDeAscensor(ascensor1,ascensor2);

        controlador.llamar(5);
        System.out.println("Piso actual asc1 :"+ascensor1.pisoActual());
        System.out.println("Piso actual asc2 :"+ascensor2.pisoActual());
        ascensor2.ir(9);
        controlador.llamar(11);
        System.out.println("Piso actual asc1 :"+ascensor1.pisoActual());
        System.out.println("Piso actual asc2 :"+ascensor2.pisoActual());

    }
    }
