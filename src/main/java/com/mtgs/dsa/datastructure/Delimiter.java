package com.mtgs.dsa.datastructure;

import java.util.ArrayList;
import java.util.Stack;

public class Delimiter {
	ArrayList<Character> startTags = new ArrayList<>();
	ArrayList<Character> endTags = new ArrayList<>();

	public Delimiter() {
		startTags.add('[');
		endTags.add(']');

		startTags.add('{');
		endTags.add('}');

		startTags.add('(');
		endTags.add(')');
	}

	public boolean isValid(String string) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (isCharStartTag(ch)) {
				stack.push(ch);
			} else if (isCharEndTag(ch)) {
				if (stack.isEmpty()) {
					return false;
				}
				 if(!isContainBothStartAndEndTag(stack, ch)) {
					 return false;
				 }
			}
		}
		return stack.isEmpty();
	}

	private boolean isContainBothStartAndEndTag(Stack<Character> stack, char ch) {
		Character topElement = stack.pop();
		int endTagIndex = endTags.indexOf(ch);
		int startTagIndex = startTags.indexOf(topElement);
		if (endTagIndex != startTagIndex) {
			return false;
		}
		return true;
	}

	private boolean isCharEndTag(char ch) {
		return endTags.contains(ch);
	}

	private boolean isCharStartTag(char ch) {
		return startTags.contains(ch);
	}

}
