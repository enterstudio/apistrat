package com.wordnik.swagger.app

import org.scalatra.swagger.{JacksonSwaggerBase, Swagger, ApiInfo}
import org.scalatra.ScalatraServlet
import org.json4s.{DefaultFormats, Formats}

class ResourcesApp(implicit val swagger: Swagger) extends ScalatraServlet with JacksonSwaggerBase {
  before() {
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }

  protected def buildFullUrl(path: String) = if (path.startsWith("http")) path else {
   val port = request.getServerPort
   val h = request.getServerName
   val prot = if (port == 443) "https" else "http"
   val (proto, host) = if (port != 80 && port != 443) ("http", h+":"+port.toString) else (prot, h)
   "%s://%s%s%s".format(
     proto,
     host,
     request.getContextPath,
     path)
  }
}

class SwaggerApp extends Swagger("1.2", "1", ApiInfo(
    "swagger-sample",
    "A sample server",
    "http://helloreverb.com/terms",
    "support@your-app.com",
    "Apache 2.0",
    "http://www.apache.org/licenses/LICENSE-2.0.html"))


