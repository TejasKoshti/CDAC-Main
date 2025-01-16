package com.cdac.acts.tester;

import java.util.HashMap;

public class demo2 {
	
	public static void main(String[] args) {
		
	
	HashMap<String, String> hashMap = new HashMap<>();
	
	 hashMap.put("DAC", "Diplomana")  ;
	 hashMap.put("BDDA", "Ghar ja re kale kava0");
	 
	 System.out.println(hashMap);
	
	 String str =hashMap.get("DESD");
	 System.out.println(str);
	 
	 if (hashMap.containsKey("DAC")) {
		hashMap.remove("DAC");
		System.out.println("Entery Emoboiods");
	}
	 
	 
	}
}
