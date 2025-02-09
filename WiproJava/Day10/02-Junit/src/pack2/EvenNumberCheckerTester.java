package pack2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pack1.EvenNumberChecker;

public class EvenNumberCheckerTester {
	
	EvenNumberChecker checker;
	@BeforeEach
	public void init() {
		this.checker=new EvenNumberChecker();
	}
	@AfterEach
	public void clean() {
		this.checker=null;
	}
	
    @Test
	public void check1() {
		checker.setNumber(14);
		boolean expected=true;
		boolean actual=checker.isEvenNumber();
		assertEquals(expected, actual);
	}
    
    @Test
    public void check2() {
		checker.setNumber(7);
		boolean expected=false;
		boolean actual=checker.isEvenNumber();
		assertEquals(expected, actual);
	}
    
    @Test
    public void check3() {
		checker.setNumber(-10);
		boolean expected=true;
		boolean actual=checker.isEvenNumber();
		assertEquals(expected, actual);
	}
    
    @Test
    public void check4() {
		checker.setNumber(-9);
		boolean expected=false;
		boolean actual=checker.isEvenNumber();
		assertEquals(expected, actual);
	}
   
	

}
