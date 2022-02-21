package ejercicio92y93test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.mockito.MockedStatic;
import org.mockito.Mockito;

import ejercicio92y93.Permiso;
import ejercicio92y93.Registro;
import ejercicio92y93.VerificarUsuarios;

public class RegistroTest {
	VerificarUsuarios verificarUsuarios = Mockito.mock(VerificarUsuarios.class);

	@Test
	public void verifyLogin() {
		
		String username=""; 
		String password=""; 
		String expectedResult="Incorrect USER and PWD";
		Registro registro = new Registro(verificarUsuarios);


		Mockito.when(verificarUsuarios.verificarUsuario("", "")).thenReturn(false);
		Mockito.when(verificarUsuarios.verificarUsuario("Andre", "222")).thenReturn(true);

		String actualResult = registro.metodo(username, password);


		Assertions.assertEquals(expectedResult, actualResult, "Error ");

	}
	
	@Test
	public void verifyLogin2() {
		
		String username=""; 
		String password=""; 
		String expectedResult="Incorrect USER and PWD";
		Registro registro = new Registro(verificarUsuarios);


		Mockito.when(verificarUsuarios.verificarUsuario("", "")).thenReturn(false);
		Mockito.when(verificarUsuarios.verificarUsuario("Andre", "222")).thenReturn(true);

		MockedStatic<Permiso> permiso = Mockito.mockStatic(Permiso.class);
		permiso.when(() -> Permiso.permiso("Andre")).thenReturn("CRUD");
		permiso.when(() -> Permiso.permiso("Fabian")).thenReturn("UD");
		permiso.when(() -> Permiso.permiso("Diego")).thenReturn("C");
		String actualResult = registro.metodo(username, password);
		
		boolean contiene = actualResult.contains(expectedResult);
		
		
		
		Assertions.assertTrue(contiene);
		
		
	}
	
	

}
