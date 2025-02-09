package pack2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pack1.Calculator;

public class CalculatorTester {
	
	Calculator calculator;
	@BeforeEach
	public void f1() {
		this.calculator=new Calculator();
	}
	
	@AfterEach
	public void f2() {
		this.calculator=null;
	}
	@Test
	@DisplayName("set testing for add")
	public void test1() {
		this.calculator.setNumber1(10);
		this.calculator.setNumber2(20);
		int expectedSumValue=30;
		int actualValue=this.calculator.add();
		assertEquals(expectedSumValue, actualValue);	
	}
	
	@Test
	@DisplayName("set testing for subtract")
	public void test2() {
		this.calculator.setNumber1(30);
		this.calculator.setNumber2(20);
		int expectedSumValue=10;
		int actualValue=this.calculator.subtract();
		assertEquals(expectedSumValue, actualValue);	
	}
	
	@Test
	@DisplayName("set testing for multiply")
	public void test3() {
		this.calculator.setNumber1(10);
		this.calculator.setNumber2(20);
		int expectedSumValue=200;
		int actualValue=this.calculator.multiply();
		assertEquals(expectedSumValue, actualValue);	
	}
	
	@Test
	@DisplayName("set testing for devide ")
	public void test4() {
		this.calculator.setNumber1(40);
		this.calculator.setNumber2(20);
		int expectedSumValue=2;
		int actualValue=this.calculator.divide();
		assertEquals(expectedSumValue, actualValue);	
	}
	

}
