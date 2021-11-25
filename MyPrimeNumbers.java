package com.technoelevate.jav;

import java.util.Scanner;

public class MyPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
for(int i=0;i<=a;i++) {
	if(a%i==0) {
		count++;
	}
}
if(count==2) {
	System.out.println("given number is a prime number"+a);
}else {
	System.out.println("given number is not a prime number"+a);
}
	}

}
