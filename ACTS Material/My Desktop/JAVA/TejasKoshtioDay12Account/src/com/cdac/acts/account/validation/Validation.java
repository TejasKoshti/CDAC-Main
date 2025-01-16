package com.cdac.acts.account.validation;

import java.time.LocalDate;

import com.cdac.acts.account.exception.MiniBalException;

public class Validation {

	
	public static Double miniBal(Double amount) {
		try {
		if(amount < 1000) {
			throw new MiniBalException("Acooun smbdf MNZnshdgasdgksd sfkasdkjlasdf j sdfasdf  kj khjdfl sadf asd lkjhj kljhf sdfa sdf  jh lkjhasdfj sladfh asdf asdlfjh jklhlaskdfj askldjfh alsdkfj hasdklfjhasdlkfjhasdlkfjh asdf asdf kljdsha sdfklajsdfhalksdjfhasldkjfh alsdkjf hasldkfh asldkjfhaslkdfjhaskdljf alskdjfh alskdjfh askldjf aslkfasfl askfaskdfhaskfjasdfkk");
			
		}
		}catch(MiniBalException e) {
			System.err.println(e.getMessage());
			return null;
		}
		
		return amount;
	}
	
	
	
	
	

	public static LocalDate getValidOpening(String str) {
		
		LocalDate opening = LocalDate.parse(str);
		
		LocalDate today = LocalDate.now();
		LocalDate reqDate = today.minusDays(1);
		
		if(opening.isBefore(reqDate)) {
			return opening;
		}
		return null;
	}
	
	
}
