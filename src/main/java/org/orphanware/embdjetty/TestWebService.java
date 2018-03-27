package org.orphanware.embdjetty.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

@Path("/service/test")
public class TestWebService {

   @GET
   @Path("/available")
   @Produces(MediaType.TEXT_PLAIN)
   public String available() {
      return "test is success!";
   }
   
   @GET
   @Path("/data")
   @Produces(MediaType.APPLICATION_JSON)
   public String data() {
	String normalView = "";
	try {
		MyPOJO staff = createDummyObject();
		ObjectMapper mapper = new ObjectMapper();

		normalView = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);	  
	} catch (JsonGenerationException e) {
		e.printStackTrace();
	} catch (JsonMappingException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return normalView;
   }
   
   private MyPOJO createDummyObject() {

	MyPOJO staff = new MyPOJO();

	staff.setName("Sergio");
	staff.setAge(49);
	staff.setPosition("Developer");
	staff.setSalary(new BigDecimal("200000"));

	List<String> skills = new ArrayList<String>();
	skills.add("java");
	skills.add("c#");

	staff.setListSkills(skills);

	return staff;

	}
}