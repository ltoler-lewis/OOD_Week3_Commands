public class Command_Nothing implements Command {
	Popsicle_None popsicle;

	public Command_Nothing(Popsicle_None popsicle) {
		this.popsicle = popsicle;
	}
	public void execute() {
		popsicle.buyPop();
	}
	public String getOption() {
		return popsicle.getName();
	}
}