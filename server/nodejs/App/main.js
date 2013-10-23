var express = require("express")
 , url = require("url")
 , swagger = require("swagger-node-express")
 , db = false

var app = express();
app.use(express.bodyParser());

swagger.setAppHandler(app);  

var eventsApi = require("./apis/EventsApi.js");
var peopleApi = require("./apis/PeopleApi.js");
var m = require("./models.js");

swagger.addModels(m.models)
  .addPOST(eventsApi.addEvent)
  .addGET(eventsApi.findEventById)
  .addDELETE(eventsApi.deleteEvent)
  .addGET(eventsApi.getEventStatus)
  .addGET(peopleApi.findPersonById)
  ;

// configures the app
swagger.configure("http://localhost:8002", "0.1");

//  start the server
app.listen(8002);

