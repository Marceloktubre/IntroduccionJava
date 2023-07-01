package pildorasinformaticas.poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

    public static void main(String[] args) {

        DameLaHora oyente = new DameLaHora();//Instancamos la clase Dame la hora

        //ActionLister oyente=new DameLaHora();//esta declaracion tambien funciona
        
        Timer miTemporizador = new Timer(5000, oyente);//Instanciamos TImer(Frecuencia de ejecucion,y un objeto )

        miTemporizador.start();//metodo de Timer, le decimos que empiece a ejecutar 
        
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");//ventana muestar msj

        System.exit(0);
    }

}
