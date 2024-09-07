package Ejercicio12;



public class Mainejercicio12 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.agregar(new Cuenta("Bart",0));
        banco.agregar(new Cuenta("Lisa",0));
        banco.agregar(new CajaDeAhorro("Homero",0));
        banco.mostrar();
    }
};
