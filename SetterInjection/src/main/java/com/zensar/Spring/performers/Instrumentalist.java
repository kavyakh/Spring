package com.zensar.Spring.performers;

import com.zensar.Spring.instruments.Instrument;

public class Instrumentalist implements Performer {
    private Instrument instrument;
    private String song;
    
    public Instrumentalist() {
		// TODO Auto-generated constructor stub
    	System.out.println("Instrumentalist is created");
	}
    
	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrumrnt is set");
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing a song" +song);
		instrument.play();

	}

}
