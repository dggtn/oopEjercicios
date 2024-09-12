package Ejercicio2Practica2;

public class MembresiaPorCantidadActividades extends Membresia {
    private int cant;
    Actividad actividadRealizada;

    public MembresiaPorCantidadActividades(int cant, Actividad actividadRealizada) {
        this.cant = cant;
        this.actividadRealizada = actividadRealizada;
    }


    @Override
    public boolean puedeRealizarActividad(Actividad actividad) {
        for (int i = 0; i < cant; i++) {
            cant--;
        }
        if (cant == 0) {
            System.out.println("No te quedan actividades disponibles");
            return false;
        } else {
            return true;
        }
    }

    ;

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Actividad getActividadRealizada() {
        return actividadRealizada;
    }

    public void setActividadRealizada(Actividad actividadRealizada) {
        this.actividadRealizada = actividadRealizada;
    }
};


