import java.util.*;

public class Member extends User{

	private String IdNumOfMember;
	private String NameOfMember;
	
	public Member(String userCredentials, String idNumOfMember, String nameOfMember) {
		super(userCredentials);
		IdNumOfMember = idNumOfMember;
		NameOfMember = nameOfMember;
	}

	public void EisAdd(Request req) {
		Scanner in = new Scanner(System.in);
		int selection = 0;
		
		do {
			System.out.println("Please type 1 in order to upload the proposal.");
			selection = in.nextInt();
		}while(selection != 1);
		
		do {
			System.out.println("Please type 1 in order to mark the proposal as updated.");
			selection = in.nextInt();
		}while(selection != 1);
		req.setEisCompleted(true);
		
	}
	
	public void RatAdd(Request req, User user) {
		Scanner in = new Scanner(System.in);
		int selection = 0;
		
		do {
			System.out.println("Please type 1 in order to upload your rating.");
			selection = in.nextInt();
		}while(selection != 1);
		
		req.getAssessorMembersCompleted().add(user);
	}
	
	public Member(String userCredentials) {
		super(userCredentials);
	}

	public String getIdNumOfMember() {
		return IdNumOfMember;
	}

	public void setIdNumOfMember(String IdNumOfMember) {
		this.IdNumOfMember = IdNumOfMember;
	}

	public String getNameOfMember() {
		return NameOfMember;
	}

	public void setNameOfMember(String NameOfMember) {
		this.NameOfMember = NameOfMember;
	}
	
	public void printData(Member member) {
		System.out.println("IdNumOfMember: " + this.IdNumOfMember);
		System.out.println("NameOfMember: " + this.NameOfMember);
		System.out.println("UserCredentials: " + this.UserCredentials);
	}

}