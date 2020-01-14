import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int [] [] array = crearArray();
		rellenarArray(array);
		calcularEImprimir(array);
		
	}//main
	
	private static int [][] crearArray()
	{
		int filas;
		int columnas;
		
		System.out.println("Indica el valor de dimension de las filas:");
		filas = obtenerValorEnteroPositivo("Indica un valor entero positivo");
		System.out.println("Indica el valor de dimension de las columnas:");
		columnas = obtenerValorEnteroPositivo("Indica un valor entero positivo");
		
		int [][] array = new int [filas][columnas];
		return array;
	}
	
	
	private static int[][] rellenarArray(int [][] array) 
	{
		for (int i=0; i<array.length;i++) 
		{
			for (int j=0; j<array[i].length;j++)
			{ 
			int valor = obtenerValorEnteroPositivo(
					String.format("Indicael valor [%d][%d]" i, j));
			array[i][j]=valor;
			}
		}
		return array;
	}//rellenar array
	
	
	private static void calcularEImprimir (int [][] array) 
	{
		int suma;
		for (int i=0;i<array.length;i++) 
		{
			suma=0;
			for (int j=0; j<array[i].length;j++) 
			{
			
				suma = suma+array[i][j];
				
			}
			System.out.printf("La suma para la fila %d es %d\n", i, suma);
		}
	}
	
	private static int obtenerValorEnteroPositivo(String mensaje) {
		int valor =0;
		Scanner sc;
		sc= new Scanner (System.in);
		boolean valorCorrecto=false;
		while (valorCorrecto==false) 
		{
			System.out.println(mensaje);
			if(sc.hasNextInt()) 
			{
				valor=sc.nextInt();
				valorCorrecto=true;
			}
			else 
		}//while
		
	}
	
}//class
