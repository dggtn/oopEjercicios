package Ejercicio11;

import java.util.List;

public class Venta {
    int numeroFactura;
    Fecha fecha = new Fecha();
    List<LineaVenta> lineas = new java.util.ArrayList<LineaVenta>();
    public Venta(int numeroFactura1){
        numeroFactura=numeroFactura1;
    }

    public void agregar(Producto p,int cantidad){
        LineaVenta linea = new LineaVenta(cantidad,p);
        lineas.add(linea);

    }
    public void mostrarTicketventa(){
        System.out.println("Numero Fcatura "+ numeroFactura);
        System.out.println("Fecha: "+fecha);
        System.out.println("Ca\tDesc\tUni\t\tSubt");
        for (int i = 0; i < lineas.size(); i++) {
            System.out.println(lineas.get(i));
        }
        System.out.println();
        System.out.println("Total de la venta: "+calcularTotal());
        System.out.println();
    }
    public double calcularTotal(){
        double total =0;
        for (LineaVenta linea : lineas){
            total +=linea.calcularSubTotal();
        }
        return total;
    }
};
