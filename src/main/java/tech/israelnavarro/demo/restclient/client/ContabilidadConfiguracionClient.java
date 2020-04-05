package tech.israelnavarro.demo.restclient.client;

import java.util.ArrayList;
import java.util.Arrays;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import tech.israelnavarro.demo.restclient.config.entity.ContabilidadConfiguracion;
import tech.israelnavarro.demo.restclient.utils.WebTargetClient;

public class ContabilidadConfiguracionClient {

	private static final String RESOURCE_PATH ="contabilidad-configuracion";
	
	private static final WebTarget WEB_TARGET = WebTargetClient.webTarget(RESOURCE_PATH);
	
	/**
	 * Método para para obtener una lista de configuraciones
	 * @param status representa el eliminado lógico
	 * @return lista de contabilidad configuraciones
	 */
	public ArrayList<ContabilidadConfiguracion> getByStatus(Integer status) {
		
		ArrayList<ContabilidadConfiguracion> res = new ArrayList<ContabilidadConfiguracion>();
		
		Response response = WEB_TARGET.request(MediaType.APPLICATION_JSON_TYPE)
				.get();
		System.out.println();
		System.out.println("GET ALL StatusCode = "+response.getStatus());
		System.out.println("GET ALL Header = "+response.getHeaders());
		System.out.println("GET BODY (Object List):");
		
		Arrays.asList(response.readEntity(ContabilidadConfiguracion[].class))
				.forEach(cc -> res.add(cc));
		return res;
	
	}
	
	/**
	 * Método para registrar una contabilidad congiguración
	 * @param entity entidad para registrar
	 * @return entidad registrada
	 */
	public ContabilidadConfiguracion post(ContabilidadConfiguracion entity) {
		
		Response response = WEB_TARGET.request()
				.post(Entity.entity(entity, MediaType.APPLICATION_JSON_TYPE));
		
		System.out.println();
		System.out.println("POST executed");
		System.out.println("POST StatusCode = "+response.getStatus());
		System.out.println("POST Header location = "
				+ response.getHeaders().get("location"));
		
		return response.readEntity(ContabilidadConfiguracion.class);
	}
	
	/**
	 * Método para registrar una contabilidad congiguración
	 * @param entity entidad para registrar
	 * @return entidad registrada
	 */
	public ContabilidadConfiguracion put(ContabilidadConfiguracion entity) {
		
		Response response = WEB_TARGET.request()
				.put(Entity.entity(entity, MediaType.APPLICATION_JSON_TYPE));
		
		System.out.println();
		System.out.println("POST executed");
		System.out.println("POST StatusCode = "+response.getStatus());
		System.out.println("POST Header location = "
				+ response.getHeaders().get("location"));
		
		return response.readEntity(ContabilidadConfiguracion.class);
	}
	
	/**
	 * Método para registrar una contabilidad congiguración
	 * @param entity entidad para registrar
	 * @return entidad registrada
	 */
	public Integer delete(ContabilidadConfiguracion entity) {
		
		Response response = WEB_TARGET.request()
				.put(Entity.entity(entity, MediaType.APPLICATION_JSON_TYPE));
		
		System.out.println();
		System.out.println("POST executed");
		System.out.println("POST StatusCode = "+response.getStatus());
		System.out.println("POST Header location = "
				+ response.getHeaders().get("location"));
		
		return response.readEntity(Integer.class);
	}
}
