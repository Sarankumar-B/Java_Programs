package oops;

public class overriding extends triangle {
	//overriding
	public double area_circle(int r) {
		return (3.16*r*3);
		
	}
	public static void main(String[] args) {
		overriding obj=new overriding();
		System.out.println(obj.area_circle(2));
		
	}
}
