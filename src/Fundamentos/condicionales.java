package Fundamentos;

public class condicionales {
    //------------------------------------------------------------------------------------------------------------------
    //CONDICIONALES
    public static void main(String[]args) {

        //Ectructura IF ELSE

        int numero = 0;
        if (numero == 0) {
            //Si se cumple esta condicion ejecuto la linea de codigo
            System.out.println("Condicion cumplida");
        } else {
            //Si no se cumple ejecuto esta otra line ade codigo
            System.out.println("Condicion no cumplida");
        }
        //Seguimos con el IF,ELSE IF y ELSE
        int condicion = 0;
        if (condicion == 1) {
            System.out.println("Condicion 1 cumplida");//Condicion no cumplida pasa al else if
        } else if (condicion == 2) {
            System.out.println("Condicion 2 cumplida");//Condicion no cumplida pasa al else
        } else {
            System.out.println("Ninguna de las dos primeras condiciones cumplidas");//la consola imprimira esta ultima
        }
        //--------------------------------------------------------------------------------------------------------------
        //ectructura de SWITCH

        String nombre="Sergio";
        switch (nombre){
            case"Jose":
                System.out.println("El nombre intoducido es Jose ");//La condicion no se cumplira
                break;
            case"Manuel":
                System.out.println("El nombre intoducido es Manuel");//La condicion no se cumplira
                break;
            case"Pepe":
                System.out.println("El nombre intoducido es Pepe");//La condicion no se cumplira
                break;
            case"Sergio":
                System.out.println("El nombre intoducido es Sergio");//La condicion se cumplira imprimira y pasara al break
                break;//al leer break el programa salta y las demas condiciones no seran contempladas
            case"Ambrosio":
                System.out.println("El nombre intoducido es Ambrosio");//La condicion no se contemplara
                break;
            default:
                System.out.println("El nombre intoducido no es niniguno de los contemplados");//La condicion no se contemplara
        }
    }
}
