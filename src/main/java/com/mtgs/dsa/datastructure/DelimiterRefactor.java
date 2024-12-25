package com.mtgs.dsa.datastructure;

import java.util.ArrayList;
import java.util.Stack;

public class DelimiterRefactor {
	ArrayList<Character> startTags = new ArrayList<>();
	ArrayList<Character> endTags = new ArrayList<>();

	public DelimiterRefactor() {
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
			if (isStartTag(ch)) {
				stack.push(ch);
			} else if (isEndTag(ch)) {
				if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private boolean isMatchingPair(char startTag, char endTag) {
		return endTags.indexOf(endTag) == startTags.indexOf(startTag);
	}

	private boolean isEndTag(char ch) {
		return endTags.contains(ch);
	}

	private boolean isStartTag(char ch) {
		return startTags.contains(ch);
	}

}
