package com.technoelevate.fristproject;

public class FactorialNumber {
	public static void main(String[] args) {
	int a=5;
	int org=a;
	int rev=1;
	for(int i=1;i<=a;i++)
	{
		rev=rev*org;
		org--;
	}
	System.out.println(rev);
}

}
