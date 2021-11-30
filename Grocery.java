package com.technoelevate.mycase;

public class Grocery {

	private String meat;
	private String foodIteams;
	private String coolDrink;
	public Grocery(String meat, String foodIteams, String coolDrink) {
		super();
		this.meat = meat;
		this.foodIteams = foodIteams;
		this.coolDrink = coolDrink;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public String getFoodIteams() {
		return foodIteams;
	}
	public void setFoodIteams(String foodIteams) {
		this.foodIteams = foodIteams;
	}
	public String getCoolDrink() {
		return coolDrink;
	}
	public void setCoolDrink(String coolDrink) {
		this.coolDrink = coolDrink;
	}
	
	
	

}
