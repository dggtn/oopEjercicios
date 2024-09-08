package Eejercicio13;

public class Persona {
    int nombre;
    int dni;

    public Persona(int nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre=" + nombre +
                ", dni=" + dni +
                '}';
    }
}
