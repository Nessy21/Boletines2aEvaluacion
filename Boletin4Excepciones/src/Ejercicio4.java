import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		
		try {
			
			String usuario;
			String password;
			
			System.out.println("Introduce el usuario");
			Scanner sc = new Scanner(System.in);
				usuario = sc.next();
			System.out.println("Introduce la contraseña");
				password = sc.next();	
			UtilLogueo.realizarLogin(usuario, password);
			sc.close();
		}
		catch(LoginUsuarioNoExistente ex) {
			System.out.println(ex.getMessage());
		}
		catch (LoginUsuarioPassErroneo ex) {
			System.out.println(ex.getMessage());
		}
	}

}
