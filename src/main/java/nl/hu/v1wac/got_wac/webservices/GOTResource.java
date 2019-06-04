package nl.hu.v1wac.got_wac.webservices;

import java.util.AbstractMap.SimpleEntry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/GOT")
public class GOTResource {

	@GET
	@Produces("application/json")
	public Response baseline() {
		SimpleEntry<String, String> resp = new SimpleEntry<String, String>("answer", "look, I did something");
		return Response.ok(resp).build();
	}
}
