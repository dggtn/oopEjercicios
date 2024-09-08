package Ejercicio10;



public class Main {
    public static void main(String[] args) {
     Caja caja = new Caja(1);
     caja.agregarVenta(new Venta(100));
     caja.agregarVenta(new VentaConCheque(200,"galicia","123"));
     caja.agregarVenta(new VentaConTarjeta(300,"4545"));
     caja.mostrar();
    }
};