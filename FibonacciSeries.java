package com.technoelevate.fristproject;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=0;
int num2=1;
int sum;
for(int i=2;i<=10;i++)
{
	sum=num+num2;
	System.out.println(sum);
	num=num2;
	num2=sum;
	
}
	}

}
