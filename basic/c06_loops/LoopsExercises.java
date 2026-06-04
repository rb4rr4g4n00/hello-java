package basic.c06_loops;
import java.util.HashMap;
import java.util.ArrayList;

/*
Clase 50 - Ejercicios: Bucles
Vídeo: https://youtu.be/JOAqpdM36wI?t=17993
*/

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        System.out.println("Multiplos de 5 del 1 al 50");

        for(int = 5; i <= 50; i += 5) {
            System.out.println(i);
        }
        // 4. Recorre un Array de 5 números e imprime la suma total.

        int[] numeros = {10, 29, 30, 40, 50};
        int suma =0;    

        for (int i = 0; i < numeros.length; i++) {
            suma+= numeros[i];

        }

        System.out.println("Suma total: " + suma);
        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        System.out.println("Valores del Array:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        
        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        ArrayList<String> animales = new ArrayList<>();
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Conejo");
        
        for(String animal : animales){
            System.out.println(animal);
        }
        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        
        System.out.println("Ejercicio 7. 10 al 1 desc");
        
        for(int index = 10; index >= 1 ; index-- ){
            System.out.println(index);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.

        // 10. Crea un programa que calcule el factorial de un número dado.
    }
}
