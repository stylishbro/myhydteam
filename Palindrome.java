package com.technoelevate.jav;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=121;
int org=a;
int rev=0;
while(a!=0) {
	rev=rev*10+a%10;
	a=a/10;
}
if(org==rev) {
System.out.println("palindrome");
}else {
	System.out.println("not a palindrome");
}
	}

}
