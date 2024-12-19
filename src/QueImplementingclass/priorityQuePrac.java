package QueImplementingclass;

import java.util.PriorityQueue;

public class priorityQuePrac {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		//pq.add(null);
		pq.add(10);
		pq.add(5);
		pq.add(5);
		pq.add(20);
		

		
		for(Object obj : pq) {
			System.out.println(obj);
		}
		
		Object ob=pq.peek();
		System.out.println(ob +"----");
		
		pq.poll();
		for(Object obj : pq) {
			System.out.println(obj);
		}

	}

}
