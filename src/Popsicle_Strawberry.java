public class Popsicle_Strawberry extends Popsicle {
	
	public Popsicle_Strawberry() {
		category = "Strawberry Popsicle";
		
	}
	
	public void buyPop() {
		System.out.println("Now vending a strawberry popsicle\n");
	}
	public String getName() {
		return category;
	}
}