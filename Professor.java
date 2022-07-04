import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class Professor extends User{

	private String IdNumOfProf;
	private String NameOfProf;

	
	public Professor(String userCredentials) {
		super(userCredentials);
	}

	public Professor(String userCredentials, String idNumOfProf, String nameOfProf) {
		super(userCredentials);
		IdNumOfProf = idNumOfProf;
		NameOfProf = nameOfProf;
	}
	
	public Request CreationReq(ArrayList<Request> requests) {
		Scanner in = new Scanner(System.in);
		
		int i = 0;
		
		do {
			System.out.println("Please type 1 in order to create a new request.");
			i = in.nextInt();
		}while(i!=1);
		
		String[] NameSurname = NameOfProf.split(" ");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDateTime now = LocalDateTime.now();
        String tempstring = (dtf.format(now));
                
		String nameofrequest = tempstring;
		
		nameofrequest = nameofrequest.concat("_");
		nameofrequest = nameofrequest.concat(NameSurname[1]);
		nameofrequest = nameofrequest.concat("_");
		nameofrequest = nameofrequest.concat(NameSurname[0]);
		
		Request req = new Request(nameofrequest, true);
		requests.add(req);
		
		
		return req;
	}

	public void DataEntry() {
		
	}

	public String getIdNumOfProf() {
		return IdNumOfProf;
	}

	public void setIdNumOfProf(String IdNumOfProf) {
		this.IdNumOfProf = IdNumOfProf;
	}

	public String getNameOfProf() {
		return NameOfProf;
	}

	public void setNameOfProf(String NameOfProf) {
		this.NameOfProf = NameOfProf;
	}
	
	public void printData() {
		System.out.println("IdNumOfProf: " + this.IdNumOfProf);
		System.out.println("NameOfProf: " + this.NameOfProf);
		System.out.println("UserCredentials: " + this.UserCredentials);
	}

}