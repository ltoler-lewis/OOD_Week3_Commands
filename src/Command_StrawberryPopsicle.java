public class Command_StrawberryPopsicle implements Command {
	Popsicle_Strawberry popsicle;

	public Command_StrawberryPopsicle(Popsicle_Strawberry popsicle) {
		this.popsicle = popsicle;
	}
	public void execute() {
		popsicle.buyPop();
	}
	public String getOption() {
		return popsicle.getName();
	}
}