package com.code4t2.carDealership.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;

@Path("DealershipAPI/Users")
public class TestServiceEndpoint {

	@GET
	@Path("/Users")
	@Produces("application/json")
	public Response GetUsers() {
		String responseString = null;
		List<TestUser> Users = new ArrayList<TestUser>();
		try {
			Users = new TestDatabaseConnections().GetUsers();
			Gson UserJson = new Gson();
			responseString = UserJson.toJson(Users);
		} catch (Exception ex){
			ex.printStackTrace();
		} 		
		//return responseString;
		return Response.ok(responseString, MediaType.APPLICATION_JSON).build();
	}

}
