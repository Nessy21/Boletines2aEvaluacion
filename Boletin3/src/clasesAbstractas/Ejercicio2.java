package clasesAbstractas;

public class Ejercicio2 {

	public static void main(String[] args) {
		Circulo c1= new Circulo (2);
		c1.calcularArea();
		//c1.imprimirArea();
		
		Cuadrado cua1= new Cuadrado (5);//por el constructor de Rectangulo
		cua1.calcularArea();
		//cua1.imprimirArea();
		
		Triangulo t1 = new Triangulo (4, 2);
		t1.calcularArea();
		//t1.imprimirArea();
		
		Rectangulo r1 = new Rectangulo (9,2);
		r1.calcularArea();
		//r1.imprimirArea();
		
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
			Circulo [] circulos = new Circulo [2];
			
			//instanceof mirar que clase de figura es 
	
			int insTriangulo=0;
			int insCuadrado=0;
			int insRectangulo=0;
			int insCirculo=0;
		
		for(Figura f: arrayFiguras) {//para recorrer
			
				f.calcularArea();
				//guarda cada figura en su sitio
			if (f instanceof Triangulo) {
				triangulos [insTriangulo]= (Triangulo) f;
				insTriangulo++;
			}
			else if (f instanceof Cuadrado) {
				cuadrados [insCuadrado]= (Cuadrado) f;
				insCuadrado++;
			}
			
			else if (f instanceof Rectangulo) {
				rectangulos [insRectangulo]= (Rectangulo) f;
				insRectangulo++;
			}
			else if (f instanceof Circulo) {
				circulos [insCirculo]= (Circulo) f;
				insCirculo++;
			}
		}//for each
		
		System.out.println("Impresion de Triángulos");//recorre cada triangulo e imprime sus datos
		for (int i = 0 ; i<triangulos.length; i++) {
			Triangulo t=triangulos [i];
			System.out.println(t);
		}
		System.out.println("Impresión de Cuadrados");
		for (int i = 0 ; i<cuadrados.length; i++) {
			Cuadrado c=cuadrados [i];
			System.out.println(c);
		}
		System.out.println("Impresión de Rectángulos");
		for (int i = 0 ; i<rectangulos.length; i++) {
			Rectangulo r=rectangulos [i];
			System.out.println(r);
		}
		System.out.println("Impresión de Círculos");
		for (int i = 0 ; i<circulos.length; i++) {
			Circulo c=circulos [i];
			System.out.println(c);
		}
		
		}
}//class
