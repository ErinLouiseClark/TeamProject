import java.util.*;
import java.util.concurrent.SynchronousQueue;
public class addOrDelete {

	
	public static void askUser() {
		System.out.println("Would you like to add or delete a student?");
		System.out.println("1) add a student");
		System.out.println("2) delete a student");
		System.out.println("3) go back");
		Scanner userInput = new Scanner(System.in);
		int temp = userInput.nextInt();
		
		
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
		System.out.println("Enter the first name of the student.");
		Scanner userInput = new Scanner(System.in);
		String firstName = userInput.nextLine();
		System.out.println("Enter the last name of the student.");
		Scanner userInput2 = new Scanner(System.in);
		String lastName = userInput.nextLine();
		System.out.println("Enter the student's first class.");
		Scanner userInput3 = new Scanner(System.in);
		String firstClass = userInput.nextLine();
		System.out.println("Enter the student's second class.");
		Scanner userInput4 = new Scanner(System.in);
		String secondClass = userInput.nextLine();
		System.out.println("Enter the student's last class.");
		Scanner userInput5 = new Scanner(System.in);
		String thirdClass = userInput.nextLine();
		TeamProjectRunner.studentRoster.add(firstName + " " + lastName + " " + firstClass + " " + secondClass + " " + thirdClass);
		System.out.println("Here is the new roster:");
		for(String s : TeamProjectRunner.studentRoster){
			System.out.println(s);
		}
	}
	
	public static void deleteStudent() {
		int counter = 0;
		System.out.println("Enter the name of the student.");
		Scanner userInput2 = new Scanner(System.in);
		String testName = userInput2.nextLine();
		for(int i = 0; i < TeamProjectRunner.studentRoster.size(); i++){
			if(TeamProjectRunner.studentRoster.get(i).toLowerCase().contains(testName.toLowerCase()) == true){
				System.out.println("Is this the correct student? Enter 1 for yes and 2 for no.");
				System.out.println(TeamProjectRunner.studentRoster.get(i));
				Scanner userInput3 = new Scanner(System.in);
				int correct = userInput3.nextInt();
				if(correct == 1){
					TeamProjectRunner.studentRoster.remove(counter);
					System.out.println("The student has been removed from the roster. Here is the new roster: ");
					for(String s : TeamProjectRunner.studentRoster){
						System.out.println(s);
					}
				}
				else if (correct > 2 || correct < 1) {
					deleteStudent();
				}
				else{
					if((i+1)<TeamProjectRunner.studentRoster.size()){
						i = i;
					}
					else{
						System.out.println("There is no student with that name. Try again.");
						deleteStudent();
					}
				}
			}
			else{
				System.out.println("There is not a student with that name in the roster. Try again.");
				deleteStudent();
			}
			counter++;
		}
	}
}
