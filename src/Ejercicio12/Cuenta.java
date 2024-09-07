package Ejercicio12;

public class Cuenta {
    protected double saldo;
    public String propietario;
    public Fecha fechaApertura= new Fecha();


    @Override
    public String toString() {
        return "Cuenta" +
                "saldo=" + saldo +
                ", propietario='" + propietario + '\'' +
                ", fechaApertura=" + fechaApertura;
    }


    public void extraer(double monto)  {
        if (monto > saldo) {
            System.out.println("Fondos insuficientes");
        } else {
            saldo = saldo - monto;
        }
    }


    public void depositar(double monto){
        saldo=saldo+monto;
    }
    public Cuenta() {
    }

    public Cuenta(String propietario, double saldo) {
        this.propietario = propietario;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
