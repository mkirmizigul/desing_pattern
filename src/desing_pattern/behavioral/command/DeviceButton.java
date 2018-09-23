package desing_pattern.behavioral.command;

public class DeviceButton {

	Command theCommand;

	public DeviceButton(Command theCommand) {
		super();
		this.theCommand = theCommand;
	}
	public void press() {
		theCommand.execute();
	}
	
	public void pressUndo() {
		theCommand.undo();
	}	
}
