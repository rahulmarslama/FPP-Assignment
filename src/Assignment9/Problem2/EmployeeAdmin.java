package Assignment9.Problem2;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums)
	{
		if(table.isEmpty() || socSecNums.isEmpty())
		{
			return null;
		}
		List<Employee> employees = new ArrayList<>();

		for (String ssn:socSecNums)
		{
				table.forEach((key,student)->
				{
					if(key.equals(ssn) && student.getSalary() > 80000)
					{

						employees.add(student);
					}
				});
		}
		Collections.sort(employees, Comparator.comparing(Employee::getSsn));
		return employees;
		
	}
	
}
