package poo;

//extend Coche: hereda de la clase Coche

import pildorasinformaticas.poo.Coche;

public class Furgoneta extends Coche {

    private int capacidadCarga;
    private int plazasExtras;

    public Furgoneta(int capacidadCarga, int plazasExtras) {

        super();//Llamar al constructor de la clase padre

        this.capacidadCarga = capacidadCarga;
        
        this.plazasExtras = plazasExtras;
    }
    
    //metodo getter
    public String dimeDatosFurgoneta(){
        return " La capacidad de carga es : " + capacidadCarga +
                " Y las plazas extras son:" + plazasExtras; 
    }

}
