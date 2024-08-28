package Ejercicio8;

public class MainEjercicio8 {
    public static void main(String[] args) {
        Nota nota=new Nota();
        Profesor profesor = new Profesor();

        nota.setNota(8);
        System.out.println( profesor.corregir(nota));
        System.out.println(nota.getValor());

    }
};