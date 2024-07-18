package day3ArrayOfObjects;

/*Create classes that capture bank customers and bank accounts. 
 * A customer has a first and last name. An account has a customer and a balance. 
 * Make objects for two accounts held by the same customer.

*/

class BankCustomers
{
	private String firstName;
	private String lastName;
	
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
	
	@Override
	public String toString() {
		return firstName +" "+ lastName;
	}
	
	
}

class BankAccounts
{
	private String customer;
	private float balance;
	
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "BankAccounts [customer= " + customer + ", balance= " + balance + "]";
	}
	
	
}


public class BankDetails {

	public static void main(String[] args) {

		BankCustomers b1 = new BankCustomers();
		b1.setFirstName("Dhvani");
		b1.setLastName("Shah");
		
		BankAccounts ba1 = new BankAccounts();
		BankAccounts ba2 = new BankAccounts();
		
		String customer = b1.toString();
		
		
		ba1.setCustomer(customer);
		ba1.setBalance(250000);
		
		ba2.setCustomer(customer);
		ba2.setBalance(1500000);
		
		System.out.println(ba1);
		System.out.println(ba2);
		

	}

}
