package day2GetterNSetterMethods;

public class Student
{
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}

//public class Student {
//	
//	//Data members
//	int rollno;
//	String name;
//	
//	//member functions
//	void getData()
//	{
//		rollno = 51;
//		name = "Dhvani";
//	}
//	
//	void displayData()
//	{
//		System.out.println("Name: " + name + " Roll No: " + rollno);	
//	}
//	
//}
