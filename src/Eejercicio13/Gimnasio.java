package Eejercicio13;

import java.util.ArrayList;

public class Gimnasio {
    private String nombre;
    private ArrayList<Clase>clases= new ArrayList<>();
    private ArrayList<Socio>socios= new ArrayList<>();

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        clases.add(new Clase(8,"zumba","lunes",100));
        clases.add(new Clase(9,"zumba","lunes",100));
        clases.add(new Clase(10,"zumba","lunes",100));


        clases.add(new Clase(8,"taebo","martes",100));
        clases.add(new Clase(9,"taebo","martes",100));
        clases.add(new Clase(10,"taebo","martes",100));
    }

    public void mostrarHorario(){
        for(Clase clase : clases){
            System.out.println(clases);
        }

    }

    public void agregarSocios() {
    }
}
