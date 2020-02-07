package clasesAbstractas;

public abstract class Figura {

	//campos
	private float area;
	
	public void setArea (float area) {
		this.area=area;
	}
	
	//metodos
	protected abstract float calcularArea();
	
	
	protected void imprimirArea() {
		this.setArea(area);
		System.out.println ("El área es:" + area);
	}
	
}
