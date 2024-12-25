package com.mtgs.dsa.datastructure;

public class Queue {

	int items[];
	int head = 0;
	int tail = 0;

	public Queue() {
		this.items = new int[10];
	}

	public int size() {
		return this.tail - this.head;
	}

	public void enqueue(int input) {
		if (this.tail < this.items.length) {
			this.items[this.tail++] = input;
		} else {
			throw new RuntimeException("Queue is full");
		}

	}

	public int peek() {
		return this.items[this.head];
	}

	public int dequeue() {
		if (this.head < this.items.length && this.head < this.tail) {
			return this.items[this.head++];
		} else {
			throw new RuntimeException("Queue is empty");
		}
	}

}
