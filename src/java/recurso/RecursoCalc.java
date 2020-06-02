/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurso;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Rodrigo
 */
@Path("RecursoCalc")
public class RecursoCalc {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RecursoCalc
     */
    public RecursoCalc() {
    }

    /**
     * Retrieves representation of an instance of recurso.RecursoCalc
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("soma/{n1}/{n2}")
    public double soma(@PathParam(value = "n1") double n1,
            @PathParam(value = "n2") double n2) {
        return n1 + n2;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("divisao/{n1}/{n2}")
    public double divisao(@PathParam(value = "n1") double n1,
            @PathParam(value = "n2") double n2) {

        return n1 / n2;

    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("multi/{n1}/{n2}")
    public double multi(@PathParam(value = "n1") double n1,
            @PathParam(value = "n2") double n2) {

        return n1 * n2;
   
} 

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("sub/{n1}/{n2}")
    public double sub(@PathParam(value = "n1") double n1,
            @PathParam(value = "n2") double n2) {
        return n1 - n2;
    }
}
