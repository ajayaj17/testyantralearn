package com.encapsulation;

public class Encapsulation1 {
	private String humanName;
	private int humanAge;
	private int humanHeight;
	private double humanWeight;
	

	public Encapsulation1() {
		super();
	}

	public Encapsulation1(String humanName, int humanAge, int humanHeight, double humanWeight) {
		super();
		this.humanName = humanName;
		this.humanAge = humanAge;
		this.humanHeight = humanHeight;
		this.humanWeight = humanWeight;
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public int getHumanAge() {
		return humanAge;
	}

	public void setHumanAge(int humanAge) {
		if (humanAge < 0) {
			System.out.println("Invalid Age");
		} else {
			this.humanAge = humanAge;
		}
	}

	public int getHumanHeight() {

		return humanHeight;
	}

	public void setHumanHeight(int humanHeight) {
		if (humanHeight < 60) {
			System.out.println("Invalid Height");
		} else
			this.humanHeight = humanHeight;
	}

	public double getHumanWeight() {
		return humanWeight;
	}

	public void setHumanWeight(double humanWeight) {
		if (humanWeight < 5) {
			System.out.println("Invalid Weight");
		} else
			this.humanWeight = humanWeight;

	}

}
