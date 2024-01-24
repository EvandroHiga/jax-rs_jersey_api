package br.com.higa.config;

import org.glassfish.jersey.server.ResourceConfig;

public class ConfigApplication extends ResourceConfig {
	public ConfigApplication() {
		register(new ApplicationBinder());
		packages(true, "br.com.higa.resource");
	}
}
