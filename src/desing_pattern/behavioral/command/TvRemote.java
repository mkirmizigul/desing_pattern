package desing_pattern.behavioral.command;

public class TvRemote {

	
	public static ElectronicDevice getDevice() {
		return new Television();
	}
	
}
