package com.learn;


public class stringBuilder {
    
	public static void main(String[] args) {
		
		
		//string builder
		StringBuilder stringBuilder = new StringBuilder("Hello");
		System.out.println("---------------String builder---------------");
		System.out.println("Initial string :"+stringBuilder);
        stringBuilder.append(" World");
        System.out.println("After append: " + stringBuilder);

        stringBuilder.insert(5, " Java");
        System.out.println("After insert: " + stringBuilder);

        stringBuilder.delete(5, 10);
        System.out.println("After delete: " + stringBuilder);

        stringBuilder.reverse();
        System.out.println("After reverse: " + stringBuilder);
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, 'Y');
        System.out.println("After setCharAt: " + stringBuilder);

        int length = stringBuilder.length();
        System.out.println("Length of StringBuilder: " + length);

           
	}
}
