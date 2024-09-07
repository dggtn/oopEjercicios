package Ejercicio12;

public class CuentaCorriente extends Cuenta{
    private int numeroCheque=100;


    @Override
    public String toString() {
        return super.toString() +"CuentaCorriente" +
                "numeroCheque=" + numeroCheque;
    }

    public CuentaCorriente() {
    }

    public CuentaCorriente(String propietario, double saldo) {
        super(propietario, saldo);
    }

    public int getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(int numeroCheque) {
        this.numeroCheque = numeroCheque;
    }
}
