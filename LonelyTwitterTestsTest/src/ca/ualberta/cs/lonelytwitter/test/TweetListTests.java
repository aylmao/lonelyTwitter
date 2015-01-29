package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetList;
import android.test.ActivityInstrumentationTestCase2;
import android.util.PrintStreamPrinter;

public class TweetListTests extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListTests() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testTweetList(){
		TweetList tweetlist = new TweetList();
		ArrayList<LonelyTweetModel> tweets = tweetlist.getTweets();
		assertNotNull("tweet list not initialised", tweetlist.getTweets());
	}
	
	public void testCounts(){
		TweetList tweetList = new TweetList();
		assertEquals("This should be zero", tweetList.getCount(), 0);
		NormalTweetModel tweet = new NormalTweetModel("hello");
		tweetList.addTweet(tweet);
		assertEquals("This should be one", tweetList.getCount(), 1);
	}
	
	public void testAdd() throws IllegalArgumentException{
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("hello 1");
		tweetList.addTweet(tweet);
		NormalTweetModel tweet1 = new NormalTweetModel("hello 2");
		tweetList.addTweet(tweet1);
	}
	
	public void testGetTweets() {
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet0 = new NormalTweetModel("hello 0");
		NormalTweetModel tweet1 = new NormalTweetModel("notsame 1");
		tweetList.addTweet(tweet0);
		tweetList.addTweet(tweet1);
		ArrayList<LonelyTweetModel> testlist = tweetList.getTweets();
		assertFalse(testlist.get(0).equals(tweet1));
		assertTrue(testlist.get(0).equals(tweet0));
		assertFalse(testlist.get(1).equals(tweet0));
		assertTrue(testlist.get(1).equals(tweet1));
	}
	
	public void testHas(){
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("hello 1");
		tweetList.addTweet(tweet);
		NormalTweetModel tweet1 = new NormalTweetModel("hello 2");
		tweetList.addTweet(tweet1);
		assertTrue(tweetList.hasTweet(tweet1));
		NormalTweetModel tweet2 = new NormalTweetModel("hello 3");
		assertFalse(tweetList.hasTweet(tweet2));
	}
	
	
	

}
