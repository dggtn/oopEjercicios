package EjercicioPractica2;



public class MainejercicioPractica2 {
    public static void main(String[] args) {

        Empleado empleado1= new Empleado("jorge",new Auto());

        empleado1.recibirRegalo();

        empleado1.setMedioMovilidad(new Bicicleta());

        empleado1.recibirRegalo();


    }
};
