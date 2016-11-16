import java.util.*;
public class TeamProjectRunner {

	public static void main(String[] args) {
		welcomeUser();
		//test
	}
	
	public static void welcomeUser(){
		System.out.println("Welcome to the class roster!");
		System.out.println("What would you like to do?"
				+ "1) add or delete a student"
				+ "2) change a student's grade or schedule"
				+ "3) sort students");
		Scanner userInput = new Scanner(System.in);
		int task = userInput.nextInt();
		if(task == 1){
			
		}
		else if(task == 2){
			
		}
		else if(task == 3){
			
		}
		else{
			System.out.println("That is an invalid option! Try again.");
			welcomeUser();
		}
	}

}
