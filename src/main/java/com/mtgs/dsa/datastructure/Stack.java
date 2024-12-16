package com.mtgs.dsa.datastructure;

public class Stack {

	int top = -1;
	int arr[];

	public Stack(int size) {
		this.arr = new int[size];
	}

	public int size() {
		return top + 1;
	}

	public void push(int item) {
		this.arr[++top] = item;
	}

	public int peek() {
		return this.arr[top];
	}

	public int pop() {
		return this.arr[top--];
	}

	public boolean isEmpty() {
		return this.top == -1;
	}

}
