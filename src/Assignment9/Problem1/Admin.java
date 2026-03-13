package Assignment9.Problem1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students)
	{
		HashMap<Key,Student> studentHashMap = new HashMap<>();
		for(Student student:students)
		{
			Key key = new Key(student.getFirstName(),student.getLastName());
			studentHashMap.put(key,student);
		}

		return studentHashMap;
	}
}
