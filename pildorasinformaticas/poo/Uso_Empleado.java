package poo;

import java.util.*;
import pildorasinformaticas.poo.Trabajadores;
//CLASE PRINCIPAL

public class Uso_Empleado {

    public static void main(String[] args) {
        //OBJETO O INSTANCIA		
        /*Empleado empleado1= new Empleado("Paco Gomez", 85000, 1990, 12, 17); 
		
		Empleado empleado2= new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		
		Empleado empleado3= new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		
		empleado2.subeSueldo(5);
		
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
		+ " Fecha de Alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
		+ " Fecha de Alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
		+ " Fecha de Alta: " + empleado3.dameFechaContrato());*/

        //Creo una instacioa de la clase Jefatura
        Jefatura jefe_RRHH = new Jefatura("Damian Lopez", 55000, 2006, 9, 25);

        //Establesco un incentivo con el metodo  
        jefe_RRHH.estableceIncentivo(2570);

        Empleadoss[] misEmpleados = new Empleadoss[6];//array de 6 posiciones de tipo Empleados

        misEmpleados[0] = new Empleadoss("Paco Gomez", 85000, 1990, 12, 17);//Instanciamos el objeto con sus valores en la primera posicion de la arrays

        misEmpleados[1] = new Empleadoss("Ana Lopez", 95000, 1995, 06, 02);

        misEmpleados[2] = new Empleadoss("Maria Martin", 105000, 2002, 03, 15);

        misEmpleados[3] = new Empleadoss("Antonio Fernandez");

        misEmpleados[4] = jefe_RRHH;//Polimorfismo en accion. El principio de sustitución

        misEmpleados[5] = new Jefatura("Maria Rodriguez", 95000, 1999, 5, 26);

        Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];//Casting de Objeto convertir un objeto de un tipo a otro

        jefa_Finanzas.estableceIncentivo(55000);//Establesco incentivo

        System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));//mostramos el metodo de la interfaz

        System.out.println("La jefa " + jefa_Finanzas.dameNombre() + " tiene un bono de " + jefa_Finanzas.establece_bonus(500));

        System.out.println(misEmpleados[3].dameNombre() + " Tiene un bonos de: " + misEmpleados[3].establece_bonus(200));

//        Empleadoss director_comercial = new Jefatura("Lucas", 85000, 2012, 05, 05);
//
//        Comparable ejemplo = new Empleadoss("Elisabeth", 95000, 2011, 06, 07);
//
//        if (director_comercial instanceof Empleadoss) {
//
//            System.out.println("Es de tipo Jefatura");
//
//        }
//
//        if (ejemplo instanceof Comparable) {
//            System.out.println("Implementa la interfaz Comparable");
//
//        }
//
//        for (int i = 0; i < misEmpleados.length; i++) {
//
//            misEmpleados[i].subeSueldo(5);
//
//        }

        Arrays.sort(misEmpleados);//ordenamos por sueldos con un Arrays.sort 

        for (int i = 0; i < misEmpleados.length; i++) {//mostramos por pantalla

            System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo()
                    + " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
        }
    }
}

//clase
class Empleadoss implements Comparable, Trabajadores {//la clase Empleados implementa la interfaz comparable

    //Constructor
    public Empleadoss(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);//fecha 
        altaContrato = calendario.getTime();

        ++IdSiguiente;
        Id = IdSiguiente;

    }

    //Sobre carga de Constructor
    public Empleadoss(String nom) {
        this(nom, 30000, 2000, 01, 01);
    }

    //METODO GETTER
    public String dameNombre() {

        return nombre;

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

    //variables de clase
    private String nombre;

    private double sueldo;

    private Date altaContrato;

    private static int IdSiguiente;

    private int Id;
    
    @Override
    public double establece_bonus(double gratificacion) {//implementamos el metodo de la interfaz Trabajadores
           
        return Trabajadores.bonus_base+gratificacion; 
    }
    
    //crear metodo compareTO de la interfaz Compareble
    @Override
    public int compareTo(Object t) {
        Empleadoss otroEmpleado = (Empleadoss) t;

        if (this.sueldo < otroEmpleado.sueldo) {

            return -1;
        }
        if (this.sueldo > otroEmpleado.sueldo) {
            return 1;
        }
        return 0;
    }

}
