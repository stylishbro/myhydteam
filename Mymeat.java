package com.technoelevate.mycase;

import java.util.ArrayList;
import java.util.Scanner;

public class Mymeat
{
	int beefQty;
	int chickenQty;
	int muttonQty;
	int fishQty;
static ArrayList al=new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your cooldrinks");
		String str=sc.next();
		String str1=sc.next();
		String str2=sc.next();
		Grocery g1=new Grocery(str,null,null);//briyani
		Grocery g2=new Grocery(str1,null,null);//chicken
		Grocery g3=new Grocery(str2,null,null);//mutton
		//adding to the arraylist
        al.add(g1);
        al.add(g2);
        al.add(g3);
		System.out.println("if user press anykey or if admin press 1");
		int a=sc.nextInt();
		//entering if he is admin
		/*if(a==1) {
			System.out.println("enter your pincode");
			int pin=sc.nextInt();
			if(Adminpin==pin) {
                 System.out.println("enter something new item admin just give Y or N");
                 String ab=sc.next();
                 switch(ab) 
                 {
                 case "y":{
                	        String s=sc.next();
 				             al.add(s);
 				             System.out.println("add to the cart"+s);
                           }
                 default:{
                	          for(Object ob:al) {
                	        	  Grocery g=(Grocery)ob;
                	        	  System.out.println("items that are present"+g.getMeat());
                	          }
                 }
			}
	
		         
		}
	}
		else {
			for(Object ob:al) {
	        	  Grocery g=(Grocery)ob;
	        	  System.out.println("items that are present"+g.getMeat());
		}

	}*/
		System.out.println("wanted to display Enter 1");
		int sd=sc.nextInt();
		if(sd==1) {
		for(Object ob:al) {
      	  Grocery g=(Grocery)ob;
      	  System.out.println("items that are present"+g.getMeat());
		}}
		System.out.println("wanted to remove enter 2");
		int sr=sc.nextInt();
			if(sr==2) {
				int rem=sc.nextInt();
				al.remove(rem);
			}
			System.out.println("wanted to replace enter 3");
			int rep=sc.nextInt();
				if(rep==3) {
					int rem=sc.nextInt();
					String sw=sc.next();
					al.set(rem, sw);
					for(Object ob:al) {
				      	  Grocery g=(Grocery)ob;
				      	  System.out.println("items that are present"+g.getCoolDrink());
					}
	
		
	}
				}}
