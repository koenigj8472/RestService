package de.testREST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class RESTController {

	@POST
	@Path("/postMethod")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postMethod(InputStream input) {
		StringBuilder stringBuilder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(input, "UTF-8"));
			String line = null;
			while ((line = in.readLine()) != null) {
				stringBuilder.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Response.status(200).entity(stringBuilder.toString()).build();
	}
	
	@GET
	@Path("/ping")
	@Consumes(MediaType.TEXT_PLAIN)
	public Response ping(InputStream input){
		String result = "success";
		return Response.status(200).entity(result).build();
	}
}
