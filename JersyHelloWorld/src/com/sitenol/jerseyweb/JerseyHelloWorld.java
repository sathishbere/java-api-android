package com.sitenol.jerseyweb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.json.JSONException;
import org.json.JSONObject;



@Path("/helloWorld")
	public class JerseyHelloWorld {
		@GET
		@Produces("application/xml")
		public Response getMessage() throws JSONException{
			JSONObject jsonObject= new JSONObject();
			jsonObject.put("Welcome Message","HELLO BEREEEEEEEEEEEE");
			return Response.status(Status.OK).type(MediaType.APPLICATION_JSON).entity(jsonObject.toString()).build();
		}
}
