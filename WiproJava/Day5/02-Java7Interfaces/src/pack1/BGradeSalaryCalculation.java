package pack1;

public class BGradeSalaryCalculation implements SalaryCalculation{

	@Override
	public double computeAllowance(double basic) {
		return basic*0.30;
	}

	@Override
	public double computeDeduction(double basic) {
		return basic*0.15;
	}

	@Override
	public double computeNetSalary(double basic) {
		return basic+this.computeAllowance(basic)-this.computeDeduction(basic);
	}

}
