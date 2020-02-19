package clasesAbstractas;

public class Circulo extends Figura{

	//campos
	private double radio;
	private static double pi= Math.PI;

	
	
	
	//metodos
	
	@Override
	protected void calcularArea() {
		// TODO Auto-generated method stub
		setArea(radio*radio*pi);
	}


	// constructor

	public Circulo (double radio) {
		this.radio = radio;
		
	}

	


	




	
}
