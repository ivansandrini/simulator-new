package com.neogrid.simulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final int MAX_POST_SIZE = 10485760; // 10mb

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*
     * Set maxPostSize of embedded tomcat server to 10 megabytes (default is 2 MB, not large enough to support file uploads > 1.5 MB)
     */
    @Bean
    EmbeddedServletContainerCustomizer containerCustomizer() throws Exception {
        return (ConfigurableEmbeddedServletContainer container) -> {
            if (container instanceof TomcatEmbeddedServletContainerFactory) {
                final TomcatEmbeddedServletContainerFactory tomcat = (TomcatEmbeddedServletContainerFactory) container;
                tomcat.addConnectorCustomizers(connector -> connector.setMaxPostSize(MAX_POST_SIZE));
            }
        };
    }

}
