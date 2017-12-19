package in.co.samples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {

	@GET
	@Path("/message")
	public Response getMessage() {
		String message = "Hello!";
		
		return Response.status(200).entity(message).build();
	}
}
