public class CatDriver {
	public static void main(String[] args){
		Cat c = new Cat("John", 150.00); 
		System.out.println(c.toString()); 
		c.setName("Flash"); 
		System.out.println(c.toString()); 
	}
}