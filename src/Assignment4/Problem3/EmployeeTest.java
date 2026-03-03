package Assignment4.Problem3;

import java.util.Arrays;

public class EmployeeTest
{
    static void main()
    {
        Employee[] employees =
                {
                  new HourlyEmployee("Rahul","Lama",
                          "984602746",4500,24),
                  new HourlyEmployee("Huy","Hoang",
                        "761210987",2000,44),
                  new SalariedEmployee("Joao","Silva",
                          "452924682",5000),
                  new CommissionEmployee("Suman","Acharya",
                        "129275988",200,52),
                  new BasePlusCommissionEmployee("Leul","Tsige",
                        "731239845",300,22,
                          4000),
                };
        try
        {
            double compareSalary = 10000;
            Employee[] filteredSalaryEmployee = findSalaryList(employees,compareSalary);
            if(filteredSalaryEmployee.length==0)
            {
                System.out.printf("No Employee with salary less than: %.2f",compareSalary);
            }else
            {
                System.out.printf("The employees with salary less than: $%.2f are: \n \n",compareSalary);
                for(Employee emp : filteredSalaryEmployee)
                {
                    System.out.println(emp.toString());
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }



    }

    public static Employee[] findSalaryList (Employee[] employees, double salary) throws Exception
    {

        if(employees == null || employees.length == 0)
        {
            throw new Exception("At least one employee is required!");
        }
        int count = 0;

        //using an extra loop cause we can not use ArrayList till now.

        for (Employee employee : employees)
        {
            if(employee.getPayment()<salary)
            {
                count++;
            }
        }

        Employee[] returnEmp = new Employee[count];

        int index =0;
        for (Employee employee : employees)
        {
            if(employee.getPayment()<salary)
            {
                returnEmp[index++] = employee;
            }
        }

        return returnEmp;
    }
}
