import java.util.*;

public class Request {

	private static int counter = 0;
	
	private String NameOfRequest;
	private int IdNum;
	private boolean IsComplete;
	private boolean IsAuthorized;
	private boolean IsRegistered;
	private boolean EisCompleted;
	private String Comments;
	private boolean FinSub; //Γνώρισμα για τον αν έχουμε τελική υποβολή ή προσωρινή αποθήκευση
	private boolean ConflictOfInterest;
	
	private ArrayList<User> MembersWithAccess = new ArrayList<>();
	private ArrayList<User> AssessorMembers = new ArrayList<>();
	private ArrayList<User> AssessorMembersCompleted = new ArrayList<>();
	private User RapporteurMember;
	
	
	public Request(String nameOfRequest, boolean finSub) {
		super();
		NameOfRequest = nameOfRequest;
		FinSub = finSub;
		counter++;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Request.counter = counter;
	}
	public String getNameOfRequest() {
		return NameOfRequest;
	}
	public void setNameOfRequest(String nameOfRequest) {
		NameOfRequest = nameOfRequest;
	}
	public int getIdNum() {
		return IdNum;
	}
	public void setIdNum(int idNum) {
		IdNum = idNum;
	}
	public boolean isIsComplete() {
		return IsComplete;
	}
	public void setIsComplete(boolean isComplete) {
		IsComplete = isComplete;
	}
	public boolean isIsAuthorized() {
		return IsAuthorized;
	}
	public void setIsAuthorized(boolean isAuthorized) {
		IsAuthorized = isAuthorized;
	}
	public boolean isIsRegistered() {
		return IsRegistered;
	}
	public void setIsRegistered(boolean isRegistered) {
		IsRegistered = isRegistered;
	}
	public boolean isEisCompleted() {
		return EisCompleted;
	}
	public void setEisCompleted(boolean eisCompleted) {
		EisCompleted = eisCompleted;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public boolean isFinSub() {
		return FinSub;
	}
	public void setFinSub(boolean finSub) {
		FinSub = finSub;
	}
	public boolean isConflictOfInterest() {
		return ConflictOfInterest;
	}
	public void setConflictOfInterest(boolean conflictOfInterest) {
		ConflictOfInterest = conflictOfInterest;
	}
	public ArrayList<User> getMembersWithAccess() {
		return MembersWithAccess;
	}
	public void setMembersWithAccess(User userWithAccess) {
		MembersWithAccess.add(userWithAccess);
	}
	public ArrayList<User> getAssessorMembers() {
		return AssessorMembers;
	}
	public void setAssessorMembers(User assessorMember) {
		AssessorMembers.add(assessorMember);
	}
	public User getRapporteurMember() {
		return RapporteurMember;
	}
	public void setRapporteurMember(User rapporteurMember) {
		RapporteurMember = rapporteurMember;
	}
	public ArrayList<User> getAssessorMembersCompleted() {
		return AssessorMembersCompleted;
	}
	public void setAssessorMembersCompleted(User assessorMemberCompleted) {
		AssessorMembersCompleted.add(assessorMemberCompleted);
	}
	
	public void printData() {
		System.out.println("NameOfRequest: " + this.NameOfRequest);
		System.out.println("idNum: " + this.IdNum);
		System.out.println("IsComplete: " + this.IsComplete);
		System.out.println("IsAuthorized: "+ this.IsAuthorized);
		System.out.println("IsRegistered: " + this.IsRegistered);
		System.out.println("ConflictOfInterest: " + this.ConflictOfInterest);
		System.out.println("Eisigisi Completed: " + this.EisCompleted);
	}


}