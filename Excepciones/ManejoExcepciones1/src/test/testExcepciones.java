package test;

import aritmetica.Aritmetica;
import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class testExcepciones {

    public static void main(String[] args) {
        int resultado = 0;

        try {
            resultado = division(10, 0);
            
        //Se recomienda poner los bloques catch de menor rango los primeros
        } catch(OperacionExcepcion ex){
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(ex.getMessage());
        }catch (Exception ex) {
            System.out.println("Ocurrió un error: ");
            ex.printStackTrace(System.out); //imprimimos la pila de excepciones
            System.out.println(ex.getMessage());
            
        } finally{ //Este bloque siempre se va a ejecutar
            System.out.println("Se revisó la división entre cero");
        }
        System.out.println("resultado = " + resultado);
    }
}
