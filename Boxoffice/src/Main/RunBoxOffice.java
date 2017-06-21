package Main;

import Function.Function;
import UI.PrintMenu;

public class RunBoxOffice {

	PrintMenu printManager = new PrintMenu();

	public RunBoxOffice() {
		printManager.printMenu();
		printManager.pressKey();
		printManager.jump();
		
		new Function();
		
	}
}
