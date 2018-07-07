package Fundamentos;

public class bucles {
    //------------------------------------------------------------------------------------------------------------------
    //TIPOS DE BUCLES
    public static void main(String[]args){

        //BUCLE FOR-----------------------------------------------------------------------------------------------------
        // for(inicializacioin;condicion;incremento)

        for(int i = 0; i<10 ; i++) {
            /*
             *Ejecutamos condicion
             *Si la condicion se cumple entrara dentro del bucle
             *Si no saltara a la siguiente condicion
             *hara la operacion de incremento o decremento
             */
        }

        //Este sera un Bucle for que sera infinito

        for(;;){
            System.out.println("Hola");
            //Al poner break le diriamos al bucle que finalice.
            break;
        }
        int array[]={1,2,3,4,5}; //declaramos una array para poder probar el bucle for each

        //BUCLE FOR EACH
        //Estre bucle recorrera tosdab la arrayd imprimiendo desde el 1 hasta el 5

        for (int a : array){
            System.out.println(a);
        }

        //BUCLE WHILE
        //el bucle while son con ncondiciones true o false
        //Este bucle se ejecutara al cumplir las condiciones

        int i=0;
        while(i<20){
            System.out.println("i vale " + i);
            i++;
        }
        System.out.println("____________________________________________");//Son lineas de separacion


        //BUCLE DO WHILE
        //Este bucle se ejecutara al menos una vez,aun que no se cumplan las condiciones
        do {
            System.out.println("i vale " + i++);
        } while(i<10);//Al no cumplirse esta condicion saldremos del bucle
    }
}
