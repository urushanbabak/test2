package ir.ac.kntu;

import java.util.Scanner;

public class StarTri {
	
	
	public static void main (String[] args) {
		
		Scanner heightscanner = new Scanner (System.in);
		int height = heightscanner.nextInt();
		draw (height);
		
	}
	
	
	public static void draw (int height) {
		
		for (int i = 0; i < height; i++) {
			
				System.out.println ("*");
				
		}
		
		
	}
	
	
}