package io.pedro.hos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String hello(@PathParam("name") final String name) {
        return "hello " + name;
    }
}