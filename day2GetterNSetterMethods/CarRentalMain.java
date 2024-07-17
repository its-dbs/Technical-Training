package day2GetterNSetterMethods;

public class CarRentalMain {

	public static void main(String[] args) {
		
		CarRental cr = new CarRental();
		cr.setCarId(2051906);
		cr.setCarType("smallcar");
		
		int id = cr.getCarId();
		String ct = cr.getCarType();
		
		//Getting car details
		String carDeatils = cr.GetCar(id, ct);
		System.out.println("Cardetails: " + carDeatils);
		
		
		float rent = cr.GetRent(ct);
		cr.setRent(rent);
		System.out.print("\n Rent: "+ rent);
		
		String showCarDetails = cr.ShowCar();		
		System.out.println("\n Your car details are: " + showCarDetails);
		
		
		
	
	}

}
