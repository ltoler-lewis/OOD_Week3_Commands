
public class BuyAPopsicle {
	
	public static void main(String[] args) {
		
		VendingMachine vMachine = new VendingMachine();
		Popsicle_Strawberry strawberry = new Popsicle_Strawberry();
		Popsicle_Lime lime = new Popsicle_Lime();
		Popsicle_Banana banana = new Popsicle_Banana();
		Popsicle_IceCreamSandwich sandwich = new Popsicle_IceCreamSandwich();
		Popsicle_Drumstick drumstick = new Popsicle_Drumstick();
		Popsicle_None empty = new Popsicle_None();
		
		Command_StrawberryPopsicle c_strawberry =new Command_StrawberryPopsicle(strawberry);
		Command_LimePopsicle c_lime =new Command_LimePopsicle(lime);
		Command_BananaPopsicle c_banana =new Command_BananaPopsicle(banana);
		Command_IceCreamSandwich c_sandwich =new Command_IceCreamSandwich(sandwich);
		Command_Drumstick c_drumstick =new Command_Drumstick(drumstick);
		Command_Nothing c_none =new Command_Nothing(empty);

		vMachine.setCommand(0, c_strawberry);
		vMachine.setCommand(1, c_lime);
		vMachine.setCommand(2, c_banana);
		vMachine.setCommand(3, c_sandwich);
		vMachine.setCommand(4, c_drumstick);
		vMachine.setCommand(5, c_none);

		
		vMachine.options();
		System.out.println("\n");
		
		vMachine.ButtonWasPushed(0);
		vMachine.ButtonWasPushed(1);
		vMachine.ButtonWasPushed(2);
		vMachine.ButtonWasPushed(3);
		vMachine.ButtonWasPushed(4);
		vMachine.ButtonWasPushed(5);
    }
	
}