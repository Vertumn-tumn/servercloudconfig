package com.profesorp.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@RefreshScope
@ConfigurationProperties("limites")
public class Configuration {
	private int minimum;
	private int maximum;	
	private int otroDato; // no esta definida como propiedd pero no pasa nada. Su valor sera 0.
}
