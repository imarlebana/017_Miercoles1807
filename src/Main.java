import biblioteca.Biblioteca;
import biblioteca.Disco;
import biblioteca.Libro;
import biblioteca.Recurso;
import interfaces.IPrestable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Biblioteca> recursos = new ArrayList<>();
        recursos.add(new Disco());
        recursos.add(new Libro());

        for(Biblioteca b : recursos){

            IPrestable ip = (IPrestable) b;
            ip.


        }

        System.out.println("¿Que desea hacer?");
        System.out.println("1. Ver numero de libros prestados");
        System.out.println("2. Publicaciones anteriores a una fecha");
        System.out.println("3. Ver publicaciones y discos");
        System.out.println("4. Ver publicaciones y discos y estado.");
        System.out.println("5. Salir");


    }
}
