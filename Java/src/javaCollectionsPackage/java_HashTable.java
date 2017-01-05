package javaCollectionsPackage;

import java.util.Hashtable;

public class java_HashTable {

	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("name", "chaitanya");
		ht.put("location", "Hyderabad");
		ht.put("course", "selenium");
		
		System.out.println(ht.get("location"));

	}

}
