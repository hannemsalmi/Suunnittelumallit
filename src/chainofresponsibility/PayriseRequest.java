package chainofresponsibility;

public class PayriseRequest {
	private double salary;
	private double newsalary;
	
	public PayriseRequest(double salary, double newsalary) {
		this.salary = salary;
		this.newsalary = newsalary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNewsalary() {
		return newsalary;
	}

	public void setNewsalary(double newsalary) {
		this.newsalary = newsalary;
	}

}
