package com.epam.cleancode;

public class CompoundInterest {
       public void CI(int p,int t,double r) {
    	   double ans=p*(Math.pow((1+r/100),t));
    	   System.out.println("CompoundInterest is :"+ans);
       }
}
