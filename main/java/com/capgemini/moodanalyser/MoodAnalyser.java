package com.capgemini.moodanalyser;

import java.util.Scanner;

public class MoodAnalyser {
	
	public String analyseMood(String message) {
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
	}

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Message :");
			String message = sc.nextLine();

			MoodAnalyser moodAnalyser = new MoodAnalyser();
			String mood = moodAnalyser.analyseMood(message);
			System.out.println(mood);

		}

	}


