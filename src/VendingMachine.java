//
// This is the invoker
//
public class VendingMachine {
	Command[] options;

 
	public VendingMachine() {
		options = new Command[6];

		/*Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}*/
	}
  
	public void setCommand(int slot, Command popsicle) {
		options[slot] = popsicle;

	}
 
	public void ButtonWasPushed(int slot) {
		options[slot].execute();
	}
 

  
	public void options() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Vending Machine Options -------\n");
		for (int i = 0; i < options.length; i++) {
			stringBuff.append("[slot " + (i+1) + "] " + options[i].getOption()+ "\n");
			//System.out.println(options[i].getOption());
		}
		System.out.println(stringBuff.toString());
	}
}