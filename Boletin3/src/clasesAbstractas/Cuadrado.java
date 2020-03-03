package clasesAbstractas;

public class Cuadrado extends Rectangulo{

	//campos
	private double lado;
	
	
	
	//metodos
	
	
	protected void calcularArea() {
		setArea(lado*lado);

	}
	@Override
	public String toString() {
		String mensaje= "Cuadrado: \n\tLado:"+lado+"\n\t¡rea:"+getArea();
		return mensaje;
	}
	//constructor
	
	public Cuadrado(double lado) {
		super(lado, lado); //constructor de cuadrado accediendo a Rectangulo mediante el super
		
	}
	
	
}
