package com.neogrid.simulator.util.response;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.InvalidXPathException;
import org.dom4j.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReplaceParameterRequest implements ReplaceParameter {

	private static final Logger logger = LoggerFactory.getLogger(ReplaceParameterRequest.class);
	
	private String requestMessage;

	private String message;

	private String key;
	
	public ReplaceParameterRequest(String key, String requestMessage, String message) {
		this.key = key;
		this.requestMessage = requestMessage;
		this.message = message;
	}
	
	@Override
	public String replace() {
		StringBuilder updatedMessage = new StringBuilder();
		
		try {
			Document document = DocumentHelper.parseText(requestMessage);
			logger.info("Request = " + document.asXML());
			
			List<Node> selectNodes = selectNodes(document);
			
			if(selectNodes != null && !selectNodes.isEmpty()) {
				selectNodes.forEach(node ->{
					updatedMessage.append(ResponseUtils.substituiParametroRequest(key, node.getText(), message));
					logger.info("Request = " + node.getText());
				});
			} else {
				updatedMessage.append(message);
			}
			
		} catch (DocumentException e) {
			logger.error("Erro ao realizar parse do request");
			logger.debug(e.getMessage(), e);
		}
		
		return updatedMessage.toString();
	}
	
	@SuppressWarnings("unchecked")
	private List<Node> selectNodes(Document document) {
		List<Node> selectNodes = null;
		try {
			selectNodes = DocumentHelper.selectNodes("*//" + key, document);
			if(selectNodes.isEmpty()) {
				selectNodes = DocumentHelper.selectNodes(key, document);
			}
		} catch (InvalidXPathException e){
			logger.info("Parametro não encontrado com a chave = " + key);
			logger.debug(e.getMessage(), e);
		}
		return selectNodes;
	}

}
