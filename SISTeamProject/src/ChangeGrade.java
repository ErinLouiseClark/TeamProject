import java.util.Scanner;

public class ChangeGrade       
	{
		static String grade = "";
		static String subject = "";
		static String name = "";
		static int changeto = 0;
		static int index = 0;
		static int num = 0;		
		public static void option(){
			System.out.println("1) Change Grade");
			System.out.println("2) Switch Classes");
			Scanner userInput1 = new Scanner(System.in);
			int choice = userInput1.nextInt();
	        if(choice == 1){
				 changeGrade();
			}
			else if(choice == 2){
				changeClasses();
			}
			else{
				System.out.println("That is not an invalid option! Try again.");
				option();
			}
	}
		private static void changeGrade(){
			
			inputName();
			inputClass();
			inputGrade();	
			num = subject.length();
//			for (int i = 0; i < TeamProjectRunner.studentRoster.size(); i++){
//				if (TeamProjectRunner.studentRoster.get(i).contains(name)){
//					for (int j = 0; j < TeamProjectRunner.studentRoster.get(i).length()-num; j++){
//						if(TeamProjectRunner.studentRoster.get(i).substring(j, j + num).equalsIgnoreCase(subject)){
//							index = j + num + 1; //the index of where the grade start
//						}
//					}
//					if (TeamProjectRunner.studentRoster.get(i).substring(index, index + 2).equalsIgnoreCase("A ") || TeamProjectRunner.studentRoster.get(i).substring(index, index + 2).equalsIgnoreCase("B ") || TeamProjectRunner.studentRoster.get(i).substring(index, index + 2).equalsIgnoreCase("C ") || TeamProjectRunner.studentRoster.get(i).substring(index, index + 2).equalsIgnoreCase("D ") || TeamProjectRunner.studentRoster.get(i).substring(index, index + 2).equalsIgnoreCase("F ")){
//						TeamProjectRunner.studentRoster.add(TeamProjectRunner.studentRoster.get(i).substring(0, index) + grade + TeamProjectRunner.studentRoster.get(i).substring(index + 1, TeamProjectRunner.studentRoster.get(i).length()));
//					} else {
//						TeamProjectRunner.studentRoster.add(TeamProjectRunner.studentRoster.get(i).substring(0, index) + grade + TeamProjectRunner.studentRoster.get(i).substring(index + 2, TeamProjectRunner.studentRoster.get(i).length()));
//					}					
//					TeamProjectRunner.studentRoster.remove(i);	
//				}
//			}
			for (int i = 0; i < TeamProjectRunner.studentRoster.size(); i++){
				if (TeamProjectRunner.studentRoster.get(i).contains(name)){	
					String array[] = TeamProjectRunner.studentRoster.get(i).split(" ");
					for (int j = 0; j < array.length; j++){
						if (array[j].equals(subject)){
							if (j == 2){
								index = 3;
							}
							if (j == 4){
								index = 5;
							}
							if (j == 6){
								index = 7;
							}
						}
					}
					String la = array[0] + " " + array[1];
					String P1 = array[2] + " " + array[3];
					String P2 = array[4] + " " + array[5];
					String P3 = array[6] + " " + array[7];
					if (index == 3){
						TeamProjectRunner.studentRoster.add(la + " " +  array[2] + " " + grade + " " + P2 + " " + P3);
					}
					if (index == 5){
						TeamProjectRunner.studentRoster.add(la + " " +  P1 + " " + array[4] + " " + grade + " " + P3);
					}
					if (index == 7){
						TeamProjectRunner.studentRoster.add(la + " " +  P1 + " " + P2 + " " + array[6] + " " + grade);
					}
					TeamProjectRunner.studentRoster.remove(i);
				}
			}
			for (String s: TeamProjectRunner.studentRoster){
				System.out.println(s);
			}
		}
		
		private static void inputName(){
			Scanner userInput4 = new Scanner(System.in);
			System.out.println("What is the name of the student?");
			name = userInput4.nextLine();
			boolean hasStudent = false;
			for (String s: TeamProjectRunner.studentRoster){
				if (s.contains(name)){
					hasStudent = true;
				}
			}
			if (hasStudent == false){
				System.out.println("This student is not registered. Please input again.");
				inputName();
			}
		}
		
		private static void inputClass(){
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("Which class are you changing?");
			subject = userInput2.nextLine();
			boolean hasClass = false;
			for (int i = 0; i < TeamProjectRunner.studentRoster.size(); i++){
				if (TeamProjectRunner.studentRoster.get(i).contains(name)){
						if(TeamProjectRunner.studentRoster.get(i).contains(subject)){
						   hasClass = true;
						}
					}
			}
			if (hasClass == false){
				System.out.println("This is not a class that the student is taking. Please input again.");
				inputClass();
			}
			
		}
		
		private static void inputGrade(){
			Scanner userInput3 = new Scanner(System.in);
			System.out.println("What would you like to change it to?");
			grade = userInput3.nextLine().toUpperCase();
			if (grade.equals("A+") || grade.equals("A") || grade.equals("A-") || grade.equals("B+") || grade.equals("B") || grade.equals("B-") || grade.equals("C+") || grade.equals("C") || grade.equals("C-") || grade.equals("D+") || grade.equals("D") || grade.equals("D-") || grade.equals("F")){	
			} else {
				System.out.println("This is not a valid grade. Please input again.");
				inputGrade();
			}
		}
		
		private static void inputClassChangeTo(){
			Scanner userInput5 = new Scanner(System.in);
			System.out.println("Which period would you like to change it to?");
			changeto = userInput5.nextInt();
//			if (userInput5.nextInt() == 1){
//				changeto = 2;
//			}
//			if (userInput5.nextInt() == 2){
//				changeto = 4;
//			}
//			if (userInput5.nextInt() == 3){
//				changeto = 6;
//			}
			if (changeto == 1 || changeto == 2 || changeto == 3){
			} else {
				System.out.println("This is not a valid option. Please input again.");
				inputClassChangeTo();
			}
		}
		
        private static void changeClasses(){
			inputName();
			inputClass();
			inputClassChangeTo();
			num = subject.length();
			//int line = 0;
			for (int i = 0; i < TeamProjectRunner.studentRoster.size(); i++){
				if (TeamProjectRunner.studentRoster.get(i).contains(name)){
					//line = i;
//					for (int j = 0; j < TeamProjectRunner.studentRoster.get(i).length()-num; j++){
//						if(TeamProjectRunner.studentRoster.get(i).substring(j, j + num).equalsIgnoreCase(subject)){
//							index = j;
//						}
//					}
					String array[] = TeamProjectRunner.studentRoster.get(i).split(" ");
					for (int j = 0; j < array.length; j++){
						if (array[j].equals(subject)){
							if (j == 2){
								index = 1;
							}
							if (j == 4){
								index = 2;
							}
							if (j == 6){
								index = 3;
							}
						}
					}
					String la = array[0] + " " + array[1];
					String P1 = array[2] + " " + array[3];
					String P2 = array[4] + " " + array[5];
					String P3 = array[6] + " " + array[7];
					if (index == 1 && changeto == 2){
						TeamProjectRunner.studentRoster.add(la + " " + P2 + " " + P1 + " " + P3);	
					}
					if (index == 1 && changeto == 3){
						TeamProjectRunner.studentRoster.add(la + " " + P3 + " " + P2 + " " + P1);	
					}
					if (index == 2 && changeto == 1){
						TeamProjectRunner.studentRoster.add(la + " " + P2 + " " + P1 + " " + P3);	
					}
					if (index == 2 && changeto == 3){
						TeamProjectRunner.studentRoster.add(la + " " + P1 + " " + P3 + " " + P2);	
					}
					if (index == 3 && changeto == 1){
						TeamProjectRunner.studentRoster.add(la + " " + P3 + " " + P2 + " " + P1);	
					}
					if (index == 3 && changeto == 2){
						TeamProjectRunner.studentRoster.add(la + " " + P1 + " " + P3 + " " + P2);	
					}
					TeamProjectRunner.studentRoster.remove(i);	
				}
			}
			for (String s: TeamProjectRunner.studentRoster){
				System.out.println(s);
			}
		}
}