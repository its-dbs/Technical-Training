package day3ArrayOfObjects;

import java.util.*;

import day2GetterNSetterMethods.Employee;

/*Create a class that captures airline tickets. 
 * Each ticket lists the departure and arrival cities, a flight number, and a seat assignment. 
 * A seat assignment has both a row and a letter for the seat
 * within the row (such as 12F). Make two examples of tickets. */

class AirlineDetails
{
	private String departureCity;
	private String arrivalCity;
	private String flightNumber;
	private String seatAssignment;
	
	
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getSeatAssignment() {
		return seatAssignment;
	}
	public void setSeatAssignment(String seatAssignment) {
		this.seatAssignment = seatAssignment;
	}
	
	//
	@Override
	public String toString() {
		return "AirlineDetails [departureCity= " + departureCity + ", arrivalCity= " + arrivalCity + ", flightNumber= "
				+ flightNumber + ", seatAssignment= " + seatAssignment + "]";
	}
	
	
	
}

public class AirlineTickets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		AirlineDetails a[] = new AirlineDetails[5];
		
		for(int i=0; i<2; i++)
		{
			a[i] = new AirlineDetails();
		}
		
	
		for(int i=0; i<2; i++)
		{
			System.out.println("Enter Your Departure City: ");
			a[i].setDepartureCity(sc.nextLine());
			System.out.println("Enter Your Arrival City: ");
			a[i].setArrivalCity(sc.nextLine());
			System.out.println("Enter Your Flight Number: ");
			a[i].setFlightNumber(sc.nextLine());
			System.out.println("Enter Your Seat Assigned (Ex:12F ): ");
			a[i].setSeatAssignment(sc.nextLine());
		}
		
		
		for(int j=0; j<2; j++)
		{
			System.out.println(a[j]);
		}
		
			
	}

}
