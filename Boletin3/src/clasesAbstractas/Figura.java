package clasesAbstractas;

public abstract class Figura {

	//campos
	private double area;
		
	public void setArea (double area) {
		this.area=area;
	}
	
	//metodos
	protected abstract void calcularArea();
	
	
	protected void imprimirArea() {
		System.out.println ("El área es: " + area);
	}


	
}
