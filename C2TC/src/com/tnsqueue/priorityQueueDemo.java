package com.tnsqueue;

import java.util.PriorityQueue;

public class priorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Core java");
		pq.add("React");
		pq.add("HTML");
		pq.add("Angular");
		System.out.println(pq);
		pq.remove("Angular");
		System.out.println("After Remove"+pq);
	}

}
