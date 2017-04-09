package com.register.main;

import com.register.file.CreateFile;

class Main {

	public static void main(String[] args) {
		
		CreateFile.createDefaultDir();
		Menu.menu();
		//Delete.deleteDirectory("/Registers/2025");
		//RenameFile.renameRegister();
}
}