package com.relationship;

public class LateInst_1 {

	public static void main(String[] args) {
		LateInst_Human h= new LateInst_Human();
		h.setHumanName("ajay");
		h.setHumanAge(22);
		h.setHumanHeight(134);
		h.setHumanWeight(45);
		LateInst_Address add=h.createAddressObj();
		h.setAddress(add);
//		h.setAddress(h.createAddressObj());

	}

}
