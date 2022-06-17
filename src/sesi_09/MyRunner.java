package sesi_09;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class MyRunner {
	
	private SAXParser createSaxParser() throws ParserConfigurationException {
		SAXParser saxParser = null;
		
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			saxParser = factory.newSAXParser();
		} catch(SAXException ex) {
			Logger lgr = Logger.getLogger(MyRunner.class.getName());
			lgr.log(Level.SEVERE, ex.getMessage(), ex);
		}
		
		return saxParser;
	}
	
	public List<User> parseUsers() {
		MyHandler handler = new MyHandler();
		String fileName = "src/resources/users.xml";
		File xmlDocument = Paths.get(fileName).toFile();
		
		try {
			SAXParser parser = createSaxParser();
			
		}
	}
}
