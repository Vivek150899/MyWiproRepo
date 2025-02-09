package pack1;

public class AGradeSalaryCalculation implements SalaryCalculation{

	@Override
	public double computeAllowance(double basic) {
		
		return basic*0.35;
	}

	@Override
	public double computeDeduction(double basic) {
		
		return basic*0.20;
	}

	@Override
	public double computeNetSalary(double basic) {
		
		return basic+this.computeAllowance(basic)-this.computeDeduction(basic);
	}

	

}
