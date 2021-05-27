package com.noRedInk.takeHome;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;



public class StudentQuizMaker {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get the input for number of questions.
		int numOfQuestions = GetInput();
		
		//Read the CSV file
		PullCSV(numOfQuestions);
	}
	
	public static int GetInput()
	{
		System.out.println("Please input the number of questions for the quiz: ");
		
		Scanner s = new Scanner(System.in);
		
		int numOfQuestions = s.nextInt();
		
		while (numOfQuestions <= 0)
		{
			System.out.println("Input is incorrect. Please enter the correct value.");
			numOfQuestions = s.nextInt();
		}
		
		s.close();
		return numOfQuestions;
	}
	
	public static void PullCSV(int numOfQuestions)
	{
		//Read Question CSV File		
				try {
					
					InputStream readQuestions = new FileInputStream(System.getProperty("user.dir") + "//csvFiles//questions.csv");
					InputStreamReader ipQuestions = new InputStreamReader(readQuestions);
					BufferedReader brQuestions = new BufferedReader(ipQuestions);
					
					String line;
					
					while ((line = brQuestions.readLine()) != null)
					{
						System.out.println(line);
					}
					
					brQuestions.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
	}
}
