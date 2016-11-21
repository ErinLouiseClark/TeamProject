import java.util.Comparator;
public class ProjectSorter implements Comparator<Student>
{
	public int compare(Student project1, Student project2)
	{
		if(SortStudent.moreChoice==1)
		{
			return project1.getFirstClass().compareTo(project2.getFirstClass());
		}
		else if(SortStudent.moreChoice==2)
		{
			return project1.getSecondClass().compareTo(project2.getSecondClass());
		}
		else
		{
			return project1.getThirdClass().compareTo(project2.getThirdClass());
		}
	}
}
