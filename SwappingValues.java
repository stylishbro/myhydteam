package com.technoelevate.jav;

public class SwappingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
a=a*b;
b=a/b;
a=a/b;
System.out.println("now b value is"+b);
System.out.println("now a value is"+a);
	}

}
