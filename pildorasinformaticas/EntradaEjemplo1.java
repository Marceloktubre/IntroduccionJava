import java.util.*;
public class EntradaEjemplo1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu nombre, por favor");
		
		String nombreUsuario = entrada.nextLine();
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombreUsuario + ". El año que viene tendras " + (edad+1) + " años");
		
		
		
		
		
		
	}

}
