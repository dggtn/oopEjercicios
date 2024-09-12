package Ejercicio2Practica2;

public class MembresiaDePrueba extends Membresia {
    private int cant = 1;

    public int getCant() {
        return cant;
    }

    @Override
    public boolean puedeRealizarActividad(Actividad actividad) {
        if (cant==0){
            return false;
        }else{
            return true;
        }

    }

};
