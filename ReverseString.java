package com.technoelevate.fristproject;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="sameer";
String rev="";
int len=str.length();
for(int i=len-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
}
		
System.out.println(rev);
String str2="sanju";
StringBuffer sb2=new StringBuffer(str2);
sb2.reverse();
System.out.println(sb2);
	}
}
