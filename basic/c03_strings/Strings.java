package basic.c03_strings;

public class Strings {

    public static void main(String[] args) {

        /*
        Clase 24 - Strings
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8140
        */

        //Primitivos
        // int
        // char
        // boolean


        //No primitivos
        // String


        // API 
        // Interface Programming Application 
        // Redes conectate a una API. 

        // Es un conjunto de reglas, clases, paquetes e interfaces predefinidas.



        // Declaración
        String name = "Raul";
        String lastname = "Barragan";

        String apellidoMaterno = new String("Martinez");


        // Operaciones básicas

        /*
        Clase 25 - Concatenación
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8367
        */

        // Concatenación
        System.out.println(name + " " + lastname );
        System.out.println(name + "\n" + lastname );


        /*
        Clase 26 - length
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8469
        */

        // Longitud
        System.out.println("La longitud de " + name + " es:");
        System.out.println(name.length());

        /*
        Clase 27 - charAt
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8535
        */

        // Obtener carácter
        // 0 1 2 3
        // R a u l
        System.out.println(name.charAt(3));

        String nombreCliente = "Carlos Barragan Monter";
        char inicialNombre = nombreCliente.charAt(0);

        if (inicialNombre == 'I'){
            System.out.println("Cliente valido");
        }else{
            System.out.println("Cliente NO valido");

        }


        /*
        Clase 28 - substring
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8707
        */

        // Subcadena
        // 0 1 2 3 4 5 6 7 8 9 10 11
        // E s t e   m e n s a j  e 

        String mensaje = "Este mensaje";
        System.out.println(mensaje.substring(5));
        System.out.println(mensaje.substring(2, 7)); // t e   m e

        /*
        Clase 29 - toUpperCase / toLowerCase
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8831
        */

        // Mayúsculas y minúsculas
        System.out.println(name);               // Raul
        System.out.println(name.toUpperCase()); // RAUL
        System.out.println(name.toLowerCase()); // raul

        // raul barragan toUpperCase -> RAUL BARRAGAN

        /*
        Clase 30 - contains
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8947
        */

        // Comprobar si contiene
        System.out.println("/**********************************/");
        System.out.println("Contains");


        String mensajeLargo = "El dia de hoy comi pechuga y tome agua de jamaica";
        
        
        System.out.println(mensajeLargo.contains("jamaica"));
        System.out.println(mensajeLargo.contains("salchichas"));
        System.out.println(mensajeLargo.toUpperCase().contains("AGUA"));
        
        System.out.println("/**********************************/");


        /*
        Clase 31 - equals
        Vídeo: https://youtu.be/JOAqpdM36wI?t=9118
        */

        // Comparación
        
        String alumno1 = "Aaron"; // Cadena
        String alumno2 = "Aaron"; // Cadena
        String alumno3 = new String("Aaron"); // Objeto 

        System.out.println("Equals");
        System.out.println(alumno1.equals(alumno2));
        System.out.println(alumno1.equalsIgnoreCase(alumno2));



        // == vs. equals
        System.out.println(alumno1 == alumno2);
        System.out.println(alumno1 == alumno3);
        System.out.println(alumno1.equals(alumno3));
        System.out.println("/**********************************/");


        /*
        Clase 32 - trim y replace
        Vídeo: https://youtu.be/JOAqpdM36wI?t=9456
        */

        // Trim
        String otroMensaje = "             Este      es u    n    mensa je    diferente         ";
        System.out.println(otroMensaje);
        System.out.println(otroMensaje.trim());
        
        
        
        String otroMensajeDiferente = "             Este      es u    n    mensa je    diferente         ";
        System.out.println(otroMensajeDiferente.replace("e", "i"));
        /*
        Clase 33 - format
        Vídeo: https://youtu.be/JOAqpdM36wI?t=9613
        */

        // Format

        String user = "Carlos";
        int edad = 25;
        System.out.println(String.format("Hola soy Carlos y tengo 25", user, edad));

        // %s String
        // %d int
        // %f float


    }
}
