package no.ntnu.p15.rest;

import no.ntnu.p15.DB;
import no.ntnu.p15.model.Measure;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/measure")
public class MeasureResource {

    @Path("/{name}")
    @GET
    @Produces({"application/xml", "application/json"})
    public Measure get(@PathParam("name") String name) {
        System.out.println("Got GET! for name: " + name);
        return DB.get(name);
    }

    @POST
    @Consumes({"application/xml","application/json"})
    public Response post(Measure measure) {

        System.out.println("MEAS:" + measure.getName());

        DB.save(measure.getName(), measure);

        return Response.ok().build();
    }
}
