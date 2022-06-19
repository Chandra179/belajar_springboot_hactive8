package sesi_09.demo_alexa;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DomBuilder {
	// Factory API untuk DOM parser
	private final static DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			
	// createDocumentBuilder digunakan untuk membuat DocumentBuilder
	public static DocumentBuilder createDocumentBuilder() throws ParserConfigurationException {
		
		dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
		
		// DocumentBuilder -> API untuk DOM document
		DocumentBuilder dBuilder = dbf.newDocumentBuilder(); 
		
		return dBuilder;
	}
}
