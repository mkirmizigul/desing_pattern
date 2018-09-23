package desing_pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

	public static void main(String[] args) {

		ElectronicDevice newDevice=TvRemote.getDevice();
		
		TurnTVOn onCmdOn=new TurnTVOn(newDevice);
		
		DeviceButton onPressedButton=new DeviceButton(onCmdOn);
		
		onPressedButton.press();

		//----------
		
		TurnTVOff onCmdOff=new TurnTVOff(newDevice);
		
		DeviceButton offPressedButton=new DeviceButton(onCmdOff);
		
		offPressedButton.press();
		
		//----------
		
		TurnTVUp volUpCmd=new TurnTVUp(newDevice);
		
		DeviceButton upPressedButton=new DeviceButton(volUpCmd);
		
		upPressedButton.press();
		upPressedButton.press();
		upPressedButton.press();
		
		// -------
		
		Television tv=new Television();
		
		Radio radio=new Radio();
		
		List<ElectronicDevice> allDevice=new ArrayList<ElectronicDevice>();
		
		allDevice.add(tv);
		allDevice.add(radio);
		
		TurnItAllOff turnOffDevices=new TurnItAllOff(allDevice);
		
		DeviceButton turnThemOff=new DeviceButton(turnOffDevices);
		
		turnThemOff.press();
		
		turnThemOff.pressUndo();
	}

}
