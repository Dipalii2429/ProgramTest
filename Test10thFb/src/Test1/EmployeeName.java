package Test1;

public class EmployeeName {
	String firstName;
	String lastName;
	
	EmployeeName(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	
public String toString()
{
	return firstName+""+lastName;
}
	public static void main(String[] args) 
	{
		EmployeeName e1= new EmployeeName("Dipali","Khilari");
		EmployeeName e2= new EmployeeName("ABC","XYZ");
		EmployeeName e3= new EmployeeName("PQR","RST");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		

	}

}
