package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;


public class lonelTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public lonelTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		
	}
	
	public void testSample() {
		//fail("this is a failing test");
		//assertFalse("this is false", isGreaterThan(5,6));
		assertEquals("5 is equal to 5", 5,5);
	}
	
	public void testEquas(){
		Date date = new Date();
		NormalTweetModel tweet1 = new NormalTweetModel("Hello",date);
		NormalTweetModel tweet2 = new NormalTweetModel("Hello",date);
		assertTrue("Different tweets", tweet1.equals(tweet2));
	}
	
/*
	private boolean isGreaterThan(int i, int j) {
		if(i>j)
			return true;
		else
			return false;
	}
*/
	
	
}