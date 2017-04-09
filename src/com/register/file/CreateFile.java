package com.register.file;

import java.io.File;



import com.register.main.Print;
import com.register.main.ReadConsole;


public class CreateFile {


	//Creating default folder for registers.
	public static void createDefaultDir() {
		File newDefDir = new File("Registers");
		if (!newDefDir.exists() ) newDefDir.mkdir();
		if (newDefDir.exists()) Print.print("Created registers directory");
	}


	//Creating subfolders for registers years.
	public static void createYear()  {
		boolean success;
		boolean addNext = true;

		while (addNext){
			boolean isAnswered = false;

			//Show years.
			Show.showYears();

			Print.print("Enter name of new Year");
			String newYearDir = ReadConsole.nextString();
			File newYearDirFile = new File("Registers/" + newYearDir);

			try {
				if (newYearDirFile.exists() ) {
					System.out.println(newYearDir + " already exist.");
				} else {
					success = newYearDirFile.mkdir();
					if (success) {
						System.out.println("Created " + newYearDir);
					} else {
						System.out.println("Failed to create " + newYearDir);
					}
				}
			} catch (Exception e) {
				Print.print("Error.");
			}
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
	}


	public static void createRegister() {

		boolean success;

		boolean addNext = true;


		while (addNext){
			boolean isAnswered = false;

			Show.showYears();

			Print.print("Enter Year of new Register");
			String newYear = ReadConsole.nextString();

			Print.print("Enter name of new Register (without .txt)");
			String newRegister = ReadConsole.nextString();

			File newRegisterFile = new File("Registers/"+ newYear + "/" + newRegister +".txt");


			try{
				if (newRegisterFile.exists() ) {
					System.out.println(newRegister + " already exist.");

				} else {
					success = newRegisterFile.createNewFile();
					if (success) {
						System.out.println("Created " + newRegister);
					} else {
						System.out.println("Failed to create " + newRegister);
					}
				}

			} catch(Exception e) {
				Print.print("Error.");
			}
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



	}


}














