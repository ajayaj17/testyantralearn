package com.relationship;

public class LateInst_Human {
	private String humanName;
	private int humanAge;
	private int humanHeight;
	private double humanWeight;

	private LateInst_Address address;

	public LateInst_Human() {
		super();
	}

	public LateInst_Human(String humanName, int humanAge, int humanHeight, double humanWeight) {
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

	public LateInst_Address getAddress() {
		return address;
	}

	public void setAddress(LateInst_Address address) {
		this.address = address;
	}

	public LateInst_Address createAddressObj() {
		return new LateInst_Address();
	}
}
