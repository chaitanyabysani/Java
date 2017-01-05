package javaCollectionsPackage;

import java.util.ArrayList;

public class Java_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("First");
		myList.add("Second");
		myList.add("Third");
		
		System.out.println(myList.get(1));
		System.out.println(myList.size());
		
		for(int i=0; i<myList.size(); i++)
		{
			System.out.println(myList.get(i));
		}
		
	}

}
