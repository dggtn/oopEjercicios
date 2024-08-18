package Ejercicio2;


public class ControladorDeAscensor {
   private Ascensor ascUno ;
   private Ascensor ascDos ;

   public ControladorDeAscensor(Ascensor ascUno,Ascensor ascDos){
       this.ascUno = ascUno;
       this.ascDos = ascDos;

   }

   public void llamar(int PisoDesdeElQueMeEstanLlamando){

       int diferenciaConAscensor1 = Math.abs(PisoDesdeElQueMeEstanLlamando - ascUno.pisoActual());
       int diferenciaConAscensor2 = Math.abs(PisoDesdeElQueMeEstanLlamando - ascDos.pisoActual());

       if(diferenciaConAscensor1<diferenciaConAscensor2){
           ascUno.llamar(PisoDesdeElQueMeEstanLlamando);

       }
       else if(diferenciaConAscensor1==diferenciaConAscensor2) {
           ascUno.llamar(PisoDesdeElQueMeEstanLlamando);
       }
       else{
           ascDos.llamar(PisoDesdeElQueMeEstanLlamando);
       }
   }
}
    ;

