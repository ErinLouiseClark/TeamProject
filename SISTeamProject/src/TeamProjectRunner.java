import java.util.*;
import java.io.*;
public class TeamProjectRunner {

	static Scanner file;
	static ArrayList<String> studentRoster = new ArrayList<String>();
	static ArrayList<Student> register=new ArrayList<Student>();
	public static void main(String[] args) throws IOException 
	{	
		getInformation();
		welcomeUser();
		//test
	}
	public static void getInformation() throws IOException  
	{
		file = new Scanner(new File("studentInformation.txt"));
		int i=0;
		while(TeamProjectRunner.file.hasNextLine()){
			String fN=file.next();
			String lN=file.next();
			String fC=file.next();
			String fG=file.next();
			String sC=file.next();
			String sG=file.next();
			String tC=file.next();
			String tG=file.next();
			register.add(new Student(fN,lN,fC,sG,sC,sG,tC,tG));
			//System.out.println("Student"+(i+1)+": "+register.get(i));
			i++;
		}			
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
			SortStudent.choices();
		}
		else{
			System.out.println("That is an invalid option! Try again.");
			welcomeUser();
		}
	}

}
