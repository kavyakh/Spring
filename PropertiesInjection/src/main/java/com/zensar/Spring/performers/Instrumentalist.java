package com.zensar.Spring.performers;


import java.util.Enumeration;
import java.util.Properties;

public class Instrumentalist implements Performer {
	private Properties instrumentSongProp;

	public Properties getInstrumentSongProp() {
		return instrumentSongProp;
	}

	public void setInstrumentSongProp(Properties instrumentSongProp) {
		this.instrumentSongProp = instrumentSongProp;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumenatalist is playing songs");
		Enumeration instruments = instrumentSongProp.keys();
		while (instruments.hasMoreElements()) {
			String instrumentName = (String) instruments.nextElement();
			String song = instrumentSongProp.getProperty(instrumentName);
			System.out.println(song+"By "+instrumentName);
			
		}
		
	}
	
}
