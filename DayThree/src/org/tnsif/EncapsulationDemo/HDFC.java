package org.tnsif.EncapsulationDemo;

public class HDFC {
	private int pin;
	
	void accept() {
		System.out.println("The ATM Pin is : "+pin);
	}

	
	//getter-setters
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	

}
