package poo;

import pildorasinformaticas.poo.Coche;
import javax.swing.*;
import poo.Furgoneta;

public class Uso_Vehiculo {

    public static void main(String[] args) {

//		Coche Mercedez= new Coche(); // INSTANCIAR UNA CLASE.EJEMPLAR DE CLASE
//		
//		Mercedez.establece_color(JOptionPane.showInputDialog("Introduce color"));
//		
//		System.out.println(Mercedez.dime_datos_generales());
//		
//		System.out.println(Mercedez.dime_color());
//		
//		Mercedez.configura_asientos(JOptionPane.showInputDialog("Tienen asientos de cuero?"));
//		
//		System.out.println(Mercedez.dime_asientos());
//		
//		Mercedez.configura_climatizador(JOptionPane.showInputDialog("Tienen climatizador?"));
//		
//		System.out.println(Mercedez.dime_climatizador());
//		
//		System.out.println(Mercedez.dime_peso_coche());
//		
//		System.out.println("El precio final del coche es: " + Mercedez.precio_coche());


        Coche micohe1 = new Coche();//Instancio la clase Coche

        micohe1.establece_color("Negro");//Estableso un color al Coche

        Furgoneta miFurgoneta1 = new Furgoneta(580, 7);//Instacio la clase Furgoneta

        miFurgoneta1.establece_color("Azul");//Establesco color a la furgoneta
        
        miFurgoneta1.configura_asientos("Si");//Establesco asiento
        
        miFurgoneta1.configura_climatizador("Si");//Establesco el climatizador
        
        System.out.println(micohe1.dime_datos_generales() + ". " + micohe1.dime_color());//Muestro por pantalla datos generales del coche
        
        System.out.println(miFurgoneta1.dime_datos_generales() + ". " + miFurgoneta1.dimeDatosFurgoneta() + " " + miFurgoneta1.dime_color());

    }

}
