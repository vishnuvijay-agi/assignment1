import java.util.Scanner;
public class Employee
{

		String name;
		int empid;
		String contact;
		double salary;
		String department;
		char gender;
		String designation;
		
		Employee(String name,int empid,String contact)
		{
			this.name=name;
			this.empid=empid;
			this.contact=contact;
			this.salary=1000000;
		}
		
	
	public void getInput() 
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter employee ID: ");
			empid=scan.nextInt();
			System.out.println("Enter employee contact: ");
			contact=scan.toString();
			System.out.println("Enter employee salary: ");
			salary=scan.nextDouble();
			System.out.println("Enter employee department: ");
			department=scan.next();
			System.out.println("Enter employee gender: ");
			gender=scan.next().charAt(0);
			System.out.println("Enter employee designation: ");
			designation=scan.next();
		}
	public void display()
		 {
			  
			  System.out.println("Employee id = " + empid);
			  System.out.println("Employee name = " + name);
			  System.out.println("Employee salary = " + salary);
		 }
		
	double commission(double percentage)
		{
			double commission=(percentage/100)*salary;
			return commission;
		}
			
	double calculateSalary(double commission)
		{
			double salary= salary+commission;
			return salary;
		}
	
	public static void main(String[]args) 
		{
			Employee e[]=new Employee[5];
				for (int i = 0; i < 5; i++) 
				{
		            System.out.println("Employee id  name and salary :" + e[i].empid + " " + e[i].name + " " + e[i].salary);
				}
			System.out.println("The Employee details are :");
			for(int i=0; i<5; i++) 
			{
				e[i].display();
			}
		}
}
				

				




	

