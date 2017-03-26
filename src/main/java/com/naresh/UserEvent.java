package com.naresh;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class UserEvent implements RequestHandler<User, User> {

	
	public User handleRequest(User input, Context context) {
		
		context.getLogger().log("Invocation started: " + input);		
		User response = UserDAO.login(input.getEmail(), input.getPassword());
		context.getLogger().log("Invocation ended: " + input);
		return response;

	}

}
