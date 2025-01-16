package com.cdac.acts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopy {

	public static void main(String[] args) {
		
		String sourcePath = "C:\\Users\\dac.STUDENTSDC\\Desktop\\Raj & Tej\\Assignment\\Day15\\File_Handling1\\NewFile.txt";
		String destPath = "C:\\Users\\dac.STUDENTSDC\\Desktop\\Raj & Tej\\Assignment\\Day15\\File_Handling1\\NewFile1.txt";

		try(BufferedReader br = new BufferedReader(new FileReader(sourcePath));
			PrintWriter pw = new PrintWriter(new FileWriter(destPath))){
				
			String line;
				while((line = br.readLine()) != null){
					pw.println(line);
				}
				System.out.println("File Copied SuccessFully");

		}catch(IOException e) {
			System.err.println("File Error.." + e.getMessage());
		}
	}
}
