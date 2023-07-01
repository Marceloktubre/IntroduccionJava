package Colecciones;

import java.util.*;

public class Prueba_TreeSet {

    public static void main(String[] args) {

        /* TreeSet<String> ordenaPersonas = new TreeSet();//ordena alfabeticamente

        ordenaPersonas.add("Sandra");
        ordenaPersonas.add("Amanda");
        ordenaPersonas.add("Daniel");

        for (String e : ordenaPersonas) {
            System.out.println(e);

        }*/
        //ComparadorArticulos compara_art = new ComparadorArticulos();

        TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(new Comparator<Articulo>() {
            @Override
            public int compare(Articulo t, Articulo t1) {
                String desc1 = t.getDescripcion();
                String desc2 = t1.getDescripcion();

                return desc1.compareTo(desc2);
            }
        });

        Articulo primero = new Articulo(1, "Primer articulo");
        Articulo segundo = new Articulo(200, "Segundo articulo");
        Articulo tercero = new Articulo(3, "Este es el tercer articulo");

        TreeSet<Articulo> ordenaArticulos = new TreeSet();

        ordenaArticulos.add(tercero);

        ordenaArticulos.add(primero);

        ordenaArticulos.add(segundo);

        for (Articulo e : ordenaArticulos) {
            System.out.println(e.getDescripcion());

        }

        System.out.println(
                "----------------");

        /*Articulo comparadorArticulos = new Articulo();

        TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos);//ordena alfabeticamente

        ordenaArticulos2.add(primero);
        ordenaArticulos2.add(segundo);
        ordenaArticulos2.add(tercero);
        
        for (Articulo art : ordenaArticulos2) {
            System.out.println(art.getDescripcion());*/
    }

}
//creo una clases compareTo

class Articulo implements Comparable<Articulo> {

    private int numeroArticulo;

    private String descripcion;

    //creo un constructor
    public Articulo(int num, String desc) {

        numeroArticulo = num;
        descripcion = desc;

    }

    //creo compareTO
    @Override
    public int compareTo(Articulo o) {
        return numeroArticulo - o.numeroArticulo;
    }

    //metodo getter
    public String getDescripcion() {
        return descripcion;
    }

    /* @Override
    public int compare(Articulo arg0, Articulo arg1) {
        String descripcionA = arg0.getDescripcion();
        String descripcionB = arg1.getDescripcion();

        return descripcionA.compareTo(descripcionB);
    }*/
}
