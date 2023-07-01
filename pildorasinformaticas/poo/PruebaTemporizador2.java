package pildorasinformaticas.poo;

import javax.swing.*;

public class PruebaTemporizador2 {

    public static void main(String[] args) {

        Reloj miReloj = new Reloj();//Intanciamos la clase reloj

        miReloj.enMarcha(3000, true);//LLamamos al metodo de la clase

        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");//

        System.exit(0);//

    }

}
