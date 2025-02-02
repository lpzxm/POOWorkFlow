package Guia2;

import java.util.ArrayList;
import java.util.Collection;

public class EjemploCollection {
    public static void main(String[] args) {
        Collection listaMarcasCoches = new ArrayList <String>(); //tipo de coches es collection tipo string
        //agregando informacion
        listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");

        System.out.println("Numero elementos antes de eliminar de collection:" + listaMarcasCoches.size());
        System.out.println("Elementos: " + listaMarcasCoches.toString());

        listaMarcasCoches.remove ("Seat");     //Removiendo elemento por nombre
        listaMarcasCoches.remove ("Mercedes"); //Removiendo elemento por nombre
        System.out.println("Número  elementos  después  de  eliminar  Seat  y  Mercedes:" + listaMarcasCoches.size() ) ;
        System.out.println("Elementos: " + listaMarcasCoches.toString () );

    }
}
