

import java.util.ArrayList;

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
        ArrayList<String> nombres = new ArrayList<>()
        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");
        System.out.println("ArrayList original: " + nombres);
        nombres.remove("Luis");
        System.out.println("ArrayList después de eliminar: " + nombres);
    }
        // 5. Crea un HashSet con 2 valores diferentes.

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        // 7. Elimina uno de los elementos del HashSet.

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.

        // 9. Modifica uno de los contactos y elimina otro.

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
    }
}
