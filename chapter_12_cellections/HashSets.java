package chapter_12_cellections;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSets {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>(6, 0.5f);	
		hs.add(1);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(2);
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		System.out.println();
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(2);
		
		
		System.out.println(ts);
	}

}
