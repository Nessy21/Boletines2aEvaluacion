package clasesAbstractas;

public class Cuadrado extends Rectangulo{

	



	//campos
	private double lado;
	
	
	
	//metodos
	
	@Override
	protected void calcularArea() {
		setArea(lado*lado);

	}
	//constructor
	
	public Cuadrado(double lado) {
		super(lado, lado); //constructor de cuadrado accediendo a Rectangulo mediante el super
		
	}
	
	
}
