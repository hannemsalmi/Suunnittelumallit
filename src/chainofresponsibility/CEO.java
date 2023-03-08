package chainofresponsibility;

public class CEO extends ApprovalPower {
	
	public void processRequest(PayriseRequest request) {
		double payrise = request.getNewsalary()/request.getSalary() - 1;
			System.out.println("CEO will approve payrise of " + Math.round(payrise*100) + " %");
		}
	}
