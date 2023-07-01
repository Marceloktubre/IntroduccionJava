package Colecciones;

import java.util.*;

public class Prueba_Maps {

    public static void main(String[] args) {
        //dentro del rombo va la clave en este caso de tipo String y el valor que seria el objeto empleado
        HashMap<String, Empleado> personal = new HashMap<String, Empleado>();

        //almaceno(agrego) el objeto dentro del HashMap
        personal.put("145", new Empleado("Marcelo"));
        personal.put("146", new Empleado("Daniel"));
        personal.put("147", new Empleado("Marcos"));
        personal.put("148", new Empleado("Sandra"));

        System.out.println(personal);

        personal.remove("147");//elinina un elemento

        System.out.println(personal);

        personal.put("148", new Empleado("Raul")); //sustituir

        System.out.println(personal);

        System.out.println(personal.entrySet());//entrySet devuelve lo que hay almacenado dentro de la coleccion

        for (Map.Entry<String, Empleado> entrada : personal.entrySet()) {
            
            String clave= entrada.getKey();
            
            Empleado valor= entrada.getValue();
            
            System.out.println("Clave=" + clave + ", Valor=" + valor );

        }

    }

}

class Empleado {

    private String nombre;
    private double sueldo;

    public Empleado(String n) {
        nombre = n;
        sueldo = 2000;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

}
