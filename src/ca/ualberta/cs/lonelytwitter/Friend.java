package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public interface Friend {
	
	public ArrayList<User> getFriendShips(); 
	
	public void addAFriend(User friend);
	
	public void removeAFriend(User friend);
}
