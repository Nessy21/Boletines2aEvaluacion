import java.util.Scanner;
/**/
public class ejercicio1 {
		
	public static void main(String[] args) {
		String cadena;
		cadena = "";
		cadena = obtenerTexto(cadena);

		//
		
	}//main
		
	private static String obtenerTexto ( String texto ) {
		
		Scanner sc;
		sc= new Scanner(System.in);
		
		System.out.println("Introduce un texto");
		texto = sc.next();
		
		sc.close();
		return texto;
	    
	}//obtenerTexto
		
	private static char[] obtenerArray ( String texto ) {
		
		char [] miArray= {(char) texto.length()};
		
		
		
		return miArray;
	}//obtenerArray
	
	/*for (char elemento:miArray) {}*/ //Para el procedimiento
}//class
