package br.com.higa.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("main")
public class ApiResource {
	
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public Response apiAwakeTest(){
		return Response.status(200).entity("jax-rs_jersey_api is awake!").build();
	}
}
