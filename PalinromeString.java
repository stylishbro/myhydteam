package com.technoelevate.fristproject;

public class PalinromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="sas";
String rev="";


int len=str.length();
for(int i=len-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
}
if(str.equals(rev))
{
	System.out.println("pal");
}
else {
	System.out.println("not");
}
System.out.println(str+""+rev);
	}

}
