package youtube;

public class VentaConCheque extends Venta{
    String banco;
    String numeroCheque;


    public VentaConCheque(double monto,String banco,String numeroCheque) {
        super(monto);
        this.numeroCheque = numeroCheque;
        this.banco=banco;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de cheque: "+ numeroCheque+"Nombre banco: "+banco);

    }
};