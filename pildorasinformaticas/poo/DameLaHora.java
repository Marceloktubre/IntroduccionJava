package pildorasinformaticas.poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DameLaHora implements ActionListener {

    public void actionPerformed(ActionEvent e) {//metodo de la interfaz ActionListerner

        Date ahora = new Date();//creamos una instancia perteneciente a la clase Date

        System.out.println("Te pongo la hora cada 5sg: " + ahora);
        
        Toolkit.getDefaultToolkit().beep();//Este metodo lo que hace es emitir un sonido

    }

}
