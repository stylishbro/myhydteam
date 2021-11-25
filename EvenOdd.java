package com.technoelevate.jav;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int a=sc.nextInt();
if(a%2==0) {
	System.out.println("even number"+a);
}else {
	System.out.println("odd number"+a);
}
	}

}
