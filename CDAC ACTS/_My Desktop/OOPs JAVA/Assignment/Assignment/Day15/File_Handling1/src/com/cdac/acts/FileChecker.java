package com.cdac.acts;

import java.io.File;
import java.util.Arrays;

public class FileChecker {

	public static void main(String[] args) {
		
		File file = new File("OkBaby.txt");
		
		if (!file.exists()) {
			System.out.println("This path Does not Exasist");
			return;
		}
		
		if (file.isDirectory()) {
			System.out.println("File Obj is ijn Dic");
			String[] names = file.list();
			System.out.println("All Files and Dic" + Arrays.toString(names) + "\n");
			
			String[] exeFiles = file.list((dir, name) -> name.endsWith(".exe"));
			System.out.println("Executabel Files:"+ Arrays.toString(exeFiles)+"\n");
			
		}else if(file.isFile()) {
			System.out.println("File Obj is a file ");
		}

	}

}
