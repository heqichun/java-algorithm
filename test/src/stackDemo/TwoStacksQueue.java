package stackDemo;

import java.util.Stack;

public class TwoStacksQueue {
	private Stack<Integer> stackPush, stackPop;

	public TwoStacksQueue() {
		stackPush = new Stack<Integer>();
		stackPop = new Stack<Integer>();
	}

	public void add(Integer i) {
		this.stackPush.push(i);
	}

	public Integer poll() {
		if (stackPop.empty() && stackPush.empty()) {
			throw new RuntimeException("Queue is empty");
		} else if (stackPop.empty()) {
			while (!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}

		return this.stackPop.pop();
	}

	public Integer peek() {
		if (stackPop.empty() && stackPush.empty()) {
			throw new RuntimeException("Queue is empty");
		} else if (stackPop.empty()) {
			while (!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}

		return this.stackPop.peek();
	}

}
