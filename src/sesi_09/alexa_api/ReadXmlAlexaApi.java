package sesi_09.alexa_api;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ReadXmlAlexaApi {
	
		// TODO Auto-generated method stub
		private static final String ALEXA_API = "https://data.alexa.com/data?cli=10&url=";
		
		// Factory API untuk DOM parser
		private final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		public static void main (String[] args) {
			
			ReadXmlAlexaApi obj = new ReadXmlAlexaApi();
			int alexaRanking = obj.getALexaRanking("bcafinance.co.id");
			
			System.out.println("Ranking: " + alexaRanking);
		}
		
		public int getALexaRanking (String domain){

			int result = 0;
			String url = ALEXA_API + domain;
			
			try {
				// URLConnection -> read/write resource from url
				// new URL -> buat url dari string
				// openConnection -> connection to remote object
				URLConnection conn = new URL(url).openConnection();
				
				// input stream of bytes that reads from this connection
				try (InputStream is = conn.getInputStream()) {
					dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
					DocumentBuilder dBuilder = dbf.newDocumentBuilder(); // DocumentBuilder -> API untuk DOM document
					Document doc = dBuilder.parse(is);
					Element element = doc.getDocumentElement();
					
					NodeList nodeList = element.getElementsByTagName("POPULARITY");
					if (nodeList.getLength() > 0) {
						Element elementAttribute = (Element) nodeList.item(0);
						String ranking = elementAttribute.getAttribute("TEXT");
						if(!"".equals(ranking)) {
							result = Integer.parseInt(ranking);
						}
					}
				} 
			} catch(Exception e) {
				e.printStackTrace();
				throw new IllegalArgumentException("Invalid request for domain : " + domain);
			}
			return result;
		}

}
