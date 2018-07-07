package Fundamentos;

public class fundamentos {
}
//----------------------------------------------------------------------------------------------------------

//TIPOS DE COMENTARIOS EN JAVA

/**
 * ESTE COMENTARIO ES PARA LA DOCUMENTACION DE jAVA
 */


//ESTE COMENTARIO ES DE UNA LINEA Y ES PARA AYUDA AL PROGRAMADOR


/*
 * ESTE TIPO DE COMENTARIO ES IGUAL QIUE EL ANTERIOR PERO
 * PARA COMENTAR EN VARIAS LINEAS.
 */

/*
 *-------------------------------------------------------------------------------------
 *
 *  TIPOS DE DATOS PRIMITIVOS
 *
 *  BYTE--> desde el -127 a 127
 *  SHORT-->desde el -32768 a 32767
 *  INT--> desde el -2.147.483.648 a 2.147.248.647
 *  LONG-->Numeros Enteros Largos
 *  FLOAT-->Numero decimal corto
 *  DOUBLE-->Numeros con decimal largo
 *  CHAR-->Caracter unicode        Tiene una tabla(Codigo Ascii)
 *  BOOLEAN-->Dato logico True o False
 *  ------------------------------------------------------------------------------------
 *
 *  TIPOS NO PRIMITIVOS (STRING)
 *
 *  STRING-->Es una cadena de caracteres y sirve para almacenarlas
 *
 *    METODOS
 *         Length()-->Delvuelve la longitud de una cadena de caracteres.
 *         charAt(n)-->Devuelve la posicion de un caracter dentro de una cadena.
 *         substring(x,y)-->Devuelve una sub cadena dentro de la cadena siendo
 *                         x  = el caracter desde el que se extrae
 *                         y  = el numero de caracteres que se extraeran
 *         equals(cadena)--> devuelve True si dos cadenasque se comparan que dos cadenas que se comparan so iguales
 *         equalsIgnorecase-->(cadena) Como en el caso anterior pero pero sin  tener en cuenta las mayusculas de las minusculas.
 *--------------------------------------------------------------------------------------
 *
 *  OPERADORES NUMERICOS
 *
 *  +  --> Calcula la suma.
 *  -  --> Calcula la resta.
 *  *  --> Calcula la multiplicacion.
 *  =  --> Calcula la division.
 *  %  --> Este operador divide y asigna el resto de la division.
 *
 *--------------------------------------------------------------------------------------
 *
 *  OPERADORES DE TRUE O FALSE
 *
 *  <   --> Comprueba si el operando de la izquierda es menor que el de la derecha.
 *  >   --> Comprueba si el operando de la izquierda es mayor que el de la derecha.
 *  <=  --> Comprueba si el operando de la izquierda es menor o igual que el de la derecha.
 *  >=  --> Comprueba si el operando de la izquierda es mayor o igual que el de la derecha.
 *  !=  --> Comprueba si los operandos son distintos.
 *  ==  --> Comprueba si los operandos son iguales.
 *
 * -------------------------------------------------------------------------------------
 *
 *  OPERADORES LOGICOS
 *
 *  &  --> AND. Si todos los operadpores son True devuelve como resultado True.
 *  && --> AND. Si el primer operandpo devuelve False el siguiente operando no se evalua.
 *  |  --> OR. Si cualquiera de los operandos es True devuelve como resultado True.
 *  || --> OR. Si el primer operando devuelve True el siguiente operando no se evalua.
 *   ! --> NOT. Invierte el valor de una operacion booleana. Si el valor es True el siguiente operando no se evalua.
 *   ^ --> XOR. Si uno de los operadores es True y el otro False da como resultado True
 *              Si los dos son iguales da como resultado False.
 *
 * --------------------------------------------------------------------------------------
 *
 *  OPERADORES UNARIOOS
 *
 *  ñ(Su rabo) --> Realiza el complemento a 1 de un valor de tipo primitivo entero.
 *  -          --> Cambia el signo de el operando, que puede ser de tipo primitivo o real.
 *
 * --------------------------------------------------------------------------------------
 *
 *  OPERADORES DE ASIGNACION
 *
 *  (++) --> Incremento Suma 1 al valor actual.
 *  (--) --> Decremento Resta 1 al valor actual.
 *    =  --> Asiugnacion simple.
 *   *=  --> Multiplicacion y asignacion del valor resultantre de la multiplicacion.
 *   /=  --> Division y asignacion deñl valor resultante de la division.
 *   %=  --> Divide y asigna el resto de la division.
 *   +=  --> Suma y aignacion de el valor resultante de la suma
 *   -=  --> Resta y asigna el valor resultante de la resta.
 *   <<= -->Desplazamiento a la izquierda y asignacion del valor resultante.
 *   >>= -->Desplazamiento a la derecha y asignacion del valor resultante.
 *   >>>=--> Desplazamiento a la derecha con ceros y asignacion del valor resultante.
 *   &=  -->Operacion AND Sobre bits y asignacion del valor resultante.
 *   |=  -->Operacion OR Sobre bits y asignacion del valor resultante.
 *   ^=  -->Operacion XOR Sobre bits y asignacion del valor resultante.
 *
 */