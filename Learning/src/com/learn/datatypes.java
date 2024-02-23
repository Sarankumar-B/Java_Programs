package com.learn;

public class datatypes {
	static byte bytedef;
	static short shortdef;
	static int intdef;
	static long longdef;
	static float floatdef;
	static double doubledef;
	static char chardef;
	static boolean booldef;
	
	
    public static void main(String[] args) {
        // Primitive data types
        byte byteVar = 127;             
        short shortVar = 32767;       
        int intVar = 2147483647;      
        long longVar = 9223372036854775807L;
        float floatVar = 3.14f;       
        double doubleVar = 3.14159;    
        char charVar = 'A';            
        boolean booleanVar = true;      

     
        // Output
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);

       //Default values 
        System.out.println("Default Value of Byte: "+bytedef);
        System.out.println("Default Value of short: "+shortdef);
        System.out.println("Default Value of int: "+intdef);
        System.out.println("Default Value of Long: "+longdef);
        System.out.println("Default Value of Double: "+doubledef);
        System.out.println("Default Value of Char: "+chardef);
        System.out.println("Default Value of Boolean: "+booldef);

    }
}
