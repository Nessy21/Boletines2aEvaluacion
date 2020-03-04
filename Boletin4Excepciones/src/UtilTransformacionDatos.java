
public class UtilTransformacionDatos {

	public static void main(String[] args) {
		String cad="45";//en caso de poner algo que no sea numerico peta
		String cadDouble="45.2";
		 
		if (esValorNumerico(cad)) {
			System.out.println("Es valor num�rico \n");
		}
		else {
			
			System.out.println("No es valor num�rico\n");
		}
		
		
		double llamada=obtenerValorDouble(cadDouble);
	}//main
	
	public static boolean esValorNumerico (String cadena) {
		boolean esValorNumerico = true;
		
		
		try {
			int convNum= Integer.parseInt(cadena);
		}
		
		catch (NumberFormatException ex) {
			ex.printStackTrace();//para seguir ejecutando
			esValorNumerico=false;
		}
		
		return esValorNumerico;
	}//esValorNumerico
	
	public static double obtenerValorDouble(String cadena) throws IllegalArgumentException{
		double numd=0;
	
		try {
			 numd= Double.parseDouble(cadena);
			 System.out.println("Es double");
		}
		catch(NumberFormatException ex) {
			ex.printStackTrace();
			System.out.println ("Debes introducir n�meros decimales v�lidos"); 
		}
		
		return numd;
}//obtenerValorDouble

}//class
