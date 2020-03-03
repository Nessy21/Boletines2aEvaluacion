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
	

	protected void calcularArea() {
		setArea(altura*base);
	}

	@Override
	public String toString() {
		String mensaje= "Tri·ngulo: \n\tBase:"+base+"\n\tAltura:"+altura+"\n\t¡rea:"+getArea();
		return mensaje;
	}
	//constructores
	public Triangulo (double base, double altura) {
		this.base=base;
		this.altura=altura;
	}

}
