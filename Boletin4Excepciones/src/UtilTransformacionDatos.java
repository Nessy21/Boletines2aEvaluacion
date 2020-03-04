
public class UtilTransformacionDatos {

	public static void main(String[] args) {
		String cad="45";//en caso de poner algo que no sea numerico peta
		String cadDouble="45.2";
		 
		if (esValorNumerico(cad)) {
			System.out.println("Es valor numérico \n");
		}
		else {
			
			System.out.println("No es valor numérico\n");
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
			System.out.println ("Debes introducir números decimales válidos"); 
		}
		
		return numd;
}//obtenerValorDouble

}//class
