public class Command_BananaPopsicle implements Command {
	Popsicle_Banana popsicle;

	public Command_BananaPopsicle(Popsicle_Banana popsicle) {
		this.popsicle = popsicle;
	}
	public void execute() {
		popsicle.buyPop();
	}
	public String getOption() {
		return popsicle.getName();
	}
}