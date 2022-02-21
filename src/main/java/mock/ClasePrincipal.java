package mock;

public class ClasePrincipal {
	ClaseMock claseMock;
	
	public ClasePrincipal() {
		claseMock = new ClaseMock();
	}


	public ClasePrincipal(ClaseMock claseMock) {
		this.claseMock = claseMock;
	}
	
	public void metodo() {
		claseMock.metodo();
	}
}
