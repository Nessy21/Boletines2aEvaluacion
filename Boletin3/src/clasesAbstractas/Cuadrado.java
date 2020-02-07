package clasesAbstractas;

public class Cuadrado extends Figura{

	//campos
	private float lado;
	
	
	public void setLado (float lado) {
		this.lado=lado;
	}
	
	
	@Override
	protected float calcularArea() {
		
		return area;
	}

}
