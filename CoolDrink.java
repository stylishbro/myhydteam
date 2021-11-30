package com.technoelevate.mycase;

import java.util.ArrayList;
import java.util.Scanner;

public class CoolDrink {
	static int Adminpin=1234;
	int riceQty;
	int dalQty;
	static ArrayList al2=new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your cooldrinks");
		String str=sc.next();
		String str1=sc.next();
		String str2=sc.next();
		Grocery g1=new Grocery(null,null,str);//mazza
		Grocery g2=new Grocery(null,null,str1);//thumbsap
		Grocery g3=new Grocery(null,null,str2);//coca
		//adding to the arraylist
        al2.add(g1);
        al2.add(g2);
        al2.add(g3);
		System.out.println("wanted to display enter 1");
		int n=sc.nextInt();
		if(n==1) {
		for(Object ob:al2) {
      	  Grocery g=(Grocery)ob;
      	  System.out.println("items that are present"+g.getCoolDrink());
		}}
		System.out.println("wanted to remove enter 2");
		int v=sc.nextInt();
			if(v==2) {
				int rem=sc.nextInt();
				al2.remove(rem);
			}
			System.out.println("wanted to replace enter 3");
			int rep=sc.nextInt();
				if(rep==3) {
					int rem=sc.nextInt();
					String sw=sc.next();
					al2.set(rem, sw);
					for(Object ob:al2) {
				      	  Grocery g=(Grocery)ob;
				      	  System.out.println("items that are present"+g.getCoolDrink());
					}
					
				}
		
	

	}

}
