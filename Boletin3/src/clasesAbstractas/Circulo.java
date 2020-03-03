package clasesAbstractas;

public class Circulo extends Figura{

	//campos
	private double radio;
	private static double pi= Math.PI;

	
	
	
	//metodos
	
	protected void calcularArea() {
		// TODO Auto-generated method stub
		setArea(radio*radio*pi);
	}
	@Override
	public String toString() {
		String mensaje= "CÌrculo: \n\tRadio:"+radio+"\n\t¡rea:"+getArea();
		return mensaje;
	}

	// constructor

	public Circulo (double radio) {
		this.radio = radio;
		
	}

	


	




	
}
