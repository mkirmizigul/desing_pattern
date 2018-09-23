package desing_pattern.behavioral.command;

public class TurnTVOn implements Command {

	ElectronicDevice electronicDevice;
	
	public TurnTVOn(ElectronicDevice electronicDevice) {
		super();
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		electronicDevice.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		electronicDevice.off();
	}

}
