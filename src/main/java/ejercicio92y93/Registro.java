package ejercicio92y93;


import java.time.LocalDateTime;
import java.util.Date;


public class Registro {
	VerificarUsuarios verificarUsuarios;
	
	public Registro() {
		verificarUsuarios = new VerificarUsuarios();
	}


	public Registro(VerificarUsuarios verificarUsuarios) {
		this.verificarUsuarios = verificarUsuarios;
	}
	
	public String metodo(String username, String password) {
		if(verificarUsuarios.verificarUsuario(username, password)) {
			Date date = new Date();
			
			return "PERMISSION ROLE: " + Permiso.permiso(username) + " - " + LocalDateTime.now(); 
		}else {
			return "Incorrect USER and PWD";
		}

	}
}
