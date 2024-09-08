package Eejercicio13;

public class Clase {
    private int hora;
    private int precio;
    private String dia;
    private String tipo;

    @Override
    public String toString() {
        return "Clase{" +
                "hora=" + hora +
                ", precio=" + precio +
                ", dia='" + dia + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public Clase(int hora, String tipo, String dia, int precio) {
        this.hora = hora;
        this.tipo = tipo;
        this.dia = dia;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
