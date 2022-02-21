package ejercicio92y93;

public class Registro {
	VerificarUsuarios verificarUsuarios;
	
	public Registro() {
		verificarUsuarios = new VerificarUsuarios();
	}


	public Registro(VerificarUsuarios verificarUsuarios) {
		this.verificarUsuarios = verificarUsuarios;
	}
	
	public void metodo() {
		verificarUsuarios.metodo();
	}
}
