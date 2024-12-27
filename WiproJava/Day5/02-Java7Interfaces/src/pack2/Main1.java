package pack2;

import pack1.AGradeSalaryCalculation;
import pack1.BGradeSalaryCalculation;
import pack1.CGradeSalaryCalculation;
import pack1.SalaryCalculation;

public class Main1 {

	public static void main(String[] args) {
		SalaryCalculation sc;
		
		
		sc=new AGradeSalaryCalculation();
		System.out.println(sc.computeAllowance(10000.0));
		System.out.println(sc.computeDeduction(10000.0));
		System.out.println(sc.computeNetSalary(10000.0));
		System.out.println("    ");
		
		sc=new BGradeSalaryCalculation();
		System.out.println(sc.computeAllowance(10000.0));
		System.out.println(sc.computeDeduction(10000.0));
		System.out.println(sc.computeNetSalary(10000.0));
		System.out.println("    ");
		
		sc=new CGradeSalaryCalculation();
		System.out.println(sc.computeAllowance(10000.0));
		System.out.println(sc.computeDeduction(10000.0));
		System.out.println(sc.computeNetSalary(10000.0));
		System.out.println("    ");
		

	}

}
