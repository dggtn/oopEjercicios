package EjercicioPractica2;

public class Empleado {
    private String nombre;
    private MedioMovilidad medioMovilidad;

    public Empleado(String nombre, MedioMovilidad medioMovilidad) {
        this.nombre = nombre;
        this.medioMovilidad = medioMovilidad;
    }

    public void recibirRegalo(){
        medioMovilidad.obtenerRegalo();
    }

    public MedioMovilidad getMedioMovilidad() {
        return medioMovilidad;
    }

    public void setMedioMovilidad(MedioMovilidad medioMovilidad) {
        this.medioMovilidad = medioMovilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
