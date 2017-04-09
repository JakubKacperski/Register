package com.register.file;

import java.io.File;

import com.register.main.Print;
import com.register.main.ReadConsole;

public class RenameFile {

	//Creating subfolders for registers years.
	public static void renameYear()  {



		boolean addNext = true;


		while (addNext){
			boolean isAnswered = false;

			//Show years.
			Show.showYears();

			Print.print("Enter name of Year to rename. (Directory must be empty.)");
			String newYearDir = ReadConsole.nextString();

			Print.print("Enter new name");
			String newYearName = ReadConsole.nextString();
			File newYearDirFile = new File("Registers/" + newYearDir);

			try {
				if (newYearDirFile.exists() ) {
					newYearDirFile.renameTo(new File("Registers/" + newYearName));

				} else {
					Print.print("Failed to rename Year.");
				}
			}

			catch (Exception e) {
				Print.print("Error.");
			}
			while(!isAnswered){
				Print.print("Rename another? (Y/N)");
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






	public static void renameRegister() {

		

		boolean addNext = true;


		while (addNext){
			boolean isAnswered = false;

			Show.showYears();

			Print.print("Enter Year of Register");
			String newYear = ReadConsole.nextString();





			Show.showRegisters(newYear);
			Print.print("Enter name of Register to rename. (without .txt)");
			String newRegister = ReadConsole.nextString();
			
			Print.print("Enter new name for Register.");
			String newRegisterName = ReadConsole.nextString();

			File newRegisterFile = new File("Registers/"+ newYear + "/" + newRegister +".txt");


			try{
				if (newRegisterFile.exists() ) {
					newRegisterFile.renameTo(new File("Registers/" + newYear + "/" + newRegisterName + ".txt"));
					
				} else {
					Print.print("Failed to rename register.");
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
