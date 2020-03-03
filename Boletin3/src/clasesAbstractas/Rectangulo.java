package clasesAbstractas;

public class Rectangulo extends Figura {

	//campos
	private double base;
	private double altura;
	
	//metodos
	protected void calcularArea() {
		setArea(base*altura);
	}
	@Override
	public String toString() {
		String mensaje= "Rect·ngulo: \n\tBase:"+base+"\n\tAltura:"+altura+"\n\t¡rea:"+getArea();
		return mensaje;
	}
	
	//constructores
	
	public Rectangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	
	
	
	
	
}
