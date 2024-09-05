package com.tns.day2;

public class encapsulation {
	private int atm_pin=1234;
	private int password=678;
	public static void main(String[]  args)

	{
		encapsulation en = new encapsulation();
		System.out.println(en.atm_pin);
		System.out.println(en.password);//private
		en.accesifier();
	}
	void accesifier()
	{
		System.out.println("keep private");//default
	}
}
