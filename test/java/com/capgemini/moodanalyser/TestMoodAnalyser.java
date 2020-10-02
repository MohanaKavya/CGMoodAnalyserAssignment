package com.capgemini.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyser {
	@Test
	public void testMoodAnalysis_GivenSadMood_ReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);

	}
}
