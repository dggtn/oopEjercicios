package Ejercicio10;

public class Venta {
    Fecha f;
    double monto;

    public Venta() {
        f = new Fecha();
        monto=0;
    }

    public Venta(Fecha f, double monto) {
       this.monto=monto;
       this.f=f;
    }

    public Venta(double monto) {
        f = new Fecha();
        this.monto=monto;
    }

    public void imprimir(){
        System.out.println("Fecha "+f);
        System.out.println("Monto"+ monto);
    }

    public Fecha getF() {
        return f;
    }

    public void setF(Fecha f) {
        this.f = f;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
};
