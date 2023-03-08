package chainofresponsibility;

public abstract class ApprovalPower {
	private ApprovalPower successor;
	
	public void setSuccessor(ApprovalPower successor) {
		this.successor = successor;
	}
	
	public void processRequest(PayriseRequest request) {
		if(successor != null) {
			successor.processRequest(request);
		}
	}
	
}
