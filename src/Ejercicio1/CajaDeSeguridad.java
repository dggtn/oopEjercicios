package Ejercicio1;

public class CajaDeSeguridad {
    int clave;
    boolean estado;
    boolean bloqueado;
    int intentos=3;

    public CajaDeSeguridad(int claveAsignada, boolean estadoPredeterminado) {
        this.clave = claveAsignada;
        this.estado = estadoPredeterminado;

    }

    private void abrir() {
        this.estado = true;
    }

    public void cerrar() {
        this.estado = false;
    }

    public void setClave(int clavePuesta){
        clave=clavePuesta;

    }

    public boolean estaAbierta( ){
        return estado;   //falso cerrado-true abierto

    }

    public void abrir(int clavePuesta) {
        if (clavePuesta==clave && !bloqueado) {
            abrir();
            System.out.println("se abre");
            intentos=3;
        } else {
            intentos-=1;
            System.out.println("no se puede abrir");
            if(intentos==0){
                bloqueado=true;
                System.out.println("la caja de seguridad se ha bloqueado");

            }
            }
        }

};
