

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String name = "Carlos";
        String lastname = "Barragan";
        System.out.println(name + " " + lastname );
        System.out.println(name + "\n" + lastname );
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("La longitud de " + name + " es:");
        System.out.println(name.length());
        // 3. Muestra el primer y último carácter de un string.
        String mensaje = "Mola mundo";
        System.out.println("Primer caracter: " + mensaje.charAt(0));
        System.out.println("Ultimo caracter: " + mensaje.charAt(mensaje.length() - 1));
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println("Contains");
        String mensajelargo = "El da de hoy me levante temprano para la tarea";
        System.out.println(mensajelargo.contains("tarea"));
        // 6. Formatea un string con un entero.
        int edad = 22;
        String texto = String.format("Mi edad es %d anios", edad);
        System.out.println(texto);
        // 7. Elimina los espacios en blanco al principio y final de un string.
        String otroMensaje = "      B   u  en  o  s  di  as";
        System.out.println(otroMensaje);
        System.out.println(otroMensaje.trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        String otroMensajeDiferente = "      B   u  en  o  s  di  as";
        System.out.println(otroMensajeDiferente.replace(" ", "-"));
        // 9. Comprueba si dos strings son iguales.
        String alumno1 = "Carlos";
        String alunmo2 = "Carlos";
        System.out.println("equals");
        System.out.println(alumno1.equals(alunmo2));
        System.out.println(alumno1.equalsIgnoreCase(alunmo2));
        // 10. Comprueba si dos strings tienen la misma longitud.
        String texto1 = "Hola";
        String texto2 = "Broo";
        if (texto1.length() == texto2.length()) {
        System.out.println("Tienen la misma longitud");
        } else {
        System.out.println("No tienen la misma longitud");
        }
    }
}
