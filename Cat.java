import java.text.NumberFormat;

public class Cat 
{
	private String name = new String(""); 
	private double cost = 0; 
	private boolean isRented = false; 

	public Cat(String n, double price){
		setName(n); 
		setCost(price); 
	}

	public String getName(){
		return name; 
	}

	public void setName(String n){
		if (n instanceof String){
			name = (String) n; 
		}
	}

	public double getCost(){
		return cost; 
	}

	public void setCost(double price){
		if(price < 0){
			IllegalArgumentException iae = new IllegalArgumentException("Cost cannot be negative."); 
			throw iae; 
		}
		cost = price; 	
	}

	public void rentCat(){
		isRented = true; 
	}

	public void returnCat(){
		isRented = false; 
	}

	public String toString(){
		return (name+": $" + cost + " / day"); 
	}

}