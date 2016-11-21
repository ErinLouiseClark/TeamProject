import java.util.Comparator;
public class GPASorter implements Comparator<Student>
{
	public int compare(Student GPA1, Student GPA2)
	{
		double o=CalculateGPA(GPA1);
		double t=CalculateGPA(GPA2);
		if(o<t)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public static double CalculateGPA(Student x)
	{
		double one=0;
		if(x.getFirstGrade().equals("A+"))
		{
			one=one+4.3;
		}
		else if(x.getFirstGrade().equals("A"))
		{
			one=one+4;
		}
		else if(x.getFirstGrade().equals("A-"))
		{
			one=one+3.7;
		}
		else if(x.getFirstGrade().equals("B+"))
		{
			one=one+3.3;
		}
		else if(x.getFirstGrade().equals("B"))
		{
			one=one+3;
		}
		else if(x.getFirstGrade().equals("B-"))
		{
			one=one+2.7;
		}
		else if(x.getFirstGrade().equals("C+"))
		{
			one=one+2.3;
		}
		else if(x.getFirstGrade().equals("C"))
		{
			one=one+2;
		}
		else if(x.getFirstGrade().equals("C-"))
		{
			one=one+1.7;
		}
		else if(x.getFirstGrade().equals("D+"))
		{
			one=one+1.3;
		}
		else if(x.getFirstGrade().equals("D"))
		{
			one=one+1;
		}
		else if(x.getFirstGrade().equals("D-"))
		{
			one=one+0.7;
		}
		else if(x.getFirstGrade().equals("F"))
		{
			one=one+0;
		}
		
		
		if(x.getSecondGrade().equals("A+"))
		{
			one=one+4.3;
		}
		else if(x.getSecondGrade().equals("A"))
		{
			one=one+4;
		}
		else if(x.getSecondGrade().equals("A-"))
		{
			one=one+3.7;
		}
		else if(x.getSecondGrade().equals("B+"))
		{
			one=one+3.3;
		}
		else if(x.getSecondGrade().equals("B"))
		{
			one=one+3;
		}
		else if(x.getSecondGrade().equals("B-"))
		{
			one=one+2.7;
		}
		else if(x.getSecondGrade().equals("C+"))
		{
			one=one+2.3;
		}
		else if(x.getSecondGrade().equals("C"))
		{
			one=one+2;
		}
		else if(x.getSecondGrade().equals("C-"))
		{
			one=one+1.7;
		}
		else if(x.getSecondGrade().equals("D+"))
		{
			one=one+1.3;
		}
		else if(x.getSecondGrade().equals("D"))
		{
			one=one+1;
		}
		else if(x.getSecondGrade().equals("D-"))
		{
			one=one+0.7;
		}
		else if(x.getSecondGrade().equals("F"))
		{
			one=one+0;
		}
		
		
		if(x.getThirdGrade().equals("A+"))
		{
			one=one+4.3;
		}
		else if(x.getThirdGrade().equals("A"))
		{
			one=one+4;
		}
		else if(x.getThirdGrade().equals("A-"))
		{
			one=one+3.7;
		}
		else if(x.getThirdGrade().equals("B+"))
		{
			one=one+3.3;
		}
		else if(x.getThirdGrade().equals("B"))
		{
			one=one+3;
		}
		else if(x.getThirdGrade().equals("B-"))
		{
			one=one+2.7;
		}
		else if(x.getThirdGrade().equals("C+"))
		{
			one=one+2.3;
		}
		else if(x.getThirdGrade().equals("C"))
		{
			one=one+2;
		}
		else if(x.getThirdGrade().equals("C-"))
		{
			one=one+1.7;
		}
		else if(x.getThirdGrade().equals("D+"))
		{
			one=one+1.3;
		}
		else if(x.getThirdGrade().equals("D"))
		{
			one=one+1;
		}
		else if(x.getThirdGrade().equals("D-"))
		{
			one=one+0.7;
		}
		else if(x.getThirdGrade().equals("F"))
		{
			one=one+0;
		}
		return one;
	}
}