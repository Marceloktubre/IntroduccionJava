package Colecciones;

public class Libro {

    //atributos
    private String titulo;
    private String autor;
    private int ISBN;

    //constructor
    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    //Metodo getter
    public String getDatos() {

        return "El titulo es: " + titulo + ". El autor es : "
                + autor + ". Y el ISBN es. " + ISBN;
    }

    //metodo equals..sirve para comparar si los dos objetos son iguales
    public boolean equals(Object obj) {
        if (obj instanceof Libro) {
            Libro otro = (Libro) obj;

            if (this.ISBN == otro.ISBN) {
                return true;

            } else {
                return false;
            }

        } else {
            return false;
        }

    }

    //Metodo hashcode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.ISBN;
        return hash;
    }

}
