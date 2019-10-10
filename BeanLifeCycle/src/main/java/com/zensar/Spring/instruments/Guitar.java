package com.zensar.Spring.instruments;

public class Guitar implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("ting ting");

	}

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is tuned");
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("guitar is clean");
		
	}

}
