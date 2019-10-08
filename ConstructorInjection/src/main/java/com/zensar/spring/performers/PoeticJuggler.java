package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

public class PoeticJuggler extends Juggler {
	private Poem poem;
	
	public PoeticJuggler() {
		// TODO Auto-generated constructor stub
		System.out.println("no arg constructor");
	}

	public PoeticJuggler(int beanbags, Poem poem) {
		super(beanbags);
		this.poem = poem;
		System.out.println("beanbags,poem");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("while resiting a poem..");
		poem.resite();
	}

}
