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
        System.out.println("Numeros del 1 al 10: ");
        
        int num = 1;

while (numero <= 10) {
    System.out.println(numero);
    numero++;
    
}
        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        System.out.println("\nValoresd del ArrayList:");

        ArrayList<String> nombres =new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Chamira");
        nombres.add("Ismael");

        int i = 0;

        do {
            System.out.println(nombres.get(i));
            i++;
        } while (i < nombres.size());
        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.

        System.out.println("Multiplos de 5 del 1 al 50");

        for(int i = 5; i <= 50; i += 5) {
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
        
        System.out.println("Números del 1 al 20 sin múltiplos de 3:");

        for (int i = 1; i <= 20; i++) {

            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);
        }
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        
        System.out.println("\nRecorriendo array:");

        int[] numeros = {5, 8, 12, -4, 20, 30};

        for (int numero : numeros) {

            if (numero < 0) {
                System.out.println("Número negativo encontrado: " + numero);
                break;
            }

            System.out.println(numero);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
    
        System.out.println("\nFactorial:");

        int numero = 5;
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}