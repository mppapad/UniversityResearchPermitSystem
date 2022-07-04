import java.util.*;

public class President extends User{

	private String IdNumOfPres;
	private String NameOfPres;
	
	public President(String userCredentials) {
		super(userCredentials);
	}

	public President(String userCredentials, String idNumOfPres, String nameOfPres) {
		super(userCredentials);
		IdNumOfPres = idNumOfPres;
		NameOfPres = nameOfPres;
	}
	
	public void GrantsAccess(Request req, ArrayList<User> members) {
		Scanner in = new Scanner(System.in);
		String decision;
		
		for (int i = 0; i < members.size(); i++) {
			
			System.out.println("Do you want to give access to " + ((Member)(members.get(i))).getNameOfMember() + "? Yes / No");
			decision = in.nextLine();
			
			if(decision.equalsIgnoreCase("yes")) {
				req.setMembersWithAccess(members.get(i));
			
			do {
				System.out.println("Set role for " + ((Member)(members.get(i))).getNameOfMember() + "? Assessor / Rapporteur");
				decision = in.nextLine();
				if(decision.equalsIgnoreCase("assessor")) {
					req.setAssessorMembers(members.get(i));
				}
				else if (decision.equalsIgnoreCase("rapporteur")) {
					req.setRapporteurMember(members.get(i));
				}
			}while(!(decision.equalsIgnoreCase("assessor")) && !(decision.equalsIgnoreCase("rapporteur")));
			}
			
			/*
			req.setMembersWithAccess(members.get(i));
			
			
			if (i!=0) {
				req.setAssessorMembers(members.get(i));
			}
			
			if (i==0) {
				req.setRapporteurMember(members.get(i));
			}
			*/
			
		}
	}

	public String getIdNumOfPres() {
		return IdNumOfPres;
	}

	public void setIdNumOfPres(String IdNumOfPres) {
		this.IdNumOfPres = IdNumOfPres;
	}

	public String getNameOfPres() {
		return NameOfPres;
	}

	public void setNameOfPres(String NameOfPres) {
		this.NameOfPres = NameOfPres;
	}
	
	public void printData() {
		System.out.println("IdNumOfPres: " + this.IdNumOfPres);
		System.out.println("NameOfPres: " + this.NameOfPres);
		System.out.println("UserCredentials: " + this.UserCredentials);
	}
}