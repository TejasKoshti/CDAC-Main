package com.cdac.acts;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrintWriter {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\dac.STUDENTSDC\\Desktop\\Raj & Tej\\Assignment\\Day15\\File_Handling1\\NewFile1.txt";
		
		try(PrintWriter printWriter = new PrintWriter(new FileWriter(path))){
			printWriter.println("Hello, My Name is Tejas Koshti");
			printWriter.println("This is My Code..!");
		}catch(IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}
	}
}
