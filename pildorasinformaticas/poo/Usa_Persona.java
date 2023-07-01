package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Usa_Persona {

    public static void main(String[] args) {

        Persona[] lasPeronas = new Persona[2];//declaramos un Array de tipo Persona

        lasPeronas[0] = new Empleados2("MARCELO CABRERA", 5000, 2009, 02, 25);//CREAMOS LA PRIMERA POSICION DEL aRRAY
        lasPeronas[1] = new Alumno("DANIEL CABRERA", "PROGRAMACION");


        for (Persona p : lasPeronas) {//for each para recorrer el array

            System.out.println(p.dameNombre() + " , " + p.dameDescripcion());

        }

    }

    private static class Alumno extends Persona {//clase Alumno hereda de Persona

        public String carrera;//variable clase

        //constructor
        public Alumno(String nom, String car) {

            super(nom);

            carrera = car;

        }

        public String dameDescripcion() {//estamos sobrescribiendo el metodo abstracto de la clasee persona
            return "Este alumno esta estudiando la carrera de: " + carrera;
        }

    }
}

abstract class Persona {//clase abstracta

    private String nombre;//variable de clasee

    public Persona(String nom) {//constructor

        nombre = nom;

    }

    public String dameNombre() {//metodo getter devuelve el nombre

        return nombre;
    }

    public abstract String dameDescripcion();//declaro un metodo abstracto

}

class Empleados2 extends Persona {//heredamos de la clase persona

    private double sueldo;//variables de la clase

    private Date altaContrato;

    private static int IdSiguiente;

    private int id;

    //Constructor
    public Empleados2(String nom, double sue, int agno, int mes, int dia) {

        super(nom);//llamamos al constructor de la clase padre

        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);//fecha 
        altaContrato = calendario.getTime();

        ++IdSiguiente;

        id = IdSiguiente;

    }

    public String dameDescripcion() {//estamos sobrescribiendo el metodo abstracto de la clasee persona

        return "Este empleado tiene un Id= " + id + " con un sueldo igual a= " + sueldo;
    }

    //METODO GETTER
    public double dameSueldo() {

        return sueldo;
    }
    //METODO GETTER

    public Date dameFechaContrato() {

        return altaContrato;
    }
    //METODO SETTER

    public void subeSueldo(double porcentaje) {

        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;

    }
}
