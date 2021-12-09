package com.technoelevate.fristproject;

public class RemoveOfJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st="@#$%^sam&^$;";
st=st.replaceAll("[^a-zA-Z0-9]","");
System.out.println(st);
	}

}
