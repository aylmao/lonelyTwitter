package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User {
	protected String username;

	//getter
	public String getUsername() {
		return username;
	}

	//setter
	public abstract void setUsername(String myusername) throws IOException;
	/*
	 public void setUsername(String myusername) {
		this.username = myusername;
	}
	*/

	//constructor 
	public User() {
		super();
		this.username = "anonymous";
	}
	
	
}
