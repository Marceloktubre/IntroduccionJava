
public class manipulaCadenas {

	public static void main(String[] args) {
		
		String nombre = "Marcelo";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre contiene " + nombre.length() + " letras");
		
		System.out.println("La quinta letra de mi nombre es la " + nombre.charAt(4));
		
		int ultimaLetra;
		
		ultimaLetra= nombre.length();
		
		System.out.println("La ultima letra de mi nombre es la " + nombre.charAt(ultimaLetra-1 ));
		

	}

}
