package com.technoelevate.fristproject;

public class EqualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
int b[]= {1,2,4,5,6}; 
if(a.length==b.length)
{
for(int i=0;i<a.length;i++)
{
	if(a[i]!=b[i])
	{
		System.out.println("break");
		break;
	}
}
	}}}


