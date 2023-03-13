package com.problem2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

//Create a Thread named "First thread" using Runnable interface in program that performs
//following operations-
//Write following first name, mark and attendance percentage for 5 students in a file named 
//student.txt.
//Anuj 56.25 77.58
//Bharat 66.25 57.58
//Chaman 70.25 66.74
//Dhanush 58.25 95.74
//Garv 58.62 95.74
//
//Create another thread named "Second thread" using Callable interface that performs 
//following operations-
//Read file student.txt and find name of student who has maximum percentage
//
//Create another thread named "Third thread" using Callable interface that performs following
//operations-
//Read file student.txt and find average attendance percentage of all scholars
//
//Tip:
//
//1. use PrintWriter to write content in file. Every stuent record (name marks and attendance) 
//should be as a single string value in a line.
//2. use lambda expression to write implemetation of run method and call method.
//3. The "First thread" must finish first before starting "Second thread" & "Third thread".
public class Main {

	public static void main(String[] args) {
		File file = new File("student.txt");

		Runnable firstThread = () -> {

			try {
				PrintWriter write = new PrintWriter(file);
				write.println("Anuj 56.25 77.58");
				write.println("Bharat 66.25 57.58");
				write.println("Chaman 70.25 66.74");
				write.println("Dhanush 58.25 95.74");
				write.println("Garv 58.62 95.74");
				write.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		};
		Thread thread1 = new Thread(firstThread);
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Callable<String> secondThread = () -> {
			String maxStu = "";
			double maxPer = 0;
			try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
				String str;
				while ((str = reader.readLine()) != null) {
					String[] Sarr = str.split(" ");
					double per = (Double.parseDouble(Sarr[1]) + Double.parseDouble(Sarr[2])
							+ Double.parseDouble(Sarr[3]) / 3);
					if (per > maxPer) {
						maxPer = per;
						maxStu = Sarr[0];
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "Student max Percent is" + maxStu + " with " + maxPer;
		};

	}

}
