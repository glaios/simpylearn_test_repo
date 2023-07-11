package com;

public class CheckedException {

	public static void main(String[] args) throws Exception{
		System.out.println("Time starts now");
		try {
		Thread.sleep(60000);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("End of time");
		}

	

}
