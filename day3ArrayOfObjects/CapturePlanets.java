package day3ArrayOfObjects;

/* Create a class that captures planets. 
 * Each planet has a name, a distance from the sun, 
 * and its gravity relative to Earth’s gravity. 
 * For distance and gravity, use the type double which captures real numbers. 
 * Make objects for Earth and your favorite non-earth planet.

*/

class planets
{
	private String planetName;
	private double distanceFromTheSun; // in km
	private double gravity; // in m/s^2
	
	//Getter and setter methods to set the values
	public String getPlanetName() {
		return planetName;
	}
	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}
	public double getDistanceFromTheSun() {
		return distanceFromTheSun;
	}
	public void setDistanceFromTheSun(double distanceFromTheSun) {
		this.distanceFromTheSun = distanceFromTheSun;
	}
	public double getGravity() {
		return gravity;
	}
	public void setGravity(double gravity) {
		this.gravity = gravity;
	}
	
	//to print the values
	@Override
	public String toString() {
		return "planets [planetName= " + planetName + ", distanceFromTheSun= " + distanceFromTheSun + ", gravity= "
				+ gravity + "]";
	}
	
	
	
}

public class CapturePlanets {

	public static void main(String[] args) {
		
		planets p1 = new planets();
		planets p2 = new planets();
		
		p1.setPlanetName("Earth");
		p1.setDistanceFromTheSun(150000000);
		p1.setGravity(9.807);
		
		p2.setPlanetName("Mars");
		p2.setDistanceFromTheSun(213000000);
		p2.setGravity(3.72);
		
		System.out.println("Earth's Details: \n " + p1);
		System.out.println("Mars Details: \n " + p2);
		
		
		

	}

}
