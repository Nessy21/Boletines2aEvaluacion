package clasesAbstractas;

public abstract class Figura {

	//campos
	private double area;
		
	public void setArea (double area) {
		this.area=area;
	}
	public double getArea() {
		return area;
	}
	//metodos
	protected abstract void calcularArea();
	
	
	protected void imprimirArea() {
		System.out.println ("El área es: " + area);
	}


	
}
