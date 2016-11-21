import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
public class SortStudent 
{
	static int  moreChoice=0;
	public static void choices()
	{
		System.out.println("So, what is the way you would like to sort students?");
		System.out.println("1) Sort by last name.");
		System.out.println("2) Sort by GPA");
		System.out.println("3) Sort by class");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		if(choice==1)
		{
			Collections.sort(TeamProjectRunner.studentRoster, new NameSorter());
			for(int i=0; i<TeamProjectRunner.studentRoster.size();i++)
			{
				System.out.println(TeamProjectRunner.studentRoster.get(i));
			}
		}
		else if(choice==2)
		{
			Collections.sort(TeamProjectRunner.studentRoster, new GPASorter());
			for(int i=0; i<TeamProjectRunner.studentRoster.size(); i++)
			{
				System.out.println(TeamProjectRunner.studentRoster.get(i)+" GPA: "+GPASorter.CalculateGPA(TeamProjectRunner.studentRoster.get(i)));
			}
		}
		else if(choice==3)
		{
			choice3();
		}
		else
		{
			System.out.println("Invalid chocie, please choose again.");
			choices();
		}
	}
	public static void choice3()
	{
		System.out.println("Which period do you want to sort on?");///////////////////
		System.out.println("1) Period 1");
		System.out.println("2) Period 2");
		System.out.println("3) Period 3");
		Scanner scan=new Scanner(System.in);
		moreChoice=scan.nextInt();
		if(moreChoice!=1&&moreChoice!=2&&moreChoice!=3)
		{
			System.out.println("Invalid choice, please choose again");
			choice3();
		}
		else
		{
			Collections.sort(TeamProjectRunner.studentRoster, new ProjectSorter());
			for(int i=0; i<TeamProjectRunner.studentRoster.size();i++)
			{
				System.out.println(TeamProjectRunner.studentRoster.get(i));
			}
		}
	}
}
