package basic.c07_functions;

public class FunctionsTeoria {


    public static void main(String[] args) {

        int numero1 = 15;
        int numero2 = 10;
        int numero3 = 15;

        int resultado;

        resultado = FunctionsTeoria.suma(numero1, numero2, numero3);

        System.out.println(resultado);
        
    }


    // DECLARACION
    //Modificadores    tipoRetorno                  nombreFuncion
    //public           void - No retorna nada       Solo no debe empezar con numeros y no debe contener palabras reservadas
    //private          int - Entero
    public static int suma(int numero1, int numero2, int numero3){
        int resultado = 0;

        resultado = numero1 + numero2 + numero3;

        return resultado;
    }





}
