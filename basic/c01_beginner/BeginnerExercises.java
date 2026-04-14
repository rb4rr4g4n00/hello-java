
/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String nombre = "Carlos";
        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 25;
        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.80;
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean gustaProgramar = true;
        // 5. Declara una constante con tu email.
        final String EMAIL = "tuemail@ejemplo.com";
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'C';
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Ciudad de Mexico";
        System.out.println("Localidad original: " + localidad);

        localidad = "Otro lugar"; 
        System.out.println("Localidad despues de cambiar: " + localidad);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 21;
        int b = 25;
        System.out.println("La suma de a + b es: " + (a + b));
        // 9. Imprime el tipo de dos variables creadas anteriormente.

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int numero;
        numero = 100;
        System.out.println("Valor de la variable después de asignarle: " + numero);

        // --- Imprimir todos los datos para ver el resultado ---
        System.out.println("\n--- Datos personales ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("¿Te gusta programar?: " + gustaProgramar);
        System.out.println("Email: " + EMAIL);
        System.out.println("Inicial: " + inicial);






    }
}
