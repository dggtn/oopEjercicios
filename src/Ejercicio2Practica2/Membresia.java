package Ejercicio2Practica2;

public abstract class Membresia {
    Persona persona;
    private String nombre;
    Actividad actividad;

    public abstract void obtenerBeneficios();
}


/*/ Membresía full: Puede realizar todas las actividades de manera ilimitada.
Membresía por categoría: Puede realizar solamente una categoría de actividades.
Membresía por cantidad de actividades: Puede realizar una cantidad finita de actividades, que se irán
descontando a medida que son utilizadas. No tienen vencimiento.
Membresía de prueba: Puede realizar una única actividad a elección por única vez. No se puede renovar
esta actividad./*/