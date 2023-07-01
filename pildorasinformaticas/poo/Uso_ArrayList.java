package poo;

import java.util.*;

public class Uso_ArrayList {

    public static void main(String[] args) {
        //ARRAY
        /* Empleado listaEmpleados[] = new Empleado[4];//Array de 4 elementos

        //Creo objeto de tipo Empleado y los almaceno en cada una de las posiciones del Array
        listaEmpleados[0] = new Empleado("Ana", 45, 48000);
        listaEmpleados[1] = new Empleado("Antonio", 28, 28000);
        listaEmpleados[2] = new Empleado("Roberto", 33, 30000);
        listaEmpleados[3] = new Empleado("Daniel", 25, 10500);*/

        //ArrayList
        ArrayList<Empleado> listaEmpleados = new ArrayList();

        //listaEmpleados.ensureCapacity(11);//sirve para darle una capacidad al arrayLis
        //listaEmpleados.trimToSize();//
        //Metodo .get sirve para obtener dato de un arrayList
        //System.out.println(listaEmpleados.get(4).dameDatos());
        //Agregue elementos con el metodo .add 
        listaEmpleados.add(new Empleado("Ana", 45, 48000));
        listaEmpleados.add(new Empleado("Daniel", 28, 30000));
        listaEmpleados.add(new Empleado("Antonio", 33, 28000));
        listaEmpleados.add(new Empleado("Roberto", 25, 10500));

        //Metodo .set sirve para ponerle un lugar al elemento que vas a ingresar, en este caso la posicion es dos
        listaEmpleados.set(1, new Empleado("Olga", 25, 10500));

        //metodo .size es para saber cuanto elementos tiene el arrayList
        System.out.println(listaEmpleados.size());

        //Utilizo for eah para Imprimir cada unos de los objetos que tengo guardado en cada posicion del array
         for (Empleado e : listaEmpleados) {
            System.out.println(e.dameDatos());

        }
         System.out.println("---------------Iterator----------------");
         
        //metodo Iterator nos permite acceder secuencialmente a los elementos de una coleccion
        Iterator<Empleado> miIterador = listaEmpleados.iterator();
        while (miIterador.hasNext()) {
            System.out.println(miIterador.next().dameDatos());
        }

    }

}

class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    //Constructor
    public Empleado(String nom, int edad, double salario) {
        this.nombre = nom;//Asigno valor al argumento a las variables de class
        this.edad = edad;
        this.salario = salario;
    }

    //Metodo proporciona datos que establecemos en el constructor
    public String dameDatos() {
        return "El empleado se llama " + nombre + ". Tiene " + edad + " Y su salario es : " + salario;
    }

}
