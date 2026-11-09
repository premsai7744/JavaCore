package com.premit.demo;

public class DemoMain {

	public static void main(String[] args) {
		GuiFactory factory;
		factory = new WindowsFactory();
	 	Button button = factory.createButton();
	 	Checkbox checkbox = factory.createCheckbox();
	 	button.click();
	 	checkbox.check();
	}

}
