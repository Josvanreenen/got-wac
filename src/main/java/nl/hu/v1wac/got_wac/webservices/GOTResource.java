package nl.hu.v1wac.got_wac.webservices;

import java.util.AbstractMap.SimpleEntry;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import sun.security.provider.certpath.OCSPResponse.ResponseStatus;

@Path("/GOT")
public class GOTResource {

	@GET
	@Produces("application/json")
	public Response baseline() {
		if(Math.random()>=0.5) {
			return Response.status(Response.Status.PAYMENT_REQUIRED).build();
		}
		SimpleEntry<String, String> resp = new SimpleEntry<String, String>("answer", "look, I did something");
		return Response.ok(resp).build();
	}
}
