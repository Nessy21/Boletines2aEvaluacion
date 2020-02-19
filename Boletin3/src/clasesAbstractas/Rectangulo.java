package clasesAbstractas;

public class Rectangulo extends Figura {

	//campos
	private double base;
	private double altura;
	
	//metodos
	protected void calcularArea() {
		setArea(base*altura);
	}
	
	//constructores
	
	public Rectangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	
	
	
	
	
}
