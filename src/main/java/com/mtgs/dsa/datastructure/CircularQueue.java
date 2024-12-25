package com.mtgs.dsa.datastructure;

public class CircularQueue extends Queue {

	public CircularQueue() {
		super();
	}

	public void enqueue(int input) {
		this.tail = this.tail % this.items.length;
		this.items[this.tail++] = input;
		System.out.println("tail enqueue >>> "+ tail);
	}

    public int dequeue() {
		this.head = this.head % this.items.length;
		int index = this.head++;
		System.out.println("head dequeue >>> "+ index);
		return this.items[index];
	}
    
	public int size() {
		System.out.println("size tail >>> "+ this.tail);
		System.out.println("size head >>> "+ this.head);
		return this.tail - this.head;
	}
}
