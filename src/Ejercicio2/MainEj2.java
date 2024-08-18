package Ejercicio2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainEj2 {
    public static void main(String[] args) {
        Ascensor ascensor1 = new Ascensor(8);
        Ascensor ascensor2 = new Ascensor(4);



        System.out.println("Ascensor1,piso Actual= "+ascensor1.pisoActual());
        ascensor1.ir(5);
        System.out.println("Ascensor1,piso Actual= "+ascensor1.pisoActual());
        ascensor1.llamar(1);
        System.out.println("Ascensor1,piso Actual= "+ascensor1.pisoActual());
        ascensor1.ir(1);
        System.out.println("Ascensor1,piso Actual= "+ascensor1.pisoActual());
        ascensor1.llamar(8);
        System.out.println("Ascensor1,piso Actual= "+ascensor1.pisoActual());
    }
    }
