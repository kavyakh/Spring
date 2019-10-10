package com.zensar.Spring.performers;

//import java.util.List;
import java.util.Set;

import com.zensar.Spring.instruments.Instrument;

public class Instrumentalist implements Performer {
    private String song;
    private Set<Instrument> instruments;
    
    public Instrumentalist() {
		// TODO Auto-generated constructor stub
    	System.out.println("Instrumentalist is created");
	}
    
    
	public Set<Instrument> getInstruments() {
		return instruments;
	}


	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
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
		System.out.println("Instrumentalist is playing a song"+ song);
		for(Instrument i:instruments) {
			i.play();
			
		}
		
	}
}
