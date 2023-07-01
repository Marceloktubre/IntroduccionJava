package pildorasinformaticas.poo;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

public class Reloj {//clase externa

    public void enMarcha(int intervalo, final boolean sonido) {//metodo

        class Damelahora2 implements ActionListener {//clase interna implementa la interfaz...es una clase interna local

            @Override
            public void actionPerformed(ActionEvent avento) {
                Date ahora = new Date();

                System.out.println("Te pongo la hora cada 3 sg " + ahora);

                if (sonido) {

                    Toolkit.getDefaultToolkit().beep();
                }
            }

        }

        ActionListener oyente = new Damelahora2();//construimos un objeto de tipo interfaz

        Timer miTemporizador = new Timer(intervalo, oyente);//Instanciamos la clase Timer

        miTemporizador.start();//

    }

}
