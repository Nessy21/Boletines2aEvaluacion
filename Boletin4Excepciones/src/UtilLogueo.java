
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

		for (int i = 0; i < arrayUsuarios.length; i++) {
			 
		
			String a=arrayUsuarios[i].getNombreUsuario(usuario);//asi no 
																//hace nada
			if (a.equals(usuario)) {
			String b= arrayUsuarios[i].getNombrePassword(password);
				if (b.equals(password)) {
					System.out.println("Inicio correcto");
					}
				else {//Exception
						throw new LoginUsuarioNoExistente ("Usuario inexistente");
					}	
				}
			else {//Exception
					throw new LoginUsuarioPassErroneo("Contraseña o usuario incorrecto");
				}
			}//for
		return null;
		
	} 	

}
