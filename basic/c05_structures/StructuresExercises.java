import java.util.ArrayList;
import java.util.HashMap;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Longitud del array: " + numeros.length);


        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Valor antes de modificar: " + numeros[2]);

        numeros[2] = 99;

        System.out.println("Valor después de modificar: " + numeros[2]);


        // 3. Crea un ArrayList vacío.
        ArrayList<String> nombres = new ArrayList<>();


        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Maria");

        System.out.println("ArrayList original: " + nombres);

        nombres.remove("Luis");

        System.out.println("ArrayList después de eliminar: " + nombres);

        // 5. Crea un HashSet con 2 valores diferentes.


        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.


        // 7. Elimina uno de los elementos del HashSet.


        // 8. Crea un HashMap donde la clave sea un nombre
        // y el valor el número de teléfono. Añade tres contactos.

        HashMap<String, String> contactos = new HashMap<>();

        System.out.println(contactos.size());

        contactos.put("Carlos", "5608764534");
        contactos.put("Ismael", "5634901154");
        contactos.put("Chamira", "562839290");

        System.out.println("Contactos: " + contactos);


        // 9. Modifica uno de los contactos y elimina otro.

        contactos.put("Carlos", "5550000");

        contactos.remove("Ismael");

        System.out.println("Contactos actualizados: " + contactos);


        // 10. Dado un Array, transfórmalo en un ArrayList
        // y finalmente en un HashMap con clave y valor iguales.

        String[] frutas = {"Manzana", "Pera", "Uva", "Mango"};


        // Array → ArrayList
        ArrayList<String> listaFrutas = new ArrayList<>();

        for (String fruta : frutas) {
            listaFrutas.add(fruta);
        }

        System.out.println("ArrayList: " + listaFrutas);


        // ArrayList → HashMap
        HashMap<String, String> mapaFrutas = new HashMap<>();

        for (String fruta : listaFrutas) {
            mapaFrutas.put(fruta, fruta);
        }

        System.out.println("HashMap: " + mapaFrutas);

    }
}