package Ejercicio8;

public class Nota {
    private int nota;

    public Nota(){

    }
    public void setNota(int notaAsignada){
       nota=notaAsignada;
    }
    public int getValor(){
        if (nota>10 | nota<1){
            nota=-1;
        }else {
            int nota1=nota;
        }
        return nota;
    }
}
