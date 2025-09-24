package chapter_12_cellections;

import java.util.ArrayDeque;

public class DequeArray {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.add(10);
		dq.add(20);
		dq.addFirst(30);
		dq.add(40);
		dq.addLast(50);
		dq.add(60);
		dq.remove(50);

		for(int i : dq) {
			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
	}

}
