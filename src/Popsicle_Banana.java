public class Popsicle_Banana extends Popsicle {
	
	public Popsicle_Banana() {
		category = "Bannana Popsicle";
		
	}
	
	public void buyPop() {
		System.out.println("Now vending a bannana popsicle\n");
	}
	public String getName() {
		return category;
	}
	
}