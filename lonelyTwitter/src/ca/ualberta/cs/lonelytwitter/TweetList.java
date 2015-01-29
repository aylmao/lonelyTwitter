package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

import android.R.bool;

public class TweetList {
	
	private ArrayList<LonelyTweetModel> tweetList;
	int count = 0;
	
	public TweetList() {
		tweetList = new ArrayList<LonelyTweetModel>();
	}

	public ArrayList<LonelyTweetModel> getTweets() {
		return tweetList;
	}

	public int getCount() {
		return count;
	}

	public void addTweet(LonelyTweetModel tweet) throws IllegalArgumentException {
		for (LonelyTweetModel item : tweetList) {
			if (item.equals(tweet)) {
				throw new IllegalArgumentException("in list");
			}
		}
		tweetList.add(tweet);
		count++;
	}
	
	public boolean hasTweet(LonelyTweetModel tweet) {
		for (LonelyTweetModel item : tweetList) {
			if (item.equals(tweet)) {
				return true;
			}
		}
		return false;
	}

	public void removeTweet(NormalTweetModel tweet) {
		tweetList.remove(tweet);
		
	}

}
