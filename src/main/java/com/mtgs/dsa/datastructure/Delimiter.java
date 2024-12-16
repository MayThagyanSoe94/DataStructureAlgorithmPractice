package com.mtgs.dsa.datastructure;

import java.util.Stack;

public class Delimiter {

	public boolean isValid(String string) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == '[') {
				stack.push(ch);
			} else if (ch == ']') {
				stack.pop();

			}
		}
		return stack.isEmpty();
	}

}
