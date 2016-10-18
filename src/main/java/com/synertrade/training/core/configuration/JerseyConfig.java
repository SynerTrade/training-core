package com.synertrade.training.core.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

/**
 * @author marianab
 *
 */
@Configuration
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig(){
		packages("com.synertrade.training.core");

	}



}
