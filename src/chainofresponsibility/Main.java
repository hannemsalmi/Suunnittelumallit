package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		Supervisor supervisor = new Supervisor();
		DepartmentManager manager = new DepartmentManager();
		CEO ceo = new CEO();
		supervisor.setSuccessor(manager);
		manager.setSuccessor(ceo);
		
		try {
		while (true) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your current salary:");System.out.print(">");
		double s = Double.parseDouble(reader.readLine());
		System.out.println("Enter the salary you are asking for:");System.out.print(">");
		double r = Double.parseDouble(reader.readLine());
		supervisor.processRequest(new PayriseRequest(s, r));
		}
		} catch(Exception e) {
		System.exit(1);
		}
		}

	}
