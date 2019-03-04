/*********************************************************************************
*Dwelling.java
*Daniel Wight
*
*Class that assigns values to each Dwelling variable in WightDanielWeek6Prog.java
**********************************************************************************/

public class Dwelling
{
	private String category;  //type of Dwelling
	private int numberOfBedrooms;  //number of bedrooms in Dwelling
	private double numberOfBathrooms;  //number of bathrooms in Dwelling
	private double area;  //area of Dwelling
	private boolean centralAirCond;  //boolean of whether Dwelling has AC

//Accessor Methods

	public String getCategory(){
		return this.category;
	}
	public int getNumberOfBedrooms(){
		return this.numberOfBedrooms;
	}
	public double getNumberOfBathrooms(){
		return this.numberOfBathrooms;
	}
	public double getArea(){
		return this.area;
	}
	public boolean getCentralAirCond(){
		return this.centralAirCond;
	}

//Mutator Methods

	public void setCategory(String category){
		this.category = category;
	}
	public void setNumberOfBedrooms(int numberOfBedrooms){
		this.numberOfBedrooms = numberOfBedrooms;
	}
	public void setNumberOfBathrooms(double numberOfBathrooms){
		this.numberOfBathrooms = numberOfBathrooms;
	}
	public void setArea(double area){
		this.area = area;
	}
	public void setCentralAirCond(boolean centralAirCond){
		this.centralAirCond = centralAirCond;
	}

//methods for printing input displays

	public void printLn1(){
		System.out.print("Enter the number of Bedrooms in the " + this.getCategory() + ": ");
	}
	public void printLn2(){
		System.out.print("Enter the number of Bathrooms in the " + this.getCategory() + ": ");
	}
	public void printLn3(){
		System.out.print("Enter the area of the " + this.getCategory() + " in sq.ft: ");
	}
	public void printLn4(){
		System.out.print("Is the " + this.getCategory() + " air conditioned? true or false?: ");
	}
}  //end class