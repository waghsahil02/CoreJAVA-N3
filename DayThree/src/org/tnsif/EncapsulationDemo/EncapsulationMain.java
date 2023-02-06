package org.tnsif.EncapsulationDemo;

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC b = new HDFC();
		b.setPin(9999);
		System.out.println(b.getPin());
		b.accept();

	}

}
