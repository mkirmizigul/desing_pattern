package desing_pattern.behavioral.command;

public class TurnTVOff implements Command {

	ElectronicDevice electronicDevice;
	
	public TurnTVOff(ElectronicDevice electronicDevice) {
		super();
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		electronicDevice.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		electronicDevice.on();	
	}

}
