package com.learn;

public class Looping_Statements {

	void add(int ... a){
		        System.out.println("Var args method (int... a)"+a);
		    }

	public static void main(String[] args) {
	
		//while loop
		int i=0;
		System.out.println("While loop");
	      while (i<=10)
	      {
	        System.out.print(i);
	        i++;
	      }
	      System.out.println();
	      
	      //do-while
	      int j=0;
	      System.out.println("Do-While loop");
	      do
	      {
	        System.out.print(i);
	        j++;
	      }while(j<=10);
	      System.out.println();
	      
	      //For-loop
	      System.out.println("For-loop");

	      for (int k=0;k<=10;k++)
	       {
	         System.out.print(k);
	       }
	      Looping_Statements b=new Looping_Statements();
	      b.add(1,4,5,9);
	    		  
	      
	}

}
