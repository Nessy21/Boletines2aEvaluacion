

import java.util.Scanner;

public class UtilObtencionDatos {


	/*public static int obtenerValorEntero(String mensaje) {
		// TODO Auto-generated method stub
		int valor=0;
		
		Scanner sc= new Scanner (System.in);
		
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
			{
				sc.next();
				valorCorrecto=false;
			}
		}//while
		return valor;
		}//obtenerValorEntero*/
	
	public static int obtenerValorPositivo () {
		int num=0;
		boolean valorCorrecto = false;
		Scanner sc= new Scanner (System.in);
		
		do {
			if (sc.hasNextInt()){
				
				num=sc.nextInt(); 
				
				if (num>0) {
					valorCorrecto=true;
					System.out.println("El número es positivo");
				}
				else {//throw
					throw new ValorNumericoNegativoException("El número tiene que ser positivo.");
					}	
			}
			else {
				System.out.println("Introduce un número");
				sc.next();
				valorCorrecto=false;
			}	
		}//do
		while (valorCorrecto==false);
		
		return num;
	}
	public static void main(String[] args) {
		int c=0;
		boolean valorCorrecto=false; 
		while(valorCorrecto==false) {
			System.out.println("introduce número entero positivo");
			try {
				obtenerValorPositivo();
				valorCorrecto=true; 	//sale del bucle cuando todo guay
			}
			catch (ValorNumericoNegativoException ex){
				//ex.printStackTrace();
				System.out.println(ex.getMessage());
			}//catch
		
		}//while
		
		
	}
	
}//class
