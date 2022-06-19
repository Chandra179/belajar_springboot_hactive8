package sesi_09.demo_challenge.src.test.java.com.learning.challange;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;

import sesi_09.demo_challenge.src.main.java.com.learning.challange.OnePiece;
import sesi_09.demo_challenge.src.main.java.com.learning.challange.OnePieceParser;

public class TestOnePiece {
	
	@Test
	public void parseOnePiece() throws ParserConfigurationException {
		// TODO Auto-generated method stub
		OnePieceParser parser = new OnePieceParser();
		List<OnePiece> lines = parser.parseUsers();
		lines.forEach(System.out::println);
	}
}
