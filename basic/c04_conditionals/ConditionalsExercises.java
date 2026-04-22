
/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 20;
        if (edad >= 18){
            System.out.println("Puede votar");
        }else {
            System.out.println("No puede votar");
        }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int num1 = 10;
        int num2 = 20;
        if (num1 > num2){
            System.out.println("El mayor es: " + num1);
        }else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("Son iguales");
        }
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int numero = -5;
        if (numero > 0) {
            System.out.println("Es positivo");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }
        // 4. Crea un programa que diga si un número es par o impar.
        int n = 8;
        if (n % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        // 5. Verifica si un número está en el rango de 1 a 100.
        int valor = 50;
        if (valor >= 1 && valor <= 100) {
            System.out.println("Esta en el rango");
        }else {
            System.out.println("Esta fuera del rango");
        }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int calificacionAlumno = 85;
        // Sobresaliente
        if (calificacionAlumno >= 90 && calificacionAlumno <= 100) {
            System.out.println("El alumno es sobresaliente");
        } 
        // Aprobado
        else if (calificacionAlumno >= 60 && calificacionAlumno <= 89) {
            System.out.println("El alumno esta aprobado");
        } 
        // No aprobado (Reprobado)
        else if (calificacionAlumno >= 0 && calificacionAlumno <= 59) {
            System.out.println("El alumno esta reprobado");
        } 
        else {
            System.out.println("Calificacion no valida");   // 101
        }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edadCine = 14;
        boolean acompanado  = true; 
        if (edadCine >= 15 || acompanado) {
            System.out.println("Puede entrar al cine");
        } else { 
            System.out.println("No puede entar al cien");
        }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'a';
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra =='o' || letra == 'u') {
            System.out.println("Es vocal");
        } else { 
            System.out.println("Es constante");
        }
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = 5;
        int b = 9;
        int c = 3;
        if (a >= b && a >= c) {
            System.out.println("El mayor es: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es: " + b);
        } else {
            System.out.println("El mayor es: " + c);
        }
    }
}
