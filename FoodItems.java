package com.technoelevate.mycase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FoodItems {

	static final int Adminpin=1234;
	int riceQty;
	int dalQty;
	static ArrayList al1=new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your fooditems");
		String str=sc.next();
		String str1=sc.next();
		String str2=sc.next();
		Grocery g1=new Grocery(null,str,null);//dal
		Grocery g2=new Grocery(null,str1,null);//rice
		Grocery g3=new Grocery(null,str2,null);//sprouts
		//adding to the arraylist
        al1.add(g1);
        al1.add(g2);
        al1.add(g3);
		System.out.println("wanted to display enter 1");
			int n=sc.nextInt();
			if(n==1) {
			for(Object ob:al1) {
	      	  Grocery g=(Grocery)ob;
	      	  System.out.println("items that are present"+g.getCoolDrink());
			}}
	
		System.out.println("wanted to remove enter 2");
		int sr=sc.nextInt();
			if(sr==2) {
				int rem=sc.nextInt();
				al1.remove(rem);
			}
			System.out.println("wanted to replace enter 3");
			int rep=sc.nextInt();
				if(rep==3) {
					int rem=sc.nextInt();
					String sw=sc.next();
					al1.set(rem, sw);
					for(Object ob:al1) {
				      	  Grocery g=(Grocery)ob;
				      	  System.out.println("items that are present"+g.getCoolDrink());
					}
		
		}
	}}


