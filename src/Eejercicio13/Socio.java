package Eejercicio13;

public class Socio extends Persona {
    int codigoSocio;

    public Socio(int nombre, int dni, int codigoSocio) {
        super(nombre, dni);
        this.codigoSocio = codigoSocio;
    }

    public void imprimirCreddencial(){
        System.out.println("CREDENCIAL");
        System.out.println("Socio: "+ codigoSocio+" Nombre: "+getNombre());
   }
}
