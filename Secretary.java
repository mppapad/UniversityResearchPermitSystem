import java.util.*;

public class Secretary extends User{
	
	public Secretary(String userCredentials) {
		super(userCredentials);
	}
	
	public int FieldUpdate(Request req, int selection) {
		Scanner in = new Scanner(System.in);
		String decision;
		int confl=0;
		
		if (selection == 0) {
			int temp = 0;
			do {
				System.out.println("Is there a conflict of interest? Yes / No ");
				decision = in.nextLine();
				
				if(decision.equalsIgnoreCase("yes")) {
					req.setConflictOfInterest(true);
					temp = 1;
				}
				if (decision.equalsIgnoreCase("no")) {
					req.setConflictOfInterest(false);
					temp = 1;
				}
			}while(temp!=1);
			
			temp = 0;
			do {
				System.out.println("Is the request complete? Yes / No");
				decision = in.nextLine();
				
				if(decision.equalsIgnoreCase("yes")) {
					req.setIsComplete(true);
					temp = 1;
					confl = 1;
				}
				if(decision.equalsIgnoreCase("no")){
					req.setIsComplete(false);
					temp = 1;
					confl = 0;
				}
			}while(temp!=1);
			
			req.setIsRegistered(true);
			
			req.setIdNum(Request.getCounter());
			
			req.setNameOfRequest(((req.getNameOfRequest()).concat("_")).concat(Integer.toString(Request.getCounter())));
		}
		
		
		if (selection == 1) {
			System.out.println("Is the request authorized? Yes/No");
			decision = in.nextLine();
			
			if(decision.equalsIgnoreCase("yes")) {
				req.setIsAuthorized(true);
			}
			else {
				req.setIsAuthorized(false);
			}
		}	
		return confl;
	}
	
	public void printData() {
		System.out.println(" " + this.UserCredentials);
	}
}