package sesi_09.demo_sax.src.test.java.com.learning.sax;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;

import sesi_09.demo_sax.src.main.java.com.learning.sax.User;
import sesi_09.demo_sax.src.main.java.com.learning.sax.UsersParser;


public class TestSaxParser {

	@Test
	public void parseUser() throws ParserConfigurationException {
		UsersParser parser = new UsersParser();
		List<User> lines = parser.parseUsers();
		lines.forEach(System.out::println);
	}
}
