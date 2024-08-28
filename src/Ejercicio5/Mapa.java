package Ejercicio5;

public class Mapa {
    int distanciaEntreAyB;
    int distanciaEntreByC;
    int distanciaEntreAyC;
    public Mapa(int distanciaEntreAyB,int distanciaEntreByC,int distanciaEntreAyC){
       this.distanciaEntreAyB = distanciaEntreAyB;
       this.distanciaEntreByC = distanciaEntreByC;
       this.distanciaEntreAyC = distanciaEntreAyC;
    }
    public int distancia(String desde,String hasta){
        if(desde=="A"){
            if (hasta=="C") {
                return distanciaEntreAyC;
        } else{
            return distanciaEntreAyB;
        } } else{
            return distanciaEntreByC;
        }
    }
}
