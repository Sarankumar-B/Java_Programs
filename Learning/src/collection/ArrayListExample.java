package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

//	ArrayListExample()
//	{
//		
//		System.out.println("Non parameterized");
//	}
//	
	ArrayListExample(int x)
	{
		
		System.out.println("parameterized");
	}
	
	public static void main(String[] args) {
		
		List CarCompany =new ArrayList();
		CarCompany.add("Aadi");
		CarCompany.add("BMW");
		CarCompany.add(1,"Suzuhi");
//		ArrayListExample x1=new ArrayListExample();		
	System.out.println(CarCompany.get(1));
	 System.out.println(CarCompany.contains("BMW"));
//	 for (Object object : CarCompany) {
//		System.out.println(object);
//	}
	 ListIterator iterator =CarCompany.listIterator();
	while (iterator.hasNext()) {
	System.out.println(iterator.previous());
	
	}
	

	}


}
