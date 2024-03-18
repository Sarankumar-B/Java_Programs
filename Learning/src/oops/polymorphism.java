package oops;

class calculation extends triangle{
	//overriding
	public double area_circle(int r) {
		return (3.16*r*2);
		
	} 
}

public class polymorphism {
	
	//overloading
	public int addtion(int a,int b)
	{
		return a+b;
	}

	public int addition(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		polymorphism obj=new polymorphism();
		System.out.println(obj.addition(1, 53, 81));
		System.out.println(obj.addtion(23, 5));
	}

}
