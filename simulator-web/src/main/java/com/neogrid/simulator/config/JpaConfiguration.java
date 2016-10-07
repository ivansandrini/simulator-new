package com.neogrid.simulator.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import liquibase.integration.spring.SpringLiquibase;

@Configuration
public class JpaConfiguration {
	
	@Autowired
	private DataSource dataSource;

	@Bean
	public SpringLiquibase liquibase() {
	    SpringLiquibase liquibase = new SpringLiquibase();
	    
	    liquibase.setChangeLog("classpath:/db/changelog/db.changelog-master.xml");
	    liquibase.setDataSource(this.dataSource);
	    
	    return liquibase;
	}
}
