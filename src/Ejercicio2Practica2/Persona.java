package Ejercicio2Practica2;

public class Persona {
    private int dni;
    Membresia membresia;

    public Persona(int dni, Membresia membresia) {
        this.dni = dni;
        this.membresia = membresia;
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}
