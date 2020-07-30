package manejocolecciones;

import java.util.*;

public class ManejoColecciones {

    //List es hija de Collection
    public static void main(String[] args) {
        List miLista = new ArrayList(); //permite agregar elementos de forma dinamica ordenadamente

        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        //elemento repetido
        miLista.add(3);
        
        imprimir(miLista);
        
        //Set
        
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //elemento repetido
        miSet.add("300"); //El elemento repetido no se agragará, revisa si hay repeditos almacenados con anterioridad 
        
        imprimir(miSet);
        
        //Map
        
        Map miMapa = new HashMap(); //No respeta el orden
        
        miMapa.put("valor1", "juan");
        miMapa.put("valor2" , "carla");
        miMapa.put("valor3", "carlos");
        //elemento repetido
        miMapa.put("valor3", "rosario"); //Sustituye al valor agregado previamente
        
        //imprimimos las llaves
        imprimir(miMapa.keySet());
        //imprimimos los valores
        imprimir(miMapa.values());
    }

    private static void imprimir(Collection c) {

        for (Object elemento : c) {
            System.out.println("elemento: " + elemento);
        }

        System.out.println("");
    }
}
