package day2GetterNSetterMethods;

/*Define a class CARRENTAL with the following details:
 * class members are CarId of int type,
 * carType of String type and 
 * rent of float type.
 * Define GetCar() method which accepts CarId and CarType.
 * GetRent() method which returns the rent of the car on the basis of car type: 
 * i.e Small car = 1000; van = 800; suv = 2500;
 * 
 *showCar() method which allows user to view the contents of cars i.2 id, type and rent*/

public class CarRental {
	
	private int carId;
	private String carType;
	private float rent;
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public float getRent() {
		return rent;
	}
	public void setRent(float rent) {
		this.rent = rent;
	}
	
	//defining getcar method
	public String GetCar(int carId, String carType)
	{
		this.carId = carId;
		this.carType = carType;
		this.rent = GetRent(carType);
		
		return "CarRental [carId=" + carId + ", carType=" + carType + "]";
		
		
	}
	
	//defining getRent method 
	public float GetRent(String carType)
	{
		
		if(carType.equalsIgnoreCase("smallcar"))
		{
			return 1000;
		}
		else if(carType.equalsIgnoreCase("van"))
		{
			return 800;
		}
		else if(carType.equalsIgnoreCase("suv"))
		{
			return 2500;
		}
		else 
		
		return 0;
		
	}
	
	// showCar() method to allow users to view contents of the car
	public String ShowCar()
	{
		return "CarRental [carId= " + carId + ", carType= " + carType + ", rent= " + rent + "]";
	}
	
	
}
