package Ejercicio7;

public class TarjetaDeViaje {
    private double saldo;
    private double saldoNegativo = -200;
    private double saldoPositivo = 1000;
    private int cantViajes = 0;
    private double viajeMinimo;
    private double viajeMaximo;
    public TarjetaDeViaje(double saldo) {
        this.saldo = saldo;

    }

    public boolean cargar(double monto) {
        if (saldo <= saldoPositivo && saldo >= saldoNegativo) {
            saldo += monto;
            return true;
        } else {
            return false;
        }
    }

    public boolean viajar(double precio) {
        double saldoRestante = saldo - precio;
        if (saldoRestante >= saldoNegativo) {
            saldo=saldoRestante;
            cantViajes += 1;
            if(cantViajes==1){
                viajeMaximo=precio;
                viajeMinimo=precio;
            } else {
                if(precio<viajeMinimo){
                    viajeMinimo=precio;
                }
                if(precio>viajeMaximo){
                    viajeMaximo=precio;
                }
            }
            return true;

        } else {
            return false;
        }


    }
    public int obtenerViajesRealizados() {
        return cantViajes;

    }

    public double menorPrecio() {
        return viajeMinimo;
    };

    public double precioMaximo(){
        return viajeMaximo;
    }
};
