import java.util.Arrays;
import java.util.Scanner;

/*: Implementar un programa que, obteniendo una frase del usuario, guarde en un
array multidimensional el conteo de apariciones de cada carácter. Al final deberá imprimir un
resultado con cada caracter seguido del número de apariciones en la frase.
Realizarlo con al menos tres métodos (pedir texto, obtener el array de apariciones e
imprimir)*/
public class Ejercicio3 {

	public static void main(String[] args) {
		String texto = obtenerTexto();
		String[][] array = obtenerArrayConteo(texto);
		imprimir(array);
	}// main

	private static String obtenerTexto() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Indique un texto");
		return sc.nextLine();

	}// obtenerTexto

	private static void imprimir(String[][] array) {
		System.out.println("Resultado de conteo");
		//System.out.println(Arrays.deepToString(array));
		for (int i=0; i<array[0].length;i++) {
			if (array[0][i]!=null && " ".compareTo(array[0][i])!=0)
				System.out.printf("El caracter %s aparece %s veces \n", array [0][i], array[1][i]);
		}
	}// imprimir

	private static int obtenerNumeroApariciones(char c, String texto) {

		int cont = 0;

		for (int i = 0; i < texto.length(); i++) {

			if (Character.compare(c, texto.charAt(i)) == 0)
				cont++;
		}
		return cont;
	}// obtenerNumeroApariciones

	private static boolean existeCaracter(char c, String[] array) {

		boolean existe = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && array[i].charAt(0) == c) {

				existe = true;
				break;
			}
		} // for
		return existe;
	}// existeCaracter

	private static String[][] obtenerArrayConteo(String texto) {

		String[][] arrayConteo = new String[2][texto.length()];

		int posInser = 0;

		for (int i = 0; i < texto.length(); i++) {// recorrer texto
			// 1a dimension de un array es fila, 2da dimension es columnas
			char caracter = texto.charAt(i);
			if (!existeCaracter(caracter, arrayConteo[0])) {
				arrayConteo[0][posInser] = String.valueOf(caracter);
				arrayConteo[1][posInser] = String.valueOf(obtenerNumeroApariciones(caracter, texto));
				posInser++;
			}
		}

		return arrayConteo;
	}// obtenerArrayConteo
}// class
