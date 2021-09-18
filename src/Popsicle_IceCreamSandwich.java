public class Popsicle_IceCreamSandwich extends Popsicle {
	
	public Popsicle_IceCreamSandwich() {
		category = "Ice Cream Sandwich";
		//name = choice;
	}
	
	public void buyPop() {
		System.out.println("Now vending an ice cream sandwich\n");
	}
	public String getName() {
		return category;
	}
}