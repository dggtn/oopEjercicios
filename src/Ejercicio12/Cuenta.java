package Ejercicio12;

public class Cuenta {
    double saldo;
    String propietario;
    Fecha fechaApertura= new Fecha();


    @Override
    public String toString() {
        return "Cuenta" +
                "saldo=" + saldo +
                ", propietario='" + propietario + '\'' +
                ", fechaApertura=" + fechaApertura;
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
