package Assignment9.Problem1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students)
	{
		if(students == null || students.isEmpty())
		{
			return null;
		}
		HashMap<Key,Student> studentHashMap = new HashMap<>();
		for(Student student:students)
		{
			if(student == null)
			{
				continue;
			}
			Key key = new Key(student.getFirstName(),student.getLastName());
			studentHashMap.put(key,student);
		}

		return studentHashMap;
	}
}
