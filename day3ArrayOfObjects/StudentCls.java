package day3ArrayOfObjects;

/*Question: Create a class that captures students.
 * Each student has a first name, last name, class year, 
 * and major. Create two examples of students.*/

class StuDetails
{
	private String firstName;
	private String lastName;
	private String classYear;
	private String major;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getClassYear() {
		return classYear;
	}
	public void setClassYear(String classYear) {
		this.classYear = classYear;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	//generating toString function to print the values
	@Override
	public String toString() {
		return "StuDetails [firstName= " + firstName + ", lastName= " + lastName + ", classYear= " + classYear + ", major= "
				+ major + "]";
	}
	
	
	
}
public class StudentCls {

	public static void main(String[] args) {
		
		StuDetails s1 = new StuDetails();
		s1.setFirstName("Dhvani");
		s1.setLastName("Shah");
		s1.setClassYear("2021 Batch");
		s1.setMajor("Data Analytics");
		
		StuDetails s2 = new StuDetails();
		s2.setFirstName("Nityaraj");
		s2.setLastName("Vala");
		s2.setClassYear("2021 Batch");
		s2.setMajor("Mechenical Enginnering");
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
