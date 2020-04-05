package tech.israelnavarro.demo.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.ClientConfig;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

/**
 * @author israel
 * 
 *
 */
public class App {
    public static void main( String[] args ) {
        Client client = ClientBuilder.newClient(
        		new ClientConfig().register(JacksonJsonProvider.class));
        
        WebTarget webTarget = client.target("").path("");
    }
}
