package com.zensar.Spring.performers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.zensar.Spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private Map<Instrument,String> instrumentSongMap;
 
	
	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}


	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}


	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing song");
		for (Map.Entry<Instrument,String> entry : instrumentSongMap.entrySet())  
			entry.getKey().play();
        //System.out.println("song"+entry.getValue());
			
	}
    
}
