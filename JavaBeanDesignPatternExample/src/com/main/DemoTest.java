package com.main;

//import java.util.Scanner;
//import java.util.*; // imports many classed and causes performance issues
import com.bean.Product;

public class DemoTest {

	public static void main(String[] args) {
		Product p = new Product();
		p.setPid(100);
		p.setPname("TV");
		p.setPrice(450000);
		
		System.out.println("PId is "+p.getPid());
		System.out.println("PName is "+p.getPname());
		System.out.println("Price is "+p.getPrice());
	

	}

}
