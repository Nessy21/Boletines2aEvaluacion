//import java.util.Arrays;

/*Dado el siguiente array, realizar la ordenación e impresión del array resultado.
int[] arrayDesordenado= {121,24,1,258,0,-3,8}
Realizarlo con dos métodos. Uno para ordenar el array y otro para la impresión.
Deberá realizarse ‘a mano‘ y no mediante ningún método de ordenación como sort*/
public class Ejercicio2 {
public static void main(String [] args) {
	
	int[] arrayDesordenado= {121,24,1,258,0,-3,8};
	//int [] array=obtenerArrayOrdenado(arrayDesordenado);
	int [] array=obtenerArrayOrdenadoPares(arrayDesordenado);
	imprimirArray(array);
	
	//Arrays.sort(arrayDesordenado);//metodo que ordena de menor a mayor
	//imprimirArray(arrayDesordenado);
	
	}//main

private static void imprimirArray ( int[] array ) {
	//System.out.println(array); no siempre va a funcionar
	
	for(int c:array) {
		System.out.print(" " + c);
	}
}//imprimirArray

/*private static int [] obtenerArrayOrdenado (int [] arrayDesordenado) {
	int [] arrayOrdenado = new int [arrayDesordenado.length];
	int vMax = Integer.MIN_VALUE; //VALOR MINIMO EN INT
	int posMax = -1;//posicion donde se encuentra el valor maximo
	int posInser = 0;
	
	for(int i=0; i<arrayDesordenado.length; i++)
	{
		for (int j=0; j < arrayDesordenado.length; j++)
		{
			if (vMax < arrayDesordenado[j])
			{
				vMax = arrayDesordenado[j];
				posMax = j;
			}
		}//for j
		//vMax y posMax tienen el valor maximo y su posicion
		arrayOrdenado[posInser] = vMax;//Podría usar arayOrdenado [i] = vMax;
		arrayDesordenado [posMax] = Integer.MIN_VALUE;
		posInser++;
		vMax = Integer.MIN_VALUE;
	}//for i 
	
	return arrayOrdenado;
}//obtenerArrayOrdenado
*/
private static int [] obtenerArrayOrdenadoPares (int [] arrayDesordenado) 
{
	for (int i=0; i<arrayDesordenado.length; i++)
	{
		for (int j=i+1;j<arrayDesordenado.length;j++)
		{
			if (arrayDesordenado[i]<arrayDesordenado[j])
			{
				int vAux = arrayDesordenado[j];
				arrayDesordenado[j] = arrayDesordenado[i];
				arrayDesordenado[i] = vAux;
			}
		}//for j
	}//for i
	return arrayDesordenado;
	}//obtenerArrayOrdenadoPares
}//class
