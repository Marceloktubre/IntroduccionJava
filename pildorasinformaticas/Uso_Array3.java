
public class Uso_Array3 {

	public static void main(String[] args) {
		
		int[] matrizAleatorios= new int[150];
		
		for (int i= 0; i <matrizAleatorios.length; i++) {
			
			matrizAleatorios[i]=(int)Math.round(Math.random()*100);
		}
		
		for(int numeros: matrizAleatorios) {
			
			System.out.println(numeros + " ");
		}

	}

}
