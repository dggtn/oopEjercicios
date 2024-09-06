package Ejercicio11;

public class MainEjercicio11 {
    public static void main(String[] args) {
       Producto prod1 = new Producto(1,"Cocacola 3lts retornable",10);
        LineaVenta linea = new LineaVenta(3,prod1);
        System.out.println(linea);
    }
};
