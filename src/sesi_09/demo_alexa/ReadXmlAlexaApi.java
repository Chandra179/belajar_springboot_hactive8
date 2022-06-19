package sesi_09.demo_alexa;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXmlAlexaApi {
	
		private static final String ALEXA_API = "https://data.alexa.com/data?cli=10&url=";
	
		// Factory API untuk DOM parser
		private final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		// createDocumentBuilder digunakan untuk membuat DocumentBuilder
		public DocumentBuilder createDocumentBuilder() throws ParserConfigurationException {
			
			dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			DocumentBuilder dBuilder = dbf.newDocumentBuilder(); // DocumentBuilder -> API untuk DOM document
			return dBuilder;
		}
		
		/*
		 dom Processing digunakan untuk memproses dom
		 dimulai dari :
		 1. parsing document
		 2. mengambil elements/child node dari document
		 * */
		public NodeList getNodeList(InputStream is) throws ParserConfigurationException, SAXException, IOException {
			
			DocumentBuilder domBuilder = createDocumentBuilder();
			Document doc = domBuilder.parse(is); // parse document
			Element element = doc.getDocumentElement(); // ambil child node
			NodeList nodeList = element.getElementsByTagName("POPULARITY"); //ambil node dalam POPULARITY
			
			return nodeList;
		}
		
		// proses untuk mendapatkan ranking
		public int getRanking(URLConnection conn) throws ParserConfigurationException, IOException, SAXException {
			
			int result = 0;
			
			// InputStream -> (stream of bytes) that reads from this connection
			try (InputStream is = conn.getInputStream()) {
				
				NodeList nodeList = getNodeList(is);
				
				if (nodeList.getLength() > 0) {
					Element elementAttribute = (Element) nodeList.item(0); //?
					String ranking = elementAttribute.getAttribute("TEXT");
					if(!"".equals(ranking)) {
						result = Integer.parseInt(ranking);
					}
				}
			} catch(Exception e) {
				e.printStackTrace();
				throw new IllegalArgumentException();
			}
			
			return result;
		}
		
		// rankingProcessing -> proses pengambilan ranking
		public int rankingProcessing (String domain){

			int ranking = 0;
			String url = ALEXA_API + domain;
			
			try {
				URLConnection conn = new URL(url).openConnection();
				ranking = getRanking(conn);
				
			} catch(Exception e) {
				e.printStackTrace();
				throw new IllegalArgumentException("Invalid request for domain : " + domain);
			}
			return ranking;
		}
		
		
		public static void main (String[] args) {
			
			ReadXmlAlexaApi obj = new ReadXmlAlexaApi();
			int alexaRanking = obj.rankingProcessing("bcafinance.co.id");
			
			System.out.println("Ranking: " + alexaRanking);
		}
}
