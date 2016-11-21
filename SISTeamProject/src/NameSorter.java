import java.util.Comparator;
public class NameSorter implements Comparator<Student> 
{
	public int compare(Student one, Student two)
	{
		return one.getLastName().compareTo(two.getLastName());
	}
}
