import java.util.Scanner;

public class UtilLogueo {
 
	
	public static Usuario realizarLogin(String usuario, String password) {
		
		Usuario[] arrayUsuarios= {
				new Usuario("fer1", "123456"),
				new Usuario("luis86", "000000"),
				new Usuario("ana_cps2002", "AzLmR56"),
				new Usuario("MariaFernandez", "655786995"),
				new Usuario("JZm46Y", "zxcvbnm"),
				new Usuario("___121aZ", "qwerty"),
				new Usuario("M.Rajoy", "password"),
				new Usuario("", "666666"),
				};
		
		//excepciones aqui

		

			for (int i=0; i<arrayUsuarios.length;i++) {
				
				arrayUsuarios[i].getNombreUsuario(usuario);//kk
				if(usuario.equals(usuario)) {
					arrayUsuarios[i].getNombrePassword(password);//kk
					if(password.equals(password)) {
						System.out.println("PERFECTO");
					}
					else {//excepcion
						throw new UserIncorrectoException("Usuario inexistente");
					}	
				}
				else {//excepcion
					throw new ConstraseñaIncorrectaException("Contraseña o usuario incorrecto");
				}
			}//for
		return null;
		//
	} 	//
	public static void main(String[] args) {
		String usuario;
		String password;
		System.out.println("Introduce el usuario");
		Scanner sc= new Scanner (System.in);
			usuario=sc.next();
		System.out.println("Introduce la contraseña");
			password=sc.next();
		realizarLogin(usuario, password);
			//try catch aqui
			
		sc.close();
	}
	
}
