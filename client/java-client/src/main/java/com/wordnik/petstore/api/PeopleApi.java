package com.wordnik.petstore.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.petstore.model.Person;
import java.util.*;

public class PeopleApi {
  String basePath = "http://localhost:8002/api";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  public Person findPersonById (Long personId) throws ApiException {
    // create path and map variables
    String path = "/people/{personId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "personId" + "\\}", apiInvoker.escapeString(personId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(personId == null ) {
       throw new ApiException(400, "missing required params");
    }
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (Person) ApiInvoker.deserialize(response, "", Person.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

