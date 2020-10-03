package com.capgemini.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyser {
	
	@Test
	public void testMoodAnalysis_givenNullMoodShouldThrowException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("NULL");
		try {
			String mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.MoodAnalysisError.NULL, e.type);
		}
	}
	
	@Test
	public void testMoodAnalysis_givenEmptyMoodShouldThrowException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			String mood = moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.MoodAnalysisError.EMPTY, e.type);
		}
	}
}
