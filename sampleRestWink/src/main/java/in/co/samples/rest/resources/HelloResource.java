package in.co.samples.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {

	@GET
	@Path("/message")
	public Response getMessage() {
		String message = "Hello!";
		System.out.println("Enter getMessage()");
		return Response.status(200).entity(message).build();
	}
}
