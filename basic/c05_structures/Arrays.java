package basic.c05_structures;

/*
Clase 40 - Arrays
Vídeo: https://youtu.be/JOAqpdM36wI?t=11194
*/

public class Arrays {

    public static void main(String[] args) {

        //Declaracion y creacion

        int[] arraysEnteros = new int[5];

        //  0     1     2     3     4
        //[35]-[245]-[ 0 ]-[90]-[   ]

    
        arraysEnteros[0] = 35;
        arraysEnteros[1] = 245;
        arraysEnteros[2] = 0;
        arraysEnteros[3] = 90;

        System.out.println(arraysEnteros[0]);
        System.out.println(arraysEnteros[1]);
        System.out.println(arraysEnteros[2]);
        System.out.println(arraysEnteros[3]);

        int[] numbers = {35, 12, 14, 18};
        //int numbers = new int[4]

        //[ 35 ]-[ 12 ]-[ 14 ]-[ 18 ]


        String[] names = {"Aaron", "Marie", "Sofia", "Joel"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);


        // Modificación
        System.out.println("/***********************/");
        System.out.println("/Modificacion/");
        
        
        names[0] = "Ismael";
        System.out.println(names[0]);
        
        names[3] = "Elia";
        
        
        
        System.out.println("/***********************/");
        boolean[] booleansArray = new boolean[3];


        boolean normal = true;
        boolean[] arregloBool = {true, false};

        //Cargando la informacion en los vagones
        booleansArray[0] = true;
        booleansArray[1] = false;
        booleansArray[2] = true;

       System.out.println(booleansArray[0]);
       System.out.println(booleansArray[1]);
       System.out.println(booleansArray[2]);
    }
}
