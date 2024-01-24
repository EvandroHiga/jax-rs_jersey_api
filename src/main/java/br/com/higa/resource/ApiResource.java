package br.com.higa.resource;

import java.util.List;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.higa.model.Produto;
import br.com.higa.service.ApiService;

@Path("main")
public class ApiResource {
	
	@Inject
	private ApiService apiService;
	
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public Response apiAwakeTest(){
		return Response.status(200).entity("jax-rs_jersey_api is awake!").build();
	}
	
	@Path("/busca/todos")
	@Produces(MediaType.APPLICATION_XML)
	@GET
	public Response getAllProdutos() {
		GenericEntity<List<Produto>> produtoList = 
				new GenericEntity<List<Produto>>(apiService.getAllProdutos()) {};
		return Response.status(200).entity(produtoList).build();
	}
	
	@Path("/busca/{id}")
	@Produces(MediaType.APPLICATION_XML)
	@GET
	public Response getProduto(@NotNull @PathParam("id") int id) {
		return Response.status(200).entity(apiService.getProduto(id)).build();
	}

}
