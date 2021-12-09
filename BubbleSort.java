package com.technoelevate.fristproject;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,2,3,1};
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		int sum=0;
	if(a[i]>a[j])
	{
		sum=a[j];
		a[j]=a[i];
		a[i]=sum;
	}
}
	}
System.out.println("iam there"+Arrays.toString(a));
}}
