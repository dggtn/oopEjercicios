package Eejercicio13;

public class Instructor extends Empleado {
    private String tipoDeClase;

    public Instructor(String tipoDeClase) {
        super(1,178956);
        this.tipoDeClase = tipoDeClase;
    }
}
