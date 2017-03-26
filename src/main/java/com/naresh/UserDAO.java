package com.naresh;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {

	private static Map<Integer, User> usersMap = new HashMap<Integer, User>();

	static {
		usersMap.put(1, new User(1, "Naresh", "nareshkumarh@live.com", "pass"));
		usersMap.put(2, new User(1, "Suresh", "suresh@gmail.com", "pass"));
	}

	public static User login(String email, String password) {

		User user = null;
		for (User u : usersMap.values()) {
			if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
				user = u;
				break;
			}
		}
		return user;
	}
}
