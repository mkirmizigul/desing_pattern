package desing_pattern.behavioral.command;

public class TurnTVDown implements Command {

	ElectronicDevice electronicDevice;
	
	public TurnTVDown(ElectronicDevice electronicDevice) {
		super();
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		electronicDevice.volumeDown();
	}

	@Override
	public void undo() {
		electronicDevice.volumeUp();
	}

}
