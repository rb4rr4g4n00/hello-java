package basic.c05_structures;

/*
Clase 41 - Listas
Vídeo: https://youtu.be/JOAqpdM36wI?t=12233
*/

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {


        // El tipo de variable   =      
        ArrayList<String> names        =        new ArrayList<>();

        System.out.println("/////////////////////////////");
        System.out.println("Tamanio");
        System.out.println(names.size());


        // Inserción
        names.add("Carlos");
        names.add("Raul");
        names.add("Ismael");
        System.out.println(names.size());


        String[] fruits = new String[3];
        fruits[0] = "Manzana";


        System.out.println(names.get(0));


        // Modificación
        names.set(0, "Joel");

        System.out.println(names.get(0));


        // Eliminación
        names.remove(0);

        System.out.println(names.get(0));
        System.out.println(names.size());

        System.out.println(names);


        // Búsqueda
        System.out.println(names.contains("Marie"));


        
        
        // Limpieza
        System.out.println(names.size());
        names.clear();
        System.out.println(names.size());
        names.add("Octavio");

        System.out.println(names);


        System.out.println("//////////////////////////////////////////////");
    }
}
