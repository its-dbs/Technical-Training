package day2GetterNSetterMethods;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		
		e1.setEmpId(101);
		e1.setEmpName("Dhvani");
		e1.setEmpEmail("dbs123@gmail.com");
		e1.setEmpDept("Data Analysis");
		e1.setEmpSalary(59000);
		
		//this will directly call the toString method from the Employee class
		System.out.println(e1);
				

	}

}
