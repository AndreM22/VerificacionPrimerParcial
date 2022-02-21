package ejercicio91test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ejercicio91.Salario;

public class SalarioTest {
	
    @ParameterizedTest
    @CsvSource({ 
    	"-1,0",
        "0,0",
        "1,1",
        
        "500,500",
        "501,501",
        "502,502",
        
        "1999,1999",
        "2000,2000",
        "2001,1901",
        "2002,1902",
        
        "3000,2850",
        "3001,2851",
        "3002,2852",

        "3999,3800",
        "4000,3800",
        "4001,3401",
        
    })
	public void descuentoTest(int s,int expectedResult) throws Exception {
    	Salario salario = new Salario();
    	
    	if(s<=0) {
    		Assertions.assertThrows(Exception.class, ()-> {salario.descuento(s);} );
    	}else {
    		int actualResult = salario.descuento(s);	
    		Assertions.assertEquals(expectedResult,actualResult,"ERROR! El descuento es incorrecto");
    	}
    	
    	
	}
}
