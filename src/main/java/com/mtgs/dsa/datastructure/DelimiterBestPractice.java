package com.mtgs.dsa.datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DelimiterBestPractice {

	private final Map<Character, Character> delimeterPair;

	public DelimiterBestPractice() {
		delimeterPair = new HashMap<>();
		delimeterPair.put('{', '}');
		delimeterPair.put('(', ')');
		delimeterPair.put('[', ']');
	}

	public boolean isValid(String input) {
		Stack<Character> stack = new Stack<>();

		for (char ch : input.toCharArray()) {
			if (isOpeningDelimiter(ch)) {
				stack.push(ch);
			} else if (isClosingDelimiter(ch)) {
				if (stack.isEmpty() || !isMatch(stack.pop(), ch)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private boolean isMatch(char opening, char closing) {
		return delimeterPair.get(opening) == closing;
	}

	private boolean isClosingDelimiter(char ch) {
		return delimeterPair.containsValue(ch);
	}

	private boolean isOpeningDelimiter(char ch) {
		return delimeterPair.containsKey(ch);
	}

}
