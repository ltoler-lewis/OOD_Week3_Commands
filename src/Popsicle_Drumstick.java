public class Popsicle_Drumstick extends Popsicle {
	
	public Popsicle_Drumstick() {
		category = "Drumstick";
		//name = choice;
	}
	
	public void buyPop() {
		System.out.println("Now vending a Drumstick. The ice cream, not the part of a bird.\n");
	}
	public String getName() {
		return category;
	}
}