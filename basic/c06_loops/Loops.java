package basic.c06_loops;

import java.util.ArrayList;

/*
Clase 45 - Bucles
Vídeo: https://youtu.be/JOAqpdM36wI?t=15862
*/

import java.util.HashMap;
import java.util.Map;

public class Loops {

    public static void main(String[] args) {

        // Loops

        /*
        Clase 46 - for
        Vídeo: https://youtu.be/JOAqpdM36wI?t=16003
        */

        // - for controlado por contador


        for (int i = 1; i < 4; i++){
            System.out.println("Hola Mundo");
        }

        System.out.println("/***************************************************/");
        
        
        String[] nombres = {"Carlos", "Sofia", "Ismael", "Aaron"};

        System.out.println(nombres.length);
        for (int i = 0; i < nombres.length; i++ ){
            System.out.println(nombres[i]);
        }

        System.out.println("/***************************************************/");
        
        
        for(String nombre : nombres){
            System.out.println(nombre);
        }
        
        
        System.out.println("/***************************************************/");
        
        
        ArrayList<Integer> calificaciones = new ArrayList<Integer>();

        // int numero = 9;   Tipos primitivos
        // Integer numero = 9;   No primitivos
        // int == Integer


        calificaciones.add(5);
        calificaciones.add(8);
        calificaciones.add(8);
        calificaciones.add(9);
        calificaciones.add(7);

        for(Integer calificacion : calificaciones){
            System.out.println(calificacion);
        }

        // System.out.println(calificaciones.get(0));
        // System.out.println(calificaciones.get(1));
        // System.out.println(calificaciones.get(2));
        // System.out.println(calificaciones.get(3));
        // System.out.println(calificaciones.get(4));



        for(int index = 0; index < calificaciones.size(); index++){
            System.out.println(calificaciones.get(index));
        }



        System.out.println("/***************************************************/");


        //      Key      Value
        HashMap<String, String> correos = new HashMap<>();
        correos.put("Carlos", "carlos@gmail.com" );
        correos.put("Raul", "raul@hotmail.com" );
        correos.put("Ismael", "ismael@yahoo.com" );

        for(Map.Entry<String, String> correo : correos.entrySet()){
            //       key Value
            //correo [Carlos][carlos@gmail.com]

            System.out.println(correo.getKey());
            System.out.println(correo.getValue());
        }
        System.out.println("/***************************************************/");
        
        /*
        Clase 48 - while / do while
        Vídeo: https://youtu.be/JOAqpdM36wI?t=17199
        */

        // - while

        int index = 0;
        while (index < 5) {
            System.out.println("Hola, Java!");
            index++;
        }

        // index = 0;
        // while (index < names.length) {
        //     System.out.println(names[index]);
        //     index++;
        // }

        // index = 0;
        // boolean find = false;
        // while (!find) {
        //     System.out.println(names[index]);
        //     if (names[index].equals("Moure")) {
        //         find = true;
        //     }
        //     index++;
        // }

        // - do-while

        index = 0;
        do {
            System.out.println("Hola, Java!");
            index++;
        } while (index < 0);

        /*
        Clase 49 - Control de bucles
        Vídeo: https://youtu.be/JOAqpdM36wI?t=17688
        */

        // Control de bucles

        // - break

        // for (String name: names) {
        //     if (name.equals("Moure")) {
        //         break;
        //     }
        //     System.out.println(name);
        // }

        // - continue

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
