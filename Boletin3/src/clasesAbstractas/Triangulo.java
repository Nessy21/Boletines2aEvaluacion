package clasesAbstractas;

public class Triangulo extends Figura{

	private double base;
	private double altura;
	
	public void setBase (double base) {
		this.base=base;
	}
	
	public void setAltura (double altura) {
		this.altura=altura;
	}
	
	//metodos
	
	@Override
	protected void calcularArea() {
		// TODO Auto-generated method stub
		setArea(altura*base);
	}

	//constructores
	public Triangulo (double base, double altura) {
		this.base=base;
		this.altura=altura;
	}

}
