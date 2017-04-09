package com.register.file;

import java.io.*;

import java.util.*;

import com.register.main.Print;
import com.register.main.ReadConsole;

public class WriteToFile {
	
	static private Formatter newRecordFormatter;

	boolean addNext = true;
	
	private static void openFile(){
		
		
		
		Show.showYears();
		Print.print("Enter year");
		String yearDir = ReadConsole.nextString();
		Show.showRegisters(yearDir);
		Print.print("Enter name of register.");
		String registerName = ReadConsole.nextString();
				
		try{
			FileWriter newRecordWriter = new FileWriter("Registers/" + yearDir + "/" + registerName + ".txt", true);
			newRecordFormatter = new Formatter(newRecordWriter);
		}
		
		catch(Exception e) {
			Print.print("Error.");
		}
	}
	public static void setRecords(){
		
		
		
		boolean addNext = true;
		openFile();

		while (addNext){
			
			boolean isAnswered = false;
			Print.print("Enter id");
			String setId = ReadConsole.nextString();
			Print.print("Enter name");
			String setName = ReadConsole.nextString();
			Print.print("Enter surename");
			String setSurename = ReadConsole.nextString();
			Print.print("Enter grade");
			String setGrade = ReadConsole.nextString();
			addRecords(setId, setName, setSurename, setGrade);
			
			
			while(!isAnswered){
				Print.print("Add another? (Y/N)");
				String answer = ReadConsole.nextString();
				switch (answer) {
					case "N":
					case "n":
					case "NO":
					case "no":
					case "No":
						addNext = false;
						isAnswered = true;
						break;
					case "Y":
					case "y":
					case "YES":
					case "yes":
					case "Yes":
						isAnswered = true;
						break;
					default:
						Print.print("Try again.");
						break;
				}
			}
		}
		closeFile();
		
		
	}
	private static void addRecords(String id, String name, String surename, String grade) {
		newRecordFormatter.format("%s %s %s %s \r\n", id, name, surename, grade);
	}
	private static void closeFile() {
		newRecordFormatter.close();
	}

}
