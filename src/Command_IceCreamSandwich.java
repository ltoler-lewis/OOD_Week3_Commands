public class Command_IceCreamSandwich implements Command {
	Popsicle_IceCreamSandwich popsicle;

	public Command_IceCreamSandwich(Popsicle_IceCreamSandwich popsicle) {
		this.popsicle = popsicle;
	}
	public void execute() {
		popsicle.buyPop();
	}
	public String getOption() {
		return popsicle.getName();
	}
}