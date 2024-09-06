package youtube;



public class Main {
    public static void main(String[] args) {
     Caja caja = new Caja(1);
     caja.agregarVenta(new Venta(100));
     caja.agregarVenta(new Venta(200));
     caja.agregarVenta(new Venta(300));
     caja.mostrar();

    }
};