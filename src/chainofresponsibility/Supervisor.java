package chainofresponsibility;

public class Supervisor extends ApprovalPower {
	
	public void processRequest(PayriseRequest request) {
		double percentageIncrease = (request.getNewsalary() - request.getSalary()) / request.getSalary() * 100;
		percentageIncrease = Math.round(percentageIncrease * 100.0) / 100.0;
		if (percentageIncrease <= 2) {
			System.out.println("Supervisor will approve payrise of " + percentageIncrease + " %");
		} else {
			super.processRequest(request);
		}
	}
}
