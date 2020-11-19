package org.Company;

import java.util.ArrayList;

public class Choclates {
	public static void main(String[] args) {
		
	ArrayList<String> choco	 = new ArrayList<String> ();
	
	
	choco.add("cadbury");
	choco.add("kitkat");
	choco.add("Dairy milk");
	choco.add("5 star");
	choco.add("hersey");
	choco.add("milky bar");
	choco.add("Snicker");
	choco.set(0, "Ferro Rocher");
	choco.remove(0);
	
	
	System.out.println(choco.size());
	

	}
}
