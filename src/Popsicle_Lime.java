public class Popsicle_Lime extends Popsicle {
	
	public Popsicle_Lime() {
		category = "Lime Popsicle";
		//name = choice;
	}
	
	public void buyPop() {
		System.out.println("Now vending a lime popsicle\n");
	}
	
	public String getName() {
		return category;
	}
	
}