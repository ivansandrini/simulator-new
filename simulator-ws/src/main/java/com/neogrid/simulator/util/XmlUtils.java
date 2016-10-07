package com.neogrid.simulator.util;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XmlUtils {
	
	//private static final Logger logger = LogManager.getLogger("XmlUtil");
	
	private static DocumentBuilder documentBuilder;
	
	static {
		try {
			if(documentBuilder == null) {
				documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			}
		} catch (ParserConfigurationException e) {
			//logger.error(e.getMessage(), e);
		}
	}
	
	/**
	 * Converte uma String em um Document
	 * @param xmlString
	 * @return
	 */
	public static Document convertStringToDocument(final String xmlString) {
		Document document = null;
		try {
			document = documentBuilder.parse(new InputSource(new StringReader(xmlString)));
		} catch (SAXException | IOException e) {
			//logger.error("Erro ao converter a String para um Document", e);
		}
		
		return document;
	}

}
