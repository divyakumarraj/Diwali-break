//  Create a class named 'Member' having the fillowing member
class member{
	String Name;
	int Age;
	int P_number;
	String Address;
	float Salary;
	public void printSalary()
	{
		System.out.println("Salary of Member");
	}
	
}
class Employee extends member
{
	String Specialization;
	String Depaetment;
	Employee()
	{
		System.out.println(Name="prakash");
		System.out.println(Age=20);
		System.out.println(P_number=987646);
		System.out.println(Address="mathura");
		System.out.println(Salary=100000);
	}
}
public class Manager extends member
{
	String Specialization;
	String Depaetment;
	Manager()
	{
		// System.out.println();
		System.out.println(Name="Gupta");
		System.out.println(Age=20);
		System.out.println(P_number=654987);
		System.out.println(Address="varanasi");
		System.out.println(Salary=999990);
	}
	public static void main(String[] args) {
		Employee obj=new Employee();
		Manager obj1=new Manager();
	}
}
