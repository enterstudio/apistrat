var swagger = require("swagger-node-express");
var url = require("url");
var errors = swagger.errors;
var params = swagger.params;

/* add model includes */

function writeResponse (response, data) {
  response.header('Access-Control-Allow-Origin', "*");
  response.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
  response.header("Access-Control-Allow-Headers", "Content-Type");
  response.header("Content-Type", "application/json; charset=utf-8");
  response.send(JSON.stringify(data));
}

exports.models = models = require("../models.js");

exports.addEvent = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/events",
    "notes" : "",
    "summary" : "adds a new event",
    "httpMethod": "POST",
    "params" : [].concat([]).concat([]).concat([params.body("body", "event to add", "Event", true)
    ]),
    "responseClass" : "Event",
    "errorResponses" : [errors.invalid('id'), errors.notFound('Event')],
    "nickname" : "addEvent"
  },
  'action': function (req,res) {
    if (!req.params.body) {
      throw errors.invalid('body');
    }
    writeResponse(res, {message: "how about implementing addEvent as a POST method?"});    
  }
};
exports.findEventById = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/events/{eventId}",
    "notes" : "",
    "summary" : "looks up an event by ID",
    "httpMethod": "GET",
    "params" : [].concat([params.path("eventId", "ID of event to look up", "long", null, true)]).concat([]).concat([]),
    "responseClass" : "Event",
    "errorResponses" : [errors.invalid('id'), errors.notFound('Event')],
    "nickname" : "findEventById"
  },
  'action': function (req,res) {
    if (!req.params.eventId) {
      throw errors.invalid('eventId');
    }
    writeResponse(res, {message: "how about implementing findEventById as a GET method?"});    
  }
};
exports.deleteEvent = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/events/{eventId}",
    "notes" : "",
    "summary" : "Removes an event",
    "httpMethod": "DELETE",
    "params" : [].concat([params.path("eventId", "ID of event to look delete", "long", null, true)]).concat([]).concat([]),
    "responseClass" : "Event",
    "errorResponses" : [errors.invalid('id'), errors.notFound('Event')],
    "nickname" : "deleteEvent"
  },
  'action': function (req,res) {
    if (!req.params.eventId) {
      throw errors.invalid('eventId');
    }
    writeResponse(res, {message: "how about implementing deleteEvent as a DELETE method?"});    
  }
};
exports.getEventStatus = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/events/{eventId}/status",
    "notes" : "",
    "summary" : "gets the attendee status of the event",
    "httpMethod": "GET",
    "params" : [].concat([params.path("eventId", "ID of event to get status on", "long", null, true)]).concat([]).concat([]),
    "responseClass" : "EventStatus",
    "errorResponses" : [errors.invalid('id'), errors.notFound('EventStatus')],
    "nickname" : "getEventStatus"
  },
  'action': function (req,res) {
    if (!req.params.eventId) {
      throw errors.invalid('eventId');
    }
    writeResponse(res, {message: "how about implementing getEventStatus as a GET method?"});    
  }
};

