package com.mtgs.dsa.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CircularQueueTest {

	CircularQueue queue = new CircularQueue();

//	@Test
//	public void testEnqueue() {
//		queue.enqueue(100);
//		assertEquals(1, queue.size());
//		assertEquals(100, queue.peek());
//	}
//
//	@Test
//	public void testEnqueue2() {
//		queue.enqueue(200);
//		assertEquals(1, queue.size());
//		assertEquals(200, queue.peek());
//	}
//
//	@Test
//	public void testMultipleEnqueue() {
//		queue.enqueue(100);
//		queue.enqueue(200);
//		assertEquals(2, queue.size());
//		assertEquals(100, queue.peek());
//	}
//
//	@Test
//	public void testSize() {
//		queue.enqueue(100);
//		queue.enqueue(200);
//		queue.enqueue(300);
//		assertEquals(3, queue.size());
//		assertEquals(100, queue.peek());
//	}
//
//	@Test
//	public void testDequeue() {
//		queue.enqueue(200);
//
//		int item = queue.dequeue();
//		assertEquals(200, item);
//	}
//
//	@Test
//	public void testDequeueTwo() {
//		queue.enqueue(100);
//		queue.enqueue(200);
//
//		int item = queue.dequeue();
//		assertEquals(100, item);
//	}

//	@Test
//	public void testQueueBoundary() {
//		queue = new CircularQueue();S
//		for (int i = 0; i < 10; i++) {
//			queue.enqueue(i);
//		}
//		assertEquals(10, queue.size());
//
//		for (int i = 0; i < 10; i++) {
//			int item = queue.dequeue();
//			assertEquals(i, item);
//		}
//	}

	@Test
	public void testCircularQueueBaseCase() {
		queue = new CircularQueue();
		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
		assertEquals(10, queue.size());
		for (int i = 0; i < 10; i++) {
			int item = queue.dequeue();
			assertEquals(i, item);
		}
		queue.enqueue(100);
		assertEquals(1, queue.size());
		//queue.dequeue();
		//assertEquals(0, queue.size());
		assertEquals(100, queue.dequeue());
	}

}
