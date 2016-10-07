package com.neogrid.simulator.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.neogrid.simulator.enums.WebServiceType;
import com.neogrid.simulator.model.Resposta;
import com.neogrid.simulator.util.response.ResponseBuilder;
import com.neogrid.simulator.util.response.ResponseFactory;

public abstract class AbstractMockService implements MockService {
	
	private static final Logger logger = LoggerFactory.getLogger(AbstractMockService.class);
	
	@Resource
	WebServiceContext wsContext;
	
	public String consultarLoteRps(String requestMessage) {
		HttpServletRequest request = (HttpServletRequest) wsContext.getMessageContext().get(MessageContext.SERVLET_REQUEST); 
		logger.info("IP do Cliente = " + request.getRemoteAddr());
	    
	    Resposta response = new ResponseFactory().getResponse(request.getRemoteAddr(), WebServiceType.CONSULTA_LOTE, getLayout());
		return new ResponseBuilder(response, requestMessage).build();
	}
	
	public String consultarSituacaoLoteRps(String requestMessage) {
		HttpServletRequest request = (HttpServletRequest) wsContext.getMessageContext().get(MessageContext.SERVLET_REQUEST); 
		logger.info("IP do Cliente = " + request.getRemoteAddr());
	    
	    Resposta response = new ResponseFactory().getResponse(request.getRemoteAddr(), WebServiceType.CONSULTA_SITUACAO_LOTE, getLayout());
		return new ResponseBuilder(response, requestMessage).build();
	}
	
	public String recepcionarLoteRps(String requestMessage) {
		HttpServletRequest request = (HttpServletRequest) wsContext.getMessageContext().get(MessageContext.SERVLET_REQUEST);
		logger.info("IP do Cliente = " + request.getRemoteAddr());
		
	    Resposta response = new ResponseFactory().getResponse(request.getRemoteAddr(), WebServiceType.RECEPCAO_LOTE_RPS, getLayout());
		return new ResponseBuilder(response, requestMessage).build();
	}
	
	public String consultarNfsePorRps(String requestMessage) {
		HttpServletRequest request = (HttpServletRequest) wsContext.getMessageContext().get(MessageContext.SERVLET_REQUEST); 
		logger.info("IP do Cliente = " + request.getRemoteAddr());
	    
	    Resposta response = new ResponseFactory().getResponse(request.getRemoteAddr(), WebServiceType.CONSULTA_NFSE_POR_RPS, getLayout());
		return new ResponseBuilder(response, requestMessage).build();
	}
	
}
