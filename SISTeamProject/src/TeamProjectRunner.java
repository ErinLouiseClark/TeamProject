import java.util.*;
import java.io.*;
public class TeamProjectRunner {

	static Scanner file;
	static ArrayList<String> studentRoster = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {	
		file = new Scanner(new File("studentInformation.txt"));
		while(TeamProjectRunner.file.hasNext()){
			studentRoster.add(TeamProjectRunner.file.nextLine());		
		}			
		welcomeUser();
		//test
		//
	}
	
	public static void welcomeUser(){
		System.out.println("Welcome to the class roster!");
		System.out.println("What would you like to do?");
		System.out.println("1) add or delete a student");
		System.out.println("2) change a student's grade or schedule");
		System.out.println("3) sort students");
		Scanner userInput = new Scanner(System.in);
		int task = userInput.nextInt();
		if(task == 1){
			addOrDelete.askUser();
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
