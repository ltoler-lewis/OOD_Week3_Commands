public class Command_LimePopsicle implements Command {
	Popsicle_Lime popsicle;

	public Command_LimePopsicle(Popsicle_Lime popsicle) {
		this.popsicle = popsicle;
	}
	public void execute() {
		popsicle.buyPop();
	}
	
	public String getOption() {
		return popsicle.getName();
	}
}