package com.neogrid.simulator.util.response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.neogrid.simulator.enums.WebServiceLayout;
import com.neogrid.simulator.enums.WebServiceType;
import com.neogrid.simulator.model.Resposta;
import com.neogrid.simulator.util.JpaUtil;
import com.neogrid.simulator.util.Parameter;

public class ResponseFactory {

	private static final Logger logger = LoggerFactory.getLogger(ResponseFactory.class);
	
	private static final String PARAMETER_IP = "ip";
	private static final String PARAMETER_LAYOUT = "layout";
	private static final String PARAMETER_TYPE = "type";

	public Resposta getResponse(String ip, WebServiceType webserviceType, WebServiceLayout webserviceLayout) {
		JpaUtil jpaUtil = new JpaUtil();
	    
	    Parameter ipParameter = new Parameter(PARAMETER_IP, ip);
	    
    	Parameter pType = new Parameter(PARAMETER_TYPE, Long.valueOf(webserviceType.getType()));
    	Parameter pLayout = new Parameter(PARAMETER_LAYOUT, Long.valueOf(webserviceLayout.getLayout()));
    	
    	logger.info("Buscando respostas com parametros ip = " + ip + " tipo=" + pType.getValue() +  " layout=" + pLayout.getValue());
    	Resposta response = (Resposta) jpaUtil.findByParams("select r from Resposta as r where r.tipo.id = :type and r.layout.id = :layout and r.ip = :ip", 
    			pType, pLayout, ipParameter);
	    
	    if(response == null) {
	    	logger.info("Não encontrado, buscando parametros padrão");
	    	response = (Resposta) jpaUtil.findByParams("select r from Resposta as r where r.tipo.id = :type and r.layout.id = :layout and r.ip is null",
	    			pType, pLayout);
	    }
	    
	    if(response == null) {
	    	throw new NullPointerException("Resposta não encontrada para o serviço");
	    }
	    
		return response;
	}
}
