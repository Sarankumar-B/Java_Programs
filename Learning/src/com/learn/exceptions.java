package com.learn;

public class exceptions {
	public static void main(String[] args) {
		try {
			int num1=0;
			int num2 =5;
			int num3=num2/num1;
			System.out.println(num3);
		
		}
		catch (NullPointerException r) {
			System.out.println("num doesn't divided by 0");
		}
		catch (Exception e) {
		e.printStackTrace();
		System.out.println("Thank you");
		}
	}

}
