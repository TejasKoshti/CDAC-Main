package com.cdac.acts;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileBufferedWriter  {

	public static void main(String[] args) {
	
		String path = "C:\\Users\\dac.STUDENTSDC\\Desktop\\Raj & Tej\\Assignment\\Day15\\File_Handling1\\NewFile.txt";
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
			writer.write("HELLO, This Tejas Koshti here..!");
			writer.newLine(); // Add a new Line
			writer.write("This Is My File Handling Code.");
		}catch(IOException e){
			System.err.println(e.getMessage());
		}
	}
}
