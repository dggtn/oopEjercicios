package youtube;

import java.util.ArrayList;

public class Caja {
    private int numero;
    private ArrayList<Venta>ventas= new ArrayList<Venta>();

    public Caja(int numero){
        this.numero = numero;

    }
    public void agregarVenta(Venta v){
        ventas.add(v);

    }
    public void mostrar(){
        for (int i = 0; i < ventas.size(); i++) {
            ventas.get(i).imprimir();
            System.out.println();

        }
    }
}
