package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;

public abstract class User extends Object implements UserLike, Friend {
	protected String username;
	// Add some classes to store friend ships 
	protected ArrayList<User> friendships = new ArrayList<User>();
	
	//add some methods for handling and storing friends 
	public ArrayList<User> getFriendShips(){
		return friendships;
	}
	
	public void addAFriend(User friend){
		friendships.add(friend);
	}
	
	public void removeAFriend(User friend){
		friendships.remove(friend);
	}

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
