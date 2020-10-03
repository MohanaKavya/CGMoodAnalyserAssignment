package com.capgemini.moodanalyser;

import java.util.Scanner;

public class MoodAnalyser {
	private String message;
	
		public MoodAnalyser() {}
	
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood(String message) {
		this.message = message;
		return analyseMood();
		
	}
	
	public String analyseMood() {
		try {
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
			
		} catch (NullPointerException e) {
			return "HAPPY";
		}
			
	}

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Message :");
			String message = sc.nextLine();

			MoodAnalyser moodAnalyser = new MoodAnalyser(message);
			String mood = moodAnalyser.analyseMood();
			System.out.println(mood);

		}

	}


