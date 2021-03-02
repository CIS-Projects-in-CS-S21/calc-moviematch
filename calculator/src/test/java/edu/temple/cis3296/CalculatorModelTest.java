package edu.temple.cis3296;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorModelTest {
	CalculatorModel calc; 

	@Before 
	public void initialize(){
		calc = new CalculatorModel();
	}

	@Test
	public void shouldAddTwoPlusTwo(){
		// Assert 2.0 plus 2.0 is equals 4.0 plus or minus 0.1 epsilon
		// Double comparaison necessite to specify an epsilon. 
		assertEquals(4.0, calc.operationAdd(2.0, 2.0), 0.1);
	}

	@Test
	public void shouldAddTwoPlusZero(){
		// Assert 2.0 plus 0.0 is equals 2.0 plus or minus 0.1 epsilon
		// Double comparaison necessite to specify an epsilon.
		assertEquals(2.0, calc.operationAdd(2.0, 0.0), 0.1);
	}

	@Test
	public void shouldSubstTwoAndTwo(){
		assertEquals(0.0, calc.operationSubst(2.0, 2.0), 0.1);
	} 

	@Test
	public void shouldMultTwoByOne(){
		assertEquals(2.0, calc.operationMult(2.0, 1.0), 0.1);
	} 

	@Test
	public void shouldDivTwoByOne(){
		assertEquals(2.0, calc.operationDiv(2.0, 1.0), 0.1);
	}

	@Test
 MOV-48-Fix-Multiplication
	public void shouldMultTwoByThree(){
		assertEquals(6.0, calc.operationMult(2.0, 3.0), 0.1);
	}

	public void shouldDivTenByTwo(){
		assertEquals(5.0, calc.operationDiv(10.0, 2.0), 0.1);
	} 
 main


}
