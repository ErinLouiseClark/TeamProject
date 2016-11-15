import java.util.*;
public class TeamProjectRunner {

<<<<<<< HEAD
	public static void main(String[] args) {
		welcomeUser();
		
=======
	public void main(String[] args) {
		welcomeUser();

>>>>>>> 4678e6a86cc7c2c2fedef0dc305b201143a5f13a
	}
	
	public static void welcomeUser(){
		System.out.println("Welcome to the class roster!");
<<<<<<< HEAD
		System.out.println("What would you like to do?");
		System.out.println("1) add or delete a student");
		System.out.println( "2) change a student's grade or schedule");
		System.out.println("3) sort students");
	}//basically, make welcomeUser() static.
	//make three choices in seperate lines.
=======
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
>>>>>>> 4678e6a86cc7c2c2fedef0dc305b201143a5f13a

}
