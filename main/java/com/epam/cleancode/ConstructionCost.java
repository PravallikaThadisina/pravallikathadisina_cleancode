package com.epam.cleancode;

public class ConstructionCost {
	public void Standard(int a) {
		int ans=1200*a;
		System.out.println(ans);
	}
	public void aboveStandard(int a) {
		int ans=1500*a;
		System.out.println(ans);
	}
	public void highStandard(int a) {
		int ans=1800*a;
		System.out.println(ans);
	}
	public void fullyAutomated(int a) {
	    int ans=2500*a;
		System.out.println(ans);
	}

}
