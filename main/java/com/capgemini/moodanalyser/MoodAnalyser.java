package com.capgemini.moodanalyser;

import java.util.Scanner;

import com.capgemini.moodanalyser.MoodAnalysisException.MoodAnalysisError;

public class MoodAnalyser {
	private String message;
	
		public MoodAnalyser() {}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood(String message) throws MoodAnalysisException {
		this.message = message;
		return analyseMood();
		
	}
	
	public String analyseMood() throws MoodAnalysisException {
		if(message.equals(null)) {
			throw new MoodAnalysisException("Message Enter is Null", MoodAnalysisError.NULL);
		}
		if(message.equals("")) {
			throw new MoodAnalysisException("Message Entered is Empty", MoodAnalysisError.EMPTY);
		}		
		if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";	
			
	}

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Message :");
			String message = sc.nextLine();
			try {
				MoodAnalyser moodAnalyser = new MoodAnalyser(message);
				String mood = moodAnalyser.analyseMood();
				System.out.println(mood);
			} catch (MoodAnalysisException e) {
				System.out.println(e.getMessage());
			}
		}
	}


