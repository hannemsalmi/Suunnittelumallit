package chainofresponsibility;

public class DepartmentManager extends ApprovalPower {
	
	public void processRequest(PayriseRequest request) {
		double percentageIncrease = (request.getNewsalary() - request.getSalary()) / request.getSalary() * 100;
		percentageIncrease = Math.round(percentageIncrease * 100.0) / 100.0;
		if (percentageIncrease < 5) {
			System.out.println("Department manager will approve payrise of " + percentageIncrease + " %");
		} else {
			super.processRequest(request);
		}
	}
}