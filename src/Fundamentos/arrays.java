package Fundamentos;

public class arrays {
    //------------------------------------------------------------------------------------------------------------------
    //ARRAYS DE UNA DIMENSION
    public static void main(String[] args) {
        System.out.println("ARRAY DE UNA DIMENSION");
        //Asignar una array de una dimension
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numeros[0]);//Imprimimos el valor de la posicion 0
        //En este caso vamos a cambiar un dato de la array
        numeros[1] = 3;
        //se ha cambiado el valor de la posicion 1 uqe corresponde al numero 2 por un 3
        System.out.println(numeros[1]);
        //imprimimos el dato de la arrays 1 y nos dara la nueva asignacion que es 3


        int size = numeros.length; //Aqui asignamos a size el valor de la longitud de la array
        System.out.println(size); //Aqui imprimimos el valor de size

        System.out.println(numeros.length);//Aqui imprimimos el tamaño de la array

        //--------------------------------------------------------------------------------------------------------------

        //ARRAY BIDIMENSIONAL
        System.out.println("ARRAY BIDIMENSIONAL");

        int[][]bidimensional= new int[2][4];//Declaramos una array de dos dimensiones
        int arrayb[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};//Asignamos,Isntanciamos o inicializamos numeros a la array
        System.out.println(arrayb[0][0]);//El resultado sera el 1
        System.out.println(arrayb[1][1]);//El resultado sera el 6
        System.out.println(arrayb[2][2]);//El resultado sera el 11
        System.out.println(arrayb[3][3]);//El resultado sera el 16

        //ARRAY TRIDIMENSIONAL
        System.out.println("ARRAY TRIDIMENSIONAL");
        int[][][] array3d={{{1,2},{3,4}},{{5,6},{7,8}}};//Declaramos e instanciamos una array de tres dimensiones
        // int[][][] array3d2 [2][2][2];//Aqui estamos declarando una array de 3d de diferente forma

        System.out.println(array3d[0][0][0]);//resultado sera 1
        System.out.println(array3d[0][1][0]);//Resultado sera 3
        System.out.println(array3d[1][0][0]);//Resultado sera 5
        System.out.println(array3d[1][1][0]);//Resultado sera 7
    }
}
