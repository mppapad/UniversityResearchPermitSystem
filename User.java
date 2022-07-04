import java.util.*;

public class User {

	protected String UserCredentials;
	

	public User(String userCredentials) {
		super();
		UserCredentials = userCredentials;
	}

	public void Input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Email? ");
		String logincreds = in.nextLine();
			
		logincreds = logincreds.concat("~");
			
		System.out.println("Password? ");
		logincreds = logincreds.concat(in.nextLine());
		
		UserCredentials = logincreds;		
	}
	
	public int[] Login(ArrayList<User> users) {
	
		int position, result;
		
		for(int i=0; i<users.size(); i++) {
			if((this.UserCredentials).equals(users.get(i).getUserCredentials())) {
				position = i;
				result = 1;
				return new int[] {position, result};
			}
		}
		
		position = -1;
		result = 0;
	    return new int[] {position, result};
	}

	public String getUserCredentials() {
		return UserCredentials;
	}

	public void setUserCredentials(String userCredentials) {
		UserCredentials = userCredentials;
	}

}