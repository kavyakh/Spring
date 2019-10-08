package com.zensar.spring.poems;

import java.sql.Array;

public class TwinkleTwinkle implements Poem {
     private static final String LINES[] = {
    		 "Twinkle Twinkle Little star","How i wonder what you are","Up above the world so high","like a diamond in the sky,"
     };
	@Override
	public void resite() {
		// TODO Auto-generated method stub
         for(String line: LINES) {
        	 System.out.println(line);
         }
	}

}
