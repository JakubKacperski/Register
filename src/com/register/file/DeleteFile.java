package com.register.file;

import java.io.File;

import com.register.main.Print;
import com.register.main.ReadConsole;

public class DeleteFile {
	
	
	public static void deleteYear()  {

		
		
		boolean addNext = true;


		while (addNext){
			boolean isAnswered = false;

			//Show years.
			Show.showYears();

			Print.print("Enter name of new Year (Year directory must be empty.)");
			String newYearDir = ReadConsole.nextString();
			File newYearDirFile = new File("Registers/" + newYearDir);

			try {
				if (newYearDirFile.exists() ) {
					newYearDirFile.delete();
					

				} else {
					
					Print.print("Directory does not exist");
				}

			} catch (Exception e) {
				Print.print("Error.");
			}
			if (!newYearDirFile.exists() ){
				Print.print(newYearDirFile + "deleted.");
			}else{
				Print.print(newYearDirFile + " " + "has registers in it.");
			}
			while(!isAnswered){
				Print.print("Delete another? (Y/N)");
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


	public static void deleteRegister()  {

		
		
		boolean addNext = true;


		while (addNext){
			boolean isAnswered = false;

			//Show years.
			Show.showYears();

			Print.print("Enter name of new Year");
			String yearToDelete = ReadConsole.nextString();
			
			Show.showRegisters(yearToDelete);
			
			Print.print("Enter name of new Register (without .txt)");
			String registerToDelete = ReadConsole.nextString();
			
			File newYearDirFile = new File("Registers/" + yearToDelete + "/" + registerToDelete + ".txt");

			try {
				if (newYearDirFile.exists() ) {
					newYearDirFile.delete();

				} else {
					
					Print.print("Register does not exist");
				}
				
				if (newYearDirFile.exists() ) {
					Print.print("Can't delete register.");
				}else{
					Print.print("Register has been deleted");
				}

			} catch (Exception e) {
				Print.print("Error.");
			}
			while(!isAnswered){
				Print.print("Delete another? (Y/N)");
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
