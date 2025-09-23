package chapter_11_cellections;

import java.util.*;

public class LinkedLists {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.addFirst(0);
		l1.addLast(50);
		
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		
		//l1.clear();		
		l1.addAll(l2);
		
		for(int i = 0;  i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		
		for(int i : l1) {
			System.out.println(i);
		}
		
		System.out.println(l1.contains(10));
		System.out.println(l1.indexOf(10));
	}

}
