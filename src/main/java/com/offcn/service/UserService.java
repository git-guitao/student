package com.offcn.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.offcn.pojo.Users;

public interface UserService {
	@GET
	@Path("/get/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,
		MediaType.TEXT_XML})
	public Users get(@PathParam("id") String id);
	
	
	@POST
	@Path("/post")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,
		MediaType.TEXT_XML})	
	public Users post(Users users);
	
	
	@PUT
	@Path("/put/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Users put(@PathParam("id") String id,Users users);

	
	@DELETE
	@Path("/delete/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Users delete(@PathParam("id") String id);

}
