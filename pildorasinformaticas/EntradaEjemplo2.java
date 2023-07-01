import javax.swing.*;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
//parseInt(edad)	clase Integer
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor");
		
		int edadUsuario = Integer.parseInt(edad);
		
		System.out.println("Hola " + nombreUsuario + " El año que viene tendras " + (edadUsuario+1) + " años");
		
		
		
		
		
	}

}
