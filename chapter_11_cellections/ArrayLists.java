package chapter_11_cellections;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>(5);
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(0, 50);
		l1.add(0, 0);
		
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		
		//l1.clear();		
		l1.addAll(0, l2);
		
		for(int i = 0;  i<l1.size(); i++) {
			
			//System.out.println(l1[i]); cannot able to do bcz its not array
			System.out.println(l1.get(i));
		}
		
		for(int i : l1) {
			System.out.println(i);
		}
		
		System.out.println(l1.contains(10));
		System.out.println(l1.indexOf(10));
	}

	private static void forEach() {
		// TODO Auto-generated method stub
		
	}

}
