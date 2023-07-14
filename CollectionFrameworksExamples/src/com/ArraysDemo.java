package com;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
//			int num[]= {3,1,6,9,2,5,7};	
//		
//			String names[] = {"Alexander","Giannis","Zacharoula","Anna"};
//			System.out.println("Display Element before sort");
//			System.out.println();
//			for(int n:num) {
//				System.out.print(n+" ");
//			}
//			System.out.println();
//			System.out.println();
//			for (String x:names) {
//				System.out.print(x+" ");
//			}
//			Arrays.sort(names); 
//			System.out.println();
//			System.out.println();
//			System.out.println("Display Element after sort");
//			System.out.println();
//			for(int n:num) {
//				System.out.print(n+" ");
//			}
//			System.out.println();
//			System.out.println();
//			for (String x:names) {
//				System.out.print(x+" ");
//			}
			
			
			int num[]= {3,1,6,8,4,3,2};
			Arrays.sort(num);
//			 1,2,3,3,4,6,8
			System.out.println(Arrays.binarySearch(num, 1));
			System.out.println(Arrays.binarySearch(num, 4));
			System.out.println(Arrays.binarySearch(num, 6));
			System.out.println(Arrays.binarySearch(num, 10));
			System.out.println(Arrays.binarySearch(num, 9));
			if(Arrays.binarySearch(num, 8)<0) {
				System.out.println("Element not present");
			}else {
				System.out.println("Element present");
			}
			
			String names[]= {"Vijay","Ajay","Ramesh","Leela","Neena"};
			Arrays.sort(names);
			if(Arrays.binarySearch(names, "Leela")<0) {
				System.out.println("Not present");
			}else {
				System.out.println("present");
			}
			String name1="Akash";
			String name2 ="Akkash";
			System.out.println(name1.compareTo(name2));
			System.out.println(name1.codePointAt(2));
			System.out.println(name2.codePointAt(2));
	}

}
