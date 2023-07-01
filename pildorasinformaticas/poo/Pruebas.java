package poo;

//prueba de constante y de static
public class Pruebas {

    public static void main(String[] args) {
        //OBJETO
        Empleados trabajador1 = new Empleados("Paco");

        Empleados trabajador2 = new Empleados("Ana");

        Empleados trabajador3 = new Empleados("Antonio");

        Empleados trabajador4 = new Empleados("Maria");

        trabajador1.cambiaSeccion("RRHH");

        System.out.println(trabajador1.devueldeDato() + "\n" + trabajador2.devueldeDato()
                + "\n" + trabajador3.devueldeDato() + "\n" + trabajador4.devueldeDato());

        System.out.println(Empleados.dameIdSiguiente());

        /*System.out.println(trabajador2.devueldeDato());

        System.out.println(trabajador3.devueldeDato());

        System.out.println(trabajador4.devueldeDato());*/
    }

}
//CLASE

class Empleados {
    //CONSTRUCTOR

    public Empleados(String nom) {

        nombre = nom;

        seccion = "Administracion";

        Id = IdSiguiente;

        IdSiguiente++;

    }
    //METODO SETTER

    public void cambiaSeccion(String seccion) {

        this.seccion = seccion;

    }

    //METODO GETTER
    public String devueldeDato() {

        return "El nombre es: " + nombre + " la seccion es " + seccion + " y el Id= " + Id;
    }
//static

    public static String dameIdSiguiente() {

        return "El Id siguiente es: " + IdSiguiente;
    }

    private final String nombre;

    private String seccion;

    private int Id;

    private static int IdSiguiente = 1;

}
