package com.cdac.acts.tejas.util;
import static com.cdac.acts.tejas.PrinterType.LASER;
import java.util.Scanner;
import static com.cdac.acts.tejas.PrinterType.DOTMATRIX;
import static com.cdac.acts.tejas.PrinterType.INKJET;
import java.util.List;
import java.util.ArrayList;
import com.cdac.acts.tejas.Printer;
import static java.time.LocalDate.parse;

public interface DataUtils {

	public static List<Printer> getPrinterList(){
		List<Printer> printerList = new ArrayList<>();
		
		
		printerList.add(new Printer(3543, 6987, 255.0, parse("2010-04-24"),LASER ));
		printerList.add(new Printer(3544, 6687, 355.0, parse("2010-05-24"),DOTMATRIX ));
		printerList.add(new Printer(3545, 6487, 555.0, parse("2010-06-24"),INKJET));
		return printerList;
	}
}
