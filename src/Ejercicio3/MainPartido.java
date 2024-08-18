package Ejercicio3;

public class MainPartido {
    public static void main(String[] args) {
    Equipo equipo1 = new Equipo("jj");
    Equipo equipo2= new Equipo("jji");
    Partido partido = new Partido(equipo1,equipo2);

    partido.encestar("jj","triple");
    partido.encestar("jji","doble");
    partido.encestar("jji","doble");
    partido.encestar("jj","doble");
    partido.encestar("jj","doble");
    partido.encestar("jji","errado");
    partido.encestar("jji","tiro libre");

    partido.mostrarMarcador();
}
}
