package Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {

    public static void main(String[] args) {

        LinkedList<String> paises = new LinkedList();

        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Perú");

        LinkedList<String> capitales = new LinkedList();

        capitales.add("Madrid");
        capitales.add("Bogotá");
        capitales.add("DF");
        capitales.add("Lima");

        //System.out.println(paises);
        //System.out.println(capitales);
        ListIterator<String> itA = paises.listIterator();
        ListIterator<String> itB = capitales.listIterator();

        //blucle while: aquipongo las capitales dentro de los paises quedaria
        while (itB.hasNext()) {
            if (itA.hasNext()) {
                itA.next();
            }
            itA.add(itB.next());
        }
        System.out.println(paises);

        itB = capitales.listIterator();//inicializo nuevmente

        while (itB.hasNext()) {
            itB.next();//salto pocision
            if (itB.hasNext()) {
                itB.next();//salto posicion
                itB.remove();//elimino elemento

            }
            System.out.println(capitales);
            
            
            paises.removeAll(capitales);//elimina una coleccion
            
            System.out.println(paises);
            

        }

    }

}
