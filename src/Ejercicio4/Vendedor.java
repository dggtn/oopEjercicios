package Ejercicio4;

public class Vendedor {
    private int cantidadVentasHechas;
    private double totalVendido=0;
    private double comision=0;

    public void vender(Remera remera,int cantidadCamisetasVendidas){
        cantidadVentasHechas+=1;
        int multiplo= cantidadCamisetasVendidas%10;
        double precioFinal= remera.getPrecioBase()*cantidadCamisetasVendidas;
        if(remera.getColor()=="negro"){
            precioFinal+=(remera.getPrecioBase()*0.05)*cantidadCamisetasVendidas;
        }
        if(remera.getTalle()=='M') {
            precioFinal += (remera.getPrecioBase() * 0.10) * cantidadCamisetasVendidas;
        } else if (remera.getTalle()=='L') {
        precioFinal += (remera.getPrecioBase() * 0.12) * cantidadCamisetasVendidas;
        }
        if(multiplo==0){
            comision+=precioFinal*0.05;
        }
        totalVendido=+precioFinal;
    }

    public int ventasTotales(){
        return cantidadVentasHechas;
    }

    public double getRecaudacion(){
        return totalVendido;
    }
    public double getComision(){
        return comision;
    }
};
