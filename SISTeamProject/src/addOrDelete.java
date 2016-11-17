import java.util.*;
import java.util.concurrent.SynchronousQueue;
public class addOrDelete {

	static ArrayList<String> studentRoster = new ArrayList<String>();
	
	public static void askUser() {
		System.out.println("Would you like to add or delete a student?");
		System.out.println("1) add a student");
		System.out.println("2) delete a student");
		System.out.println("3) go back");
		Scanner userInput = new Scanner(System.in);
		int temp = userInput.nextInt();
		
		while(TeamProjectRunner.file.hasNext()){
			
			studentRoster.add(TeamProjectRunner.file.nextLine());		
		
		}
			
		if (temp == 1) {
			addStudent();
		}
		else if (temp == 2) {
			deleteStudent();
		}
		else if (temp == 3) {
			TeamProjectRunner.welcomeUser();
		}
		else {
			System.out.println("That is not a valid option.");
			askUser();
		}
	}
	
	public static void addStudent() {
		
	}
	
	public static void deleteStudent() {
		int counter = 0;
		System.out.println("Enter the first name of the student.");
		Scanner userInput2 = new Scanner(System.in);
		String testName = userInput2.nextLine();
		for(int i = 0; i < studentRoster.size(); i++){
			if(studentRoster.get(i).contains(testName) == true){
				System.out.println("Is this the correct student? Enter 1 for yes and 2 for no.");
				System.out.println(studentRoster.get(i));
				Scanner userInput3 = new Scanner(System.in);
				int correct = userInput3.nextInt();
				if(correct == 1){
					studentRoster.remove(counter);
					System.out.println("The student has been removed from the roster. Here is the new roster: ");
					for(String s : studentRoster){
						System.out.println(s);
					}
				}
				else if (correct > 2 || correct < 1) {
					deleteStudent();
				}	
			}
			counter++;
		}
	}
}
