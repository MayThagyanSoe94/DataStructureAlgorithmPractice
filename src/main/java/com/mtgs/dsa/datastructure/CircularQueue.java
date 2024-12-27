package com.mtgs.dsa.datastructure;

public class CircularQueue extends Queue {

	int size = 0 ;
	public CircularQueue() {
		super();
	}

	public void enqueue(int input) {
		if(isFull()){
			throw new RuntimeException("Queue is Full");
		}else {
			this.tail = this.tail % this.items.length;
			this.items[this.tail++] = input;
			this.size++;
		}
	}

    public int dequeue() {
		if(isEmpty()){
			throw new RuntimeException("Queue is Empty");
		}
		else {
			this.head = this.head % this.items.length;
			this.size --;
			return this.items[this.head++];
		}
    }

	public int size() {
		return size;
	}

	private boolean isEmpty() {
		return this.size == 0;
	}

	private boolean isFull(){
		return this.size == this.items.length;
	}

}
