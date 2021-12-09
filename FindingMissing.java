package com.technoelevate.fristproject;

public class FindingMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {6,5,4,3,1};
int max=a[0];
int sum=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]>max)
	{
		max=a[i];
	}
}
System.out.println("max"+max);
for(int i=0;i<a.length;i++)
{
	sum=sum+a[i];
}
System.out.println(sum);
System.out.println("sum of all array"+sum);
int sum1=0;
for(int i=1;i<=max;i++)
{
	sum1=sum1+i;
}
System.out.println(sum1);
System.out.println("missed number is"+(sum1-sum));

	}

}
