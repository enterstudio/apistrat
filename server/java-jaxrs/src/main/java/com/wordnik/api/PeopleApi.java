package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.model.Person;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/people")
@Api(value = "/people", description = "the people API")
@Produces({"application/json"})
public class PeopleApi {
  @GET
  @Path("/{personId}")
  @ApiOperation(value = "looks up a person by ID", notes = "", response = Person.class)
  @ApiResponses(value = { @ApiResponse(code = 404, message = "Event not found")})
     
  public Response findPersonById(
    @ApiParam(value = "ID of person to look up"
    ,required=true)@PathParam("personId") Long personId
    )
      throws NotFoundException {
    // throw 400 error on any null, required values
    if(personId == null) {
      return Response.status(400).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "personId is a required parameter")).build();
    }
    // do some magic!
    
    return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "OK!")).build();
  }

  }

