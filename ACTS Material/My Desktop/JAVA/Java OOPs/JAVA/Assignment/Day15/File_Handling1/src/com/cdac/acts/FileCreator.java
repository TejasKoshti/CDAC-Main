package com.cdac.acts;
import java.io.File;
import java.io.IOException;

public class FileCreator {

	public static void main(String[] args) {
		
		File file = new File("c:/Downloads/destinationfile.txt");
		
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					System.out.println("New File Creatd = " + file.getName());
					System.out.println("New File Location Is = " + file.getAbsolutePath());
				}else {
					System.out.println("File Already Exsist");
				}
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("File Already Pesent");
		}
	}
}
