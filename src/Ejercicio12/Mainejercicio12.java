package Ejercicio12;



public class Mainejercicio12 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.agregar(new Cuenta("Bart",100));
        banco.agregar(new Cuenta("Lisa",100));
        banco.agregar(new CajaDeAhorro("Homero",50));
        banco.agregar(new CuentaCorriente("Norma",50));
        banco.mostrar();
        banco.cobrarMantenimientoMensual();
        banco.mostrar();
    }
};
