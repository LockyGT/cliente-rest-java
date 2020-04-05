package tech.israelnavarro.demo.restclient.utils;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.ClientConfig;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import static tech.israelnavarro.demo.restclient.config.RestConfig.URL_BASE_API;
/**
 * 
 * @author israel
 *	Es el cliente rest principal, se encarga de conectar con la API REST
 * 
 */
public class WebTargetClient {

	public static WebTarget webTarget(String path) {
		Client client = ClientBuilder.newClient(
	    		new ClientConfig().register(JacksonJsonProvider.class));
		WebTarget webTarget = client.target(URL_BASE_API).path(path);
		
		return webTarget;
	}
}
