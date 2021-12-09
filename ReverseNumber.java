package com.technoelevate.fristproject;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**int a=1234;
int rev=0;
while(a!=0)
{
	rev=rev*10+a%10;
	a=a/10;
}
System.out.println(rev);*/
		int a=123;
		String b=String.valueOf(a);
		StringBuffer sb=new StringBuffer(b);
		sb.reverse();
		System.out.println(sb);
	}

}
