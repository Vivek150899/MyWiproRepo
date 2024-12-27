package pack1;

public class CGradeSalaryCalculation implements SalaryCalculation{

	@Override
	public double computeAllowance(double basic) {
		
		return basic*0.25;
	}

	@Override
	public double computeDeduction(double basic) {
		
		return basic*0.10;
	}

	@Override
	public double computeNetSalary(double basic) {
		
		return basic+this.computeAllowance(basic)-this.computeDeduction(basic);
	}

}
