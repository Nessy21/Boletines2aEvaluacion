package clasesyobjetos;

public class Camion extends Vehiculo{

	private int altura;
	private Remolque remolque;
	
	public Camion (String matricula, String tipo, int velocidadMaxima, Remolque remolque){
		this.setMatricula(matricula);
		this.setTipo(tipo);
		this.setVelocidadMaxima(velocidadMaxima);
		this.setRemolque(remolque);
 	}
	
	public void setAltura (int altura) {
		this.altura = altura;
	}
	
	public void setRemolque (Remolque remolque) {
		this.remolque = remolque;
	}
	
	public void mostrarDatos() {
		System.out.println(altura);
		super.mostrarDatos();
		System.out.println(remolque.toString());
	}//mostrarDatos
	
	//constructor
	
	public Camion (String matri, String tip, int velMax, int alt) {
		//super(matri,tip,velMax);
		super();//se invoca al constructor
		super.mostrarDatos();//no sé muy bien para qué
		this.setAltura(alt);
	}
	


	
}
