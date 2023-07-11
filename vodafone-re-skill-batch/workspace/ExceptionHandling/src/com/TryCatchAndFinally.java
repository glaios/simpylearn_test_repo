package com;

public class TryCatchAndFinally {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a = 10;
		int b = 1;
		try {
			int res = a/b;
			System.out.println("The Result is " +res);
			System.out.println("No Exception!!");
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("Finally block");
		}
		System.out.println("Finish");
	}

}
