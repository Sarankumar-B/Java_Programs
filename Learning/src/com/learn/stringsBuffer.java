package com.learn;

public class stringsBuffer {
    public static void main(String[] args) {
    
    	
    	//String literals
		String str=new String("JavaProgram");
		System.out.println("------------------------String class----------------------------");
		int len=str.length();
		System.out.println("Length of String: " + len);
		System.out.println("Index of method: "+str.indexOf("P"));
		System.out.println("charAt method: "+str.charAt(3));
		System.out.println("Replace method: "+str.replace("Program", "Pgms"));
		System.out.println("Lower case "+str.toLowerCase());
		System.out.println("Upper case "+str.toUpperCase());
		System.out.println("Trim method: "+str.trim());
		System.out.println("Concat: "+str.concat("1"));
		
		
		System.out.println("------------------------String Buffer----------------------------");
        StringBuffer stringBuffer = new StringBuffer("Hello");

        stringBuffer.append("World");
        System.out.println("After append: " + stringBuffer);
        
        stringBuffer.insert(5, " Java");
        System.out.println("After insert: " + stringBuffer);

        stringBuffer.delete(5, 10);
        System.out.println("After delete: " + stringBuffer);

        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);
        stringBuffer.reverse();
        stringBuffer.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + stringBuffer);

        stringBuffer.replace(0, 5,"Welcome");
        System.out.println("After Replace: "+stringBuffer);
        
        int length = stringBuffer.length();
        System.out.println("Length of StringBuffer: " + length);
        
        System.out.println(stringBuffer.substring(3));

        System.out.println(stringBuffer.indexOf("e"));
        
	
    }
}
