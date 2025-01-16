package com.cdac.acts.tejas.util;
import com.cdac.acts.tejas.Printer;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.HashMap;

public interface IOUtils {

	public static void storePrinter(List<Printer> printerList, String fName) throws IOException{
		
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(fName))) {
			for(Printer printer : printerList) {
				oos.writeObject(printer);
			}
		}
	}
	
	public static HashMap<Integer,Printer> readPrinter(String fName) throws IOException, ClassNotFoundException{
		
		HashMap<Integer, Printer> map = new HashMap<>();
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(fName))) {
			Printer printer;
			
			while((printer = (Printer)ois.readObject()) != null) {
				map.put(printer.getSerialNo(),printer);
			}
		} catch (EOFException eof) {
			System.out.println("Stop Reading");
		}
		
		return map;
		
	}
}
