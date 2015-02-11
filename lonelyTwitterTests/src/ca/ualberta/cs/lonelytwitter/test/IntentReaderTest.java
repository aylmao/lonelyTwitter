package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.R.string;
import android.content.Intent;
import android.os.Bundle;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;

public class IntentReaderTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderTest() {
		super(IntentReaderActivity.class);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testDisplayest() {
		IntentReaderActivity activity = startWithText("Hello", IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("check" , "Hello" , view.getText() );
		
	}
	
	public void testOnScreen() {
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.NORMAL);
		setActivityIntent(intent);
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		TextView view = (TextView) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.intentText);
		ViewAsserts.assertOnScreen(activity.getWindow().getDecorView() , view);
	}
	
	public void testDefaultText() {
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.NORMAL);
		setActivityIntent(intent);
		IntentReaderActivity activity = (IntentReaderActivity) getActivity();
		assertEquals("true" , "default" , activity.TEXT_KEY.toString() );
		intent = new Intent();
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.REVERSE);
		setActivityIntent(intent);
		assertEquals("true" , "default" , activity.TEXT_KEY.toString() );
		intent = new Intent();
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, IntentReaderActivity.DOUBLE);
		setActivityIntent(intent);
		assertEquals("true" , "default" , activity.TEXT_KEY.toString() );
	}
	
	public void testDoubleText() {
		String text = "Hi";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.DOUBLE);
		assertEquals("check", text+text, activity.getText());
	}
	
	public void testSendText() {
		String text ="Hello";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		assertEquals("checking", text, activity.getText() );
	}
	
	public void testRev() {
		String text ="oHel";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.REVERSE);
		assertEquals("checking", "leHo", activity.getText() );
	}
	
	private IntentReaderActivity startWithText(String text , int transform_code) {
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, transform_code);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();		
	}
	

}
