package com.bridgelabz.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoodAnalyzerTest {
	private MoodAnalyzer moodObject;
	
	@Before
	public void initialize(){
		moodObject=new MoodAnalyzer();
	}
	
//	@Test
//	public void moodTest() {
//		assertEquals("Happy Mood",moodObject.analyzeMood("I am in Happy Mood"));
//		assertEquals("Sad Mood",moodObject.analyzeMood("I am in Sad Mood"));
//	}
	
	@Test 
	public void givenMood_WhenSad_ReturnSad() {
		assertEquals("SAD",moodObject.analyzeMood("I am in Sad Mood"));
	}
	
	@Test 
	public void givenMood_WhenAny_ReturnHappy() {
		assertEquals("HAPPY",moodObject.analyzeMood("I am in Any Mood"));
	}
}
