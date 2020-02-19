package clasesAbstractas;

public class Ejercicio2 {

	public static void main(String[] args) {
		Circulo c1= new Circulo (2);
		c1.calcularArea();
		c1.imprimirArea();
		
		Cuadrado cua1= new Cuadrado (5);//por el constructor de Rectangulo
		cua1.calcularArea();
		cua1.imprimirArea();
		
		Triangulo t1 = new Triangulo (4, 2);
		t1.calcularArea();
		t1.imprimirArea();
		
		Rectangulo r1 = new Rectangulo (9,2);
		r1.calcularArea();
		r1.imprimirArea();
		
		//Apartado 5
		Figura [] arrayFiguras = {
				new Triangulo (3,2),
				new Cuadrado (5),
				new Triangulo (15,3),
				new Triangulo (8,7),
				new Rectangulo (9,5),
				new Rectangulo (15,6),
				new Circulo (5),
				new Circulo (9),
				new Rectangulo (8,3),
				new Cuadrado (9)	
		};
		
		array(arrayFiguras);
	}//main		
	public static void array (Figura[] arrayFiguras){
			Triangulo [] triangulos = new Triangulo [3];
			Cuadrado [] cuadrados = new Cuadrado [2];
			Rectangulo [] rectangulos = new Rectangulo [3];
			Circulo [] circulos = new Circulo [2];//no enlaza? 
			
			
			//guardar cada elemento en un array 
		for (int i=0; i<arrayFiguras.length;i++) {
			
		}
		
		
		for(Figura Triangulo: arrayFiguras) {//para recorrer
			System.out.println("lloro");//me imprime lloro por cada valor dentro del arrayFiguras.
			
			
			//for each dentro del for? pero imprime 10 lloro por 
			//cada uno (100lloro?)	
				
				
		}
		
		}
}//class
