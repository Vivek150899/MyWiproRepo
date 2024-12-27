package pack2;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

//@RunWith(Suite.class)
@Suite
@SuiteDisplayName("Junit allsuite test cases ")
@SelectPackages("pack2")


public class AllTest {
	
	@ParameterizedTest
	@ValueSource(ints = {3, 6, 9, 12})
	@DisplayName(value ="test1 execution")
	public void test1(int value){
		assertTrue(value%2==0);
	}
 
	
	@ParameterizedTest(name = "For example, number {0}")
	@ValueSource(ints = {2, 6, 10, 12})
	@DisplayName(value ="test2 execution")
	public void test2(int value){
		assertTrue(value%2==0);
      
}}