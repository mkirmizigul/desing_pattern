package desing_pattern.behavioral.command;

public class TurnTVUp implements Command {

	ElectronicDevice electronicDevice;
	
	public TurnTVUp(ElectronicDevice electronicDevice) {
		super();
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		electronicDevice.volumeUp();
	}

	@Override
	public void undo() {
		electronicDevice.volumeDown();
		
	}

}
