package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class hashsetexample {
	
	public void Hashset() 
	{
		HashSet<String> hash=new HashSet<String>();
		hash.add("One");
		hash.add("1");
		hash.add("Two");
		hash.add("2");
		System.out.println(hash);
		System.out.println(hash.contains("1"));
		Iterator iterator=hash.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}
	public void Linkedhashset() {
		LinkedHashSet linkedhash=new LinkedHashSet();
		//linkedhash.addAll(hash);
		linkedhash.add("10");
		System.out.println("*********************");
		System.out.println(linkedhash);
		
	}
	
	public void Treeset() {
		TreeSet treeset=new TreeSet();
		//treeset.add(null);
		treeset.add(1);
		treeset.add(5);
		//treeset.add("Start");
		treeset.add(7);
		treeset.add(2);
		treeset.add(9);
		treeset.add(6);
		treeset.add(4);
		System.out.println("*********************");
		System.out.println(treeset);
		System.out.println(treeset.first());
		System.out.println(treeset.last());
		System.out.println(treeset.headSet(4));//it will return lesser values which we mentioned in the headset method
		System.out.println(treeset.tailSet(5));//it will return greater values from which we mentioned in the tailset method
		System.out.println(treeset.subSet(2, 9));// it will return the values from the start value to end value::end value not inclueded
		System.out.println(treeset.comparator());
		System.out.println(treeset.higher(4));
		System.out.println(treeset.lower(4));
	}
	public void Hashmap() {

		HashMap<Integer,String> emphash=new HashMap<Integer, String>();
		emphash.put(1,"Firstvalue");
		emphash.put(2,"Secondvalue");
		emphash.put(4,"Fourthvalue");
		emphash.put(3,"Thirdvalue");
		System.out.println(emphash);
		
		HashMap<Integer,String> duphash=new HashMap<Integer, String>();
		duphash.putAll(emphash);
		System.out.println("Duplicated hashmap:"+duphash );
		
		duphash.remove(3);
		System.out.println("After remove hashmap:"+duphash );
		System.out.println("Entry set"+duphash.entrySet());

	}
	public void linkedhashmap() {
		LinkedHashMap<String,String> linkedmap=new LinkedHashMap<String, String>();
		linkedmap.put("hi", "set1");
		linkedmap.put("hi", "set33");//if duplicate key, value will be override
		linkedmap.put("hello","set2");
		
		System.out.println(linkedmap);
	
	}
	public void treemap() {
		TreeMap<Integer, String> tree=new TreeMap<Integer,String>();
		tree.put(5,"S1" );
		tree.put(5,"S2" );
		
	}

	public static void main(String[] args) {
		hashsetexample obj=new hashsetexample();
		//obj.Hashmap();
		obj.linkedhashmap();
		obj.treemap();
		
			
	}


}
