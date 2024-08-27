package Ejercicio6;

public class CajaDeSeguridad {
    private int clave;
    private boolean abierto; //true= abierto false=cerrado
    private int intentos = 0;
    private boolean bloqueado; //true bloqueado -false no bloqueado


    public CajaDeSeguridad(int clave){
        this.clave=clave;
        this.abierto=false;
        this.bloqueado=false;
    }

    public boolean intentarAbrirConClave(int clave) {
        if (!this.abierto) {
            if (this.clave == clave) {
                this.abierto=true;
                return this.abierto;
            } else {
                intentos += 1;
                if (intentos == 3) {
                    this.bloqueado=true;
                }
                return false;
            }
        } else{
            return false;
        }
    }



    public boolean intentarCerrarConClave(int clave){
        if (this.abierto) {
            if (this.clave == clave) {
                this.abierto=false;
                return true;
            }else{intentos += 1;
                if (intentos == 3) {
                    this.bloqueado=true;
                }
                return false;
            }
        } else{
            return false;
        }
    }

    public boolean DesbloquearUtilizandoLaLlave(int llave){
        if (this.bloqueado){
                this.bloqueado=false;
                intentos=0;
                this.clave=1234;
                return true;

            }else{
                return false;
            }
    }

    public boolean CambiarClave(int claveActual,int claveNueva) {
        if (this.abierto && !this.bloqueado) {
            if (claveActual != this.clave) {
                intentos += 1;
                if (intentos == 3) {
                    this.bloqueado = true;
                    return false;
                } else if (claveNueva == claveActual) {
                    return false;
                } else {
                    this.clave = claveNueva;
                    intentos = 0;
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    };

    public boolean estaAbierta(){
        return this.abierto;
    }
    public boolean estaBloqueada(){
        return this.bloqueado;
    }
    public boolean estaCerrada(){
        return !this.abierto;
    }
};

