package Ejercicio12;

public class CajaDeAhorro extends Cuenta{
    double interesMensual=3;


    public CajaDeAhorro(String propietario, double saldo ) {
        super(propietario, saldo);
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    @Override
    public String toString() {
        return "CajaDeAhorro{" +
                "interesMensual=" + interesMensual +
                ", saldo=" + saldo +
                ", propietario='" + propietario + '\'' +
                ", fechaApertura=" + fechaApertura +
                '}';
    }
}
