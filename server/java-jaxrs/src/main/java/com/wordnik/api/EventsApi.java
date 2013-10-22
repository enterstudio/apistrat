package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.model.Event;
import com.wordnik.model.EventStatus;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/events")
@Api(value = "/events", description = "the events API")
@Produces({"application/json"})
public class EventsApi {
  @POST
  @Path("/")
  @ApiOperation(value = "adds a new event", notes = "", response = Event.class)
  @ApiResponses(value = { })
     
  public Response addEvent(
    @ApiParam(value = "event to add"
    ,required=true) Event body
    )
      throws NotFoundException {
    // throw 400 error on any null, required values
    if(body == null) {
      return Response.status(400).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "body is a required parameter")).build();
    }
    // do some magic!
    
    return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "OK!")).build();
  }

  @GET
  @Path("/{eventId}")
  @ApiOperation(value = "looks up an event by ID", notes = "", response = Event.class)
  @ApiResponses(value = { @ApiResponse(code = 404, message = "Event not found")})
     
  public Response findEventById(
    @ApiParam(value = "ID of event to look up"
    ,required=true)@PathParam("eventId") Long eventId
    )
      throws NotFoundException {
    // throw 400 error on any null, required values
    if(eventId == null) {
      return Response.status(400).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "eventId is a required parameter")).build();
    }
    // do some magic!
    
    return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "OK!")).build();
  }

  @DELETE
  @Path("/{eventId}")
  @ApiOperation(value = "Removes an event", notes = "", response = Event.class)
  @ApiResponses(value = { @ApiResponse(code = 404, message = "Event not found")})
     
  public Response deleteEvent(
    @ApiParam(value = "ID of event to look delete"
    ,required=true)@PathParam("eventId") Long eventId
    )
      throws NotFoundException {
    // throw 400 error on any null, required values
    if(eventId == null) {
      return Response.status(400).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "eventId is a required parameter")).build();
    }
    // do some magic!
    
    return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "OK!")).build();
  }

  @GET
  @Path("/{eventId}/status")
  @ApiOperation(value = "gets the attendee status of the event", notes = "", response = EventStatus.class)
  @ApiResponses(value = { })
     
  public Response getEventStatus(
    @ApiParam(value = "ID of event to get status on"
    ,required=true)@PathParam("eventId") Long eventId
    )
      throws NotFoundException {
    // throw 400 error on any null, required values
    if(eventId == null) {
      return Response.status(400).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "eventId is a required parameter")).build();
    }
    // do some magic!
    
    return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "OK!")).build();
  }

  }

