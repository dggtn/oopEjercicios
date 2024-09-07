package Ejercicio12;

import java.util.ArrayList;

public class Banco {
    ArrayList<Cuenta> cuentas = new ArrayList<>();
    public void agregar(Cuenta c) {
        cuentas.add(c);
    }
    public void cobrarMantenimientoMensual(){
        for (Cuenta cuenta:cuentas) {
            cuenta.extraer(50);
        }
    }
    public void mostrar(){
            for (int i = 0; i < cuentas.size(); i++) {
                System.out.println(cuentas.get(i));
            }
        }
    };


