package com.neogrid.simulator.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.neogrid.simulator.controllers.LayoutController;
import com.neogrid.simulator.controllers.ParametrosRespostaController;
import com.neogrid.simulator.controllers.RespostasController;
import com.neogrid.simulator.controllers.TiposController;
import com.neogrid.simulator.dao.LayoutRepository;
import com.neogrid.simulator.dao.ParametroRespostaRepository;
import com.neogrid.simulator.dao.RespostaRepository;
import com.neogrid.simulator.dao.TipoRepository;

@EnableWebMvc
@ComponentScan(basePackageClasses = { RespostasController.class, RespostaRepository.class, ParametrosRespostaController.class, 
		ParametroRespostaRepository.class, TiposController.class, TipoRepository.class, LayoutController.class, LayoutRepository.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("/WEB-INF/messages");
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(1);

		return messageSource;
	}

	@Bean
	public FormattingConversionService mvcConversionService() {
		DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
		DateFormatterRegistrar formatterRegistar = new DateFormatterRegistrar();
		formatterRegistar.setFormatter(new DateFormatter("dd/MM/yyyy"));

		formatterRegistar.registerFormatters(conversionService);
		return conversionService;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	    configurer.enable();
	}
	
}
