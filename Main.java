import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Ξ�ΞΉ Ο€ΞµΟ�ΞΉΟƒΟƒΟ�Ο„ΞµΟ�ΞµΟ‚ Ξ»ΞµΞΉΟ„ΞΏΟ…Ο�Ξ³Ξ―ΞµΟ‚ Ο„Ο‰Ξ½ ΞΊΞ»Ξ¬ΟƒΞµΟ‰Ξ½ Ξ΄ΞµΞ½ Ο†Ξ±Ξ―Ξ½ΞΏΞ½Ο„Ξ±ΞΉ ΟƒΟ„Ξ± Ξ΄ΞΉΞ±Ξ³Ξ¬ΞΌΞΌΞ±Ο„Ξ± Ξ±ΞΊΞΏΞ»ΞΏΟ…ΞΈΞ―Ξ±Ο‚ ΞΊΞ±ΞΉ
		 * ΞΊΞ»Ξ¬ΟƒΞµΟ‰Ξ½. Ξ‘Ο…Ο„Ο� Ξ³ΞΉΞ±Ο„Ξ― Ο�Ο„Ξ±Ξ½ Ξ΄Ξ·ΞΌΞΉΞΏΟ…Ο�Ξ³Ξ®ΟƒΞ±ΞΌΞµ Ο„Ξ± Ξ΄ΞΉΞ±Ξ³Ο�Ξ¬ΞΌΞΌΞ±Ο„Ξ± Ξ±ΞΊΞΏΞ»ΞΏΟ…ΞΈΞ―Ξ±Ο‚ Ξ΄ΞµΞ½ ΞµΞ―Ο‡Ξ±ΞΌΞµ ΟƒΞΊΞµΟ†Ο„ΞµΞ―
		 * Ο€Ξ»Ξ®Ο�Ο‰Ο‚ Ο„Ξ· Ξ΄ΞΏΞΌΞ® Ο„ΞΏΟ… ΞΊΟ�Ξ΄ΞΉΞΊΞ±. Ξ�Ο€ΞµΞΉΟ„Ξ±, Ξ»Ο�Ξ³Ο‰ Ξ­Ξ»Ξ»ΞµΞΉΟ�Ξ·Ο‚ Ο‡Ο�Ο�Ξ½ΞΏΟ… Ξ΄ΞµΞ½ Ξ®Ο„Ξ±Ξ½ ΞµΟ†ΞΉΞΊΟ„Ξ® Ξ· Ξ±Ξ»Ξ»Ξ±Ξ³Ξ®
		 * Ξ±Ο…Ο„Ο�Ξ½. Ξ•Ο€ΞµΞΉΞ΄Ξ® Ο�ΞΌΟ‰Ο‚ Ο„ΞΏ Ξ΄ΞΉΞ¬Ξ³Ο�Ξ±ΞΌΞΌΞ± ΞΊΞ»Ξ¬ΟƒΞµΟ‰Ξ½ Ο€Ο�Ξ­Ο€ΞµΞΉ Ξ½Ξ± ΞµΞ―Ξ½Ξ±ΞΉ ΟƒΞµ ΟƒΟ…Ξ½Ξ­Ο€ΞµΞΉΞ± ΞΌΞµ Ο„Ξ± Ξ΄ΞΉΞ±Ξ³Ο�Ξ¬ΞΌΞΌΞ±Ο„Ξ±
		 * Ξ±ΞΊΞΏΞ»ΞΏΟ…ΞΈΞ―Ξ±Ο‚, ΞΏΞΉ Ξ»ΞµΞΉΟ„ΞΏΟ…Ο�Ξ³Ξ―ΞµΟ‚ Ξ΄ΞµΞ½ Ο€Ο�ΞΏΟƒΟ„Ξ­ΞΈΞ·ΞΊΞ±Ξ½ ΞΊΞ±ΞΉ ΟƒΟ„ΞΏ Ξ΄ΞΉΞ¬Ξ³Ο�Ξ±ΞΌΞΌΞ± ΞΊΞ»Ξ¬ΟƒΞµΟ‰Ξ½.
		 */
		
		//ListOfUsers
		ArrayList<User> users = new ArrayList<>();
		//ListOfMembers
		ArrayList<User> members = new ArrayList<>();
		//ListOfRequests
		ArrayList<Request> requests = new ArrayList<>();
		
		User user1 = new Professor("nikosnikolaou@gmail.com~1234", "X1", "Nikos Nikolaou");
		User user2 = new Secretary("giorgosgeorgiou@gmail.com~1234");
		User user3 = new President("kostaskostopoulos@gmail.com~1234", "XY", "Kostas Kostopoulos");
		User user4 = new Member("dimitrisdimitriou@gmail.com~1234", "Y1", "Dimitris Dimitriou");
		User user5 = new Member("mixalismixalopoulos@gmail.com~1234", "Y2", "Mixalis Mixalopoulos");
		User user6 = new Member("alexistsipras@gmail.com~1234", "Y3", "Alexis Tsipras");
		User user7 = new Member("kyriakosmitsotakis@gmail.com~1234", "Y4", "Kyriakos Mitsotakis");
		User user8 = new Member("yanisvaroufakis@gmail.com~1234", "Y5", "Yanis Varoufakis");
		User user9 = new Member("dimitriskoutsoumpas@gmail.com~1234", "Y6", "Dimitris Koutsoumpas");
		User user10 = new Member("giorgospapandreou@gmail.com~1234", "Y7", "Giorgos Papandreou");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		users.add(user7);
		users.add(user8);
		users.add(user9);
		users.add(user10);
		
		members.add(user4);
		members.add(user5);
		members.add(user6);
		members.add(user7);
		members.add(user8);
		members.add(user9);
		members.add(user10);
		
		//logincredentials example: alexistsipras@gmail.com~1234
		
		int results[];
		Professor professoruser = new Professor("");
		Secretary secretaryuser = new Secretary("");
		President presidentuser = new President("");
		Member memberuser = new Member("");
		
		
		System.out.println("\nprintData Professor");
		((Professor)(users.get(0))).printData();
		System.out.println("\nprintData Secretary");
		((Secretary)(users.get(1))).printData();
		System.out.println("\nprintData President");
		((President)(users.get(2))).printData();
		System.out.println("\nprintData Members");
		for(int i=0; i<members.size(); i++) {
			((Member)(members.get(i))).printData(memberuser);
		}
		
		//professor
		System.out.println("Professor login");
		do {
			professoruser.Input();
			results = professoruser.Login(users);
			//results[0] = position (if not found results[0]==-1)
			//results[1] = results (if not found results[1]==0)
			
			if(results[1]==0)
				System.out.println("The login details you provided are not correct.");
		}while(results[1]!=1 || results[0]!=0);
		
		Request req = ((Professor)(users.get(results[0]))).CreationReq(requests);
		
		System.out.println("The request was successfully created.");
		
		//secretary
		System.out.println("\nSecretary login");
		do {
			secretaryuser.Input();
			results = secretaryuser.Login(users);
			//results[0] = position (if not found results[0]==-1)
			//results[1] = results (if not found results[1]==0)
			
			if(results[1]==0)
				System.out.println("The login details you provided are not correct.");
		}while(results[1]!=1 || results[0]!=1);
		
		int confl = secretaryuser.FieldUpdate(req, 0);
		
		if(confl==1) {
		//president
		System.out.println("\nPresident login");
		do {
			presidentuser.Input();
			results = presidentuser.Login(users);
			//results[0] = position (if not found results[0]==-1)
			//results[1] = results (if not found results[1]==0)
			
			if(results[1]==0)
				System.out.println("The login details you provided are not correct.");
		}while(results[1]!=1 || results[0]!=2);
		
		presidentuser.GrantsAccess(req, members);
		
		//rapporteur
		System.out.println("\nRapporteur member login");
		String id1 = "a";
		String id2 = "b";
		do {
			memberuser.Input();
			results = memberuser.Login(users);
			
			if(results[1]==0)
				System.out.println("The login details you provided are not correct.");
			//results[0] = position
			//results[1] = result
			
			if(results[1]!=0) {
				id1 = ((Member)(req.getRapporteurMember())).getIdNumOfMember();
				id2 = ((Member)(members.get(results[0] - 3))).getIdNumOfMember();
			}
		}while(results[1]!=1 || !(id1.equals(id2)));
		
		memberuser.EisAdd(req);
		
		//assessors
		System.out.println("\nAssessor member login");
		int idresult = 0;
		int accresult = 0;
		do {
			do {
				memberuser.Input();
				results = memberuser.Login(users);
				
				if(results[1]==0)
					System.out.println("The login details you provided are not correct.");
				//results[0] = position
				//results[1] = result
				
				if(results[1]!=0) {
					for (int i = 0; i<members.size(); i++) {
						if ((((Member)(members.get(i))).getIdNumOfMember()).equals(((Member)(members.get(results[0] - 3))).getIdNumOfMember())) {
							idresult = 1;
						}
					}
				}
			}while(results[1]!=1 || idresult!=1 || results[0]==1 || results[0]==2 || results[0]==3);
			
			for(int i = 0; i<req.getMembersWithAccess().size(); i++) {
				if (((req.getMembersWithAccess()).get(i)).getUserCredentials().equals(((Member)(members.get(results[0]-3))).getUserCredentials())) {
					accresult = 1;
				}
			}
			
			if (accresult == 1) {
				memberuser.RatAdd(req, users.get(results[0]));
			}
			else {
				System.out.println("You do not have access to this request.");
			}
		}while((req.getAssessorMembers()).size()!=(req.getAssessorMembersCompleted()).size());
		
		//secretary
		System.out.println("\nSecretary login");
		do {
			secretaryuser.Input();
			results = secretaryuser.Login(users);
			
			if(results[1]==0)
				System.out.println("Wrong credentials");
			//results[0] = position
			//results[1] = result
		}while(results[1]!=1 || results[0]!=1);
		
		confl = secretaryuser.FieldUpdate(req, 1);
		
		req.printData();
	}
		else
			System.out.println("End of the evaluation process");
	}
	

}
