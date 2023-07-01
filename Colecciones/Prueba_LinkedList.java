package Colecciones;

import java.util.*;

public class Prueba_LinkedList {

    public static void main(String[] args) {
        //creo un LinkedList e instacio---lista ordenada
        LinkedList<String> personas = new LinkedList();
        
        //agrego nombres al linkedList
        personas.add("Pepe");
        personas.add("Dany");
        personas.add("Marcelo");
        
        //muestro por pantalla el tamaño del linkedList
        System.out.println(personas.size());
        
        //Creamos un Iterator
        ListIterator<String>it= personas.listIterator();
        //nos desplazamos una posicion .next
        it.next();
        //queda en segunda posicion
        it.add("Juan");
        
        
        //muestro por pantalla los nombres
        for (String e : personas) {
            System.out.println(e);
            
        }
    }

}
