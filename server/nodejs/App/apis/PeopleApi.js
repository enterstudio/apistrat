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

exports.findPersonById = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/people/{personId}",
    "notes" : "",
    "summary" : "looks up a person by ID",
    "httpMethod": "GET",
    "params" : [].concat([params.path("personId", "ID of person to look up", "long", null, true)]).concat([]).concat([]),
    "responseClass" : "Person",
    "errorResponses" : [errors.invalid('id'), errors.notFound('Person')],
    "nickname" : "findPersonById"
  },
  'action': function (req,res) {
    if (!req.params.personId) {
      throw errors.invalid('personId');
    }
    writeResponse(res, {message: "how about implementing findPersonById as a GET method?"});    
  }
};

