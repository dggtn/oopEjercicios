package Ejercicio8;

public class Profesor {
    
    public String corregir(Nota nota){
        String mensaje = "";
        int nota1=nota.getValor();
        if(nota1==-1){
            mensaje="INAVLIDA";
        } else if (nota1>=1 && nota1<=3) {
            mensaje="APLAZADO";
        } else if (nota1>=4 && nota1<=6) {
            mensaje="APROBADO";
        } else if (nota1>=7 && nota1<=10) {
            mensaje="PROMOCIONA";
        }
        ;
        return mensaje;
    }
}
