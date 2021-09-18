public class Command_Drumstick implements Command {
	Popsicle_Drumstick popsicle;

	public Command_Drumstick(Popsicle_Drumstick popsicle) {
		this.popsicle = popsicle;
	}
	public void execute() {
		popsicle.buyPop();
	}
	public String getOption() {
		return popsicle.getName();
	}
}