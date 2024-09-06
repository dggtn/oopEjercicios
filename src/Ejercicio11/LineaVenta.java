package Ejercicio11;

public class LineaVenta {
    int cantidad;
    Producto p;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }



    public LineaVenta(int cantidad,Producto p) {
        this.cantidad = cantidad;
        this.p = p;
    }

    public LineaVenta() {

    }

    public double calcularSubTotal(){
        return cantidad*p.getPrecio();
    }

    @Override
    public String toString() {
        return "LineaVenta{" +
                "cantidad=" + cantidad +
                ", p=" + p +
                '}';
    }
}
