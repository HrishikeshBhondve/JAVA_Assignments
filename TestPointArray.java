package day3;
package com.geometry.tester;
import java.util.*;
import com.geometry.core.*;

public class TestPointArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of points: ");
		Point2D[] points=new Point2D [input.nextInt()];
		for(int i=0; i<points.length;i++) {
			System.out.println("Enter x and y co-ordinate of point: ");
			points[i]=new Point2D(input.nextInt(), input.nextInt());
		}
		
		for(Point2D p : points) {
			System.out.println(p.getDetails());
		}
		
			int i, j;
			boolean check=false;
			
			while(check!=true) {
				System.out.println("----------Select your choice-----------");
				System.out.println("1: Plot a new point");
				System.out.println("2: Dislay all plotted points");
				System.out.println("3: Test equality of two points");
				System.out.println("4: Distance between two points");
				System.out.println("10: Exit");
				int choice = input.nextInt();
				
				switch(choice) {
				
				case 1:
					System.out.println("Enter index in the range 0 to "+(points.length-1));
					i=input.nextInt();
					if(i<points.length && i>=0) {
						System.out.println("Enter co-ordinates:");
						points[i]=new Point2D(input.nextInt(), input.nextInt());
					}
					else {
						System.out.println("You didn't entered index in the range.");
					}
					break;
					
				case 2:
					for(Point2D p : points) {
						if(p!= null) {
							System.out.println(p.getDetails());
						}	
					else {
							System.out.println("Array is empty");
						}	
					}
					break;
					
				case 3:
					System.out.println("Enter two indices in the range 0 to "+(points.length-1)+" for equality");
					i =input.nextInt();
					j =input.nextInt();
					if(i<points.length && i>=0 && j<points.length && j>=0) {
						System.out.println(points[i].equalsTo(points[j])?"SAME":"DIFFERENT");
					}
					else {
						System.out.println("You didn't entered indices in the range.");
					}
					break;
					
				case 4:
					System.out.println("Enter two indices in the range 0 to "+(points.length-1)+" for distance");
					i =input.nextInt();
					j =input.nextInt();
					if(i<points.length && i>=0 && j<points.length && j>=0) {
						System.out.println(points[i].calculateDistance(points[j]));
					}
					else {
						System.out.println("You didn't entered indices in the range.");
					}
					break;
					
				case 10:
					check=true;
					break;
				}
			}
		
		input.close();

	}

}
