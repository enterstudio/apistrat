var client = require("swagger-client");

var swagger = new client.SwaggerApi(
  {
    url: "http://localhost:8080/api-docs",
    success: function() {
      if(swagger.ready === true) {
        swagger.apis.events.findEventById(
          {
            eventId: 1
          },
          function(data) {
            console.log("got data: " + data.content.data);
          }
        );
      }
    }
  }
)
