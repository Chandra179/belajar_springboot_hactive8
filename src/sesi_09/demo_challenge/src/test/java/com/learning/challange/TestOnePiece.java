package com.learning.challange;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;


public class TestOnePiece {
	
	@Test
	public void parseOnePiece() throws ParserConfigurationException {
		// TODO Auto-generated method stub
		OnePieceParser parser = new OnePieceParser();
		List<OnePiece> lines = parser.parseUsers();
		lines.forEach(System.out::println);
	}
}
