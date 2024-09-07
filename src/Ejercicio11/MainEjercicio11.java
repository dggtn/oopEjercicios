package Ejercicio11;

public class MainEjercicio11 {
    public static void main(String[] args) {
        Producto prod1 = new Producto(1,"Cocacola 3lts retornable",150);
        Producto prod2 = new Producto(2,"Cocacola 2lts retornable",100);
        Producto prod3 = new Producto(3,"Cocacola 1lt retornable",80);

        Venta v = new Venta(1);
        v.agregar(prod1,3);
        v.agregar(prod1,5);

        Venta v2 = new Venta(2);
        v2.agregar(prod1,1);
        v2.agregar(prod1,5);
        v2.mostrarTicketventa();
    }
};
