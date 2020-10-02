package com.capgemini.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyser {
	@Test
	public void testMoodAnalysis_GivenSadMood_ReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		Assert.assertEquals("SAD", mood);
	}
	
	@Test
	public void testMoodAnalysis_GivenAnyMood_ReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Any Mood");
		Assert.assertEquals("HAPPY", mood);
	}
}
