package clasesAbstractas;

public class Triangulo extends Figura{

	private float base;
	private float altura;
	
	public void setBase (float base) {
		this.base=base;
	}
	
	public void setAltura (float altura) {
		this.altura=altura;
	}
	
	@Override
	protected float calcularArea() {
	
		return area;
	}

}
