package com.cdac.acts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\dac.STUDENTSDC\\Desktop\\Raj & Tej\\Assignment\\Day15\\File_Handling1\\NewFile.txt";
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				
//			line = bufferedReader.readLine();
//			System.out.println(line);		
			}
		}catch(IOException e) {
			System.err.println("Error Reading File.."+ e.getMessage());
		}
	}

}
