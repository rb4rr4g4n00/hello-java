package basic.c05_structures;

import java.util.ArrayList;

/*
Clase 43 - Maps
Vídeo: https://youtu.be/JOAqpdM36wI?t=14574
*/

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // Declaración y creación
        System.out.println("//////////Declaración y creación///////////////");
        
        HashMap<String, String> personas = new HashMap<>();
        System.out.println(personas.size()); 
        // .size() METODO
        
        System.out.println("//////////Insertar valores///////////////");
        personas.put("name", "Carlos");
        personas.put("last", "Barragan");
        personas.put("old", "26");
        personas.put("color", "Azul");
        personas.put("email", "correo_cb@gmail.com");
        
        System.out.println(personas.size()); 
        
        System.out.println("//////////Acceso valores///////////////");
        System.out.println(personas);
        System.out.println(personas.get("old"));
        
        System.out.println("//////////Verificación///////////////");
        System.out.println(personas.containsKey("job"));
        
        System.out.println(personas.containsValue("correo_cb@gmail.com"));

        System.out.println("//////////Eliminación///////////////");
        System.out.println(personas);
        System.out.println(personas.remove("email"));
        System.out.println(personas);

        personas.put("email", "rb@gmail.com");
        
        System.out.println("//////////Limpieza///////////////");
        System.out.println(personas);
        //personas.clear();
        System.out.println(personas);

        System.out.println("//////////Modificación///////////////");
        System.out.println(personas);
        personas.put("email", "carlos@gmail.com");
        personas.put("email", "carlos@gmail2.com");
        personas.put("email", "carlos@gmail3.com");
        System.out.println(personas);
        
        System.out.println(personas);
        personas.replace("old", "30");
        System.out.println(personas);
        
        System.out.println(personas);
        personas.putIfAbsent("old", "45");
        System.out.println(personas);
        
        
        System.out.println("//////////Especiales///////////////");
        System.out.println(personas.isEmpty());


        System.out.println(personas);
        
        if(!personas.isEmpty()){
            personas.clear();
        }

        System.out.println(personas);


     }
}
