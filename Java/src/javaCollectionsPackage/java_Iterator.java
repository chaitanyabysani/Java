package javaCollectionsPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class java_Iterator {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Iterator<Integer> iterate = set.iterator();
		while(iterate.hasNext()){
			System.out.println(iterate.next());
		}

	}

}
