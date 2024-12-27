package pack2;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pack1.FactorialCalculator;

public class FactorialTester {
	FactorialCalculator calculator;
	@BeforeEach
	public void init() {
		this.calculator=new FactorialCalculator();
	}
	@AfterEach
	public void clean() {
		this.calculator=new FactorialCalculator();
	}
	@Test
	@DisplayName(value="Testing Factorial for Program")
	public void test1() {
		try {
			this.calculator.setNumber(3);
			long expected=6;
			long actual=this.calculator.calculate();
			assertEquals(expected, actual);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName(value="Testing Factorial for Program")
	public void test2() {
		assertThrows(Exception.class,()->{this.calculator.setNumber(-4);});
	}

}
