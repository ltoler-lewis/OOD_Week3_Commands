public class Popsicle_None extends Popsicle {
	
	public Popsicle_None() {
		category = "Nothing";
		//name = choice;
	}
	
	public void buyPop() {
		System.out.println("There is nothing in that slot\n");
	}
	public String getName() {
		return category;
	}
}