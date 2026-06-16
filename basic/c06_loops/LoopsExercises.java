package basic.c06_loops;

import java.util.ArrayList;

/*
Clase 50 - Ejercicios: Bucles
Vídeo: https://youtu.be/JOAqpdM36wI?t=17993
*/

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while. YES

        // 2. Usa do-while para mostrar todos los valores de un ArrayList. YES

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for. SI

        // 4. Recorre un Array de 5 números e imprime la suma total. SI

        // 5. Usa un for para recorrer un Array y mostrar sus valores. SI

        // 6. Usa for-each para recorrer un ArrayList y HashMap. SI

        ArrayList<String> animales = new ArrayList<>();
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Conejo");
        
        for(String animal : animales){
            System.out.println(animal);
        }


        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for. SI
        //ASC 1 2 3 4 5
        //DESC 5 4 3 2 1
        System.out.println("Ejercicio 7. 10 al 1 desc");
        for(int index = 10; index >= 1 ; index-- ){
            System.out.println(index);
        }


        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20. YES
        //BREAK
        //CONTINUE
        

        System.out.println("Ejercicio 8. multiplos del 3 del 1 al 20");
        int aux = 1;
        while(aux < 21){
            if(aux % 3 == 0){
                System.out.print(aux + ", ");
            }
            aux++;
        }
        

        for(int j = 1; j<21; j++ ){
            System.out.println(j);
            if(j % 3 == 0){
                System.out.print(j + ", ");
            }
        }
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array. YES

        // 10. Crea un programa que calcule el factorial de un número dado. YES
    }
}
