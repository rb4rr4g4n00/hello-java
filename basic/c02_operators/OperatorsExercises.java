/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
int a = 10;
int b = 3;

int suma       = a + b;
int resta      = a - b;
int multiplicacion   = a * b;
int division   = a / b;
int residuo    = a % b;
        // 2. Crea una variable para cada tipo de operación de asignación.

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
System.out.println(a > b);
System.out.println(a != b);
System.out.println(a >= b);
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
System.out.println(a < b);
System.out.println(a == b);
System.out.println(b > a);
        // 5. Utiliza el operador lógico and.
System.out.println(a > 5 && b < 5);
        // 6. Utiliza el operador lógico or.
System.out.println(a> 5 || b < 5);
        // 7. Combina ambos operadores lógicos.
System.out.println((a > 5 && b < 5) || (a < 5));
        // 8. Añade alguna negación.
System.out.println(!(a > b ));
        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        // 10. Combina operadores aritméticos, de comparación y lógicos.
    }
}
