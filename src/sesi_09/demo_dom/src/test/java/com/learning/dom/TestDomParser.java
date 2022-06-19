package sesi_09.demo_dom.src.test.java.com.learning.dom;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import sesi_09.demo_dom.src.main.java.com.learning.dom.ParseKnownXMLStructure;

public class TestDomParser {

	@Test
	public void testDomParser() throws SAXException, IOException, ParserConfigurationException {
		ParseKnownXMLStructure.domProcessing();
	}
	
	public void testDisplayData() throws SAXException, IOException, ParserConfigurationException {
		Document document = ParseKnownXMLStructure.domProcessing();
		
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		
		NodeList nList = document.getElementsByTagName("employee");
		
		ParseKnownXMLStructure.displayData(nList);
	}
}
