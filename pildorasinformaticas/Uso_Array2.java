import javax.swing.*;
public class Uso_Array2 {

	public static void main(String[] args) {
		
		String[] paises= new String[8];
		
		for(int i=0; i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce pais " + (i+1));
		}
		
		/*paises[0]= "España";
		paises[1]= "Argentina";
		paises[2]= "Belguica";
		paises[3]= "Inglaterra";
		paises[4]= "Brasil";
		paises[5]= "Ucrania";
		paises[6]= "Rusia";
		paises[7]= "Uruguay";*/
		
		/*for(int i=0; i <paises.length; i++) {
			
			System.out.println("Pais " + (i+1) + " " + paises[i]);
		}*/
		
		for(String i:paises)
		{
			System.out.println("Pais: " + i );
		}
		
	}

}
