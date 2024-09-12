package Ejercicio2Practica2;

public class MemebresiaPorCategoria extends Membresia {
    Actividad actividadRealizada;

    public Actividad getActividadRealizada() {
        return actividadRealizada;
    }

    public void setActividadRealizada(Actividad actividadRealizada) {
        this.actividadRealizada = actividadRealizada;
    }

    @Override
    public boolean puedeRealizarActividad(Actividad actividad) {
        if (actividad == actividadRealizada) {

            return true;
        } else{
        return false;
    }
}
}


