package com.mtgs.dsa.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircularQueueTest {

	CircularQueue queue = new CircularQueue();

	@Test
	public void testEnqueue() {
		queue.enqueue(100);
		assertEquals(1, queue.size());
		assertEquals(100, queue.peek());
	}

	@Test
	public void testEnqueue2() {
		queue.enqueue(200);
		assertEquals(1, queue.size());
		assertEquals(200, queue.peek());
	}

	@Test
	public void testMultipleEnqueue() {
		queue.enqueue(100);
		queue.enqueue(200);
		assertEquals(2, queue.size());
		assertEquals(100, queue.peek());
	}

	@Test
	public void testSize() {
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		assertEquals(3, queue.size());
		assertEquals(100, queue.peek());
	}

	@Test
	public void testDequeue() {
		queue.enqueue(200);

		int item = queue.dequeue();
		assertEquals(200, item);
	}

	@Test
	public void testDequeueTwo() {
		queue.enqueue(100);
		queue.enqueue(200);

		int item = queue.dequeue();
		assertEquals(100, item);
	}

	@Test
	public void testQueueBoundary() {
		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
		assertEquals(10, queue.size());

		for (int i = 0; i < 10; i++) {
			int item = queue.dequeue();
			assertEquals(i, item);
		}
	}

	@Test
	public void testCircularQueueBaseCase() {
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

		queue.enqueue(200);
		assertEquals(100, queue.dequeue());
		assertEquals(1, queue.size());
	}

	@Test
	public void testDequeueWhenQueueIsEmpty(){
		RuntimeException exception = assertThrows(RuntimeException.class, ()->{
			queue.dequeue();
		});
		assertEquals("Queue is Empty" , exception.getMessage());
	}

	@Test
	public void testEnqueueWhenQueueIsFull(){
		for(int i = 0;i<10;i++){
			queue.enqueue(i);
		}
		RuntimeException exception = assertThrows(RuntimeException.class, ()->{
			queue.enqueue(100);
		});
		assertEquals("Queue is Full" , exception.getMessage());
	}

}
