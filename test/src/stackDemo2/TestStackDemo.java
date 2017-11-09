package stackDemo2;

import java.util.Stack;

public class TestStackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(5);
		stack.push(8);
		stack.push(3);
		stack.push(2);
		stack.push(0);
		stack.push(12);
		stack.push(88);
		SortStackByStack.sort(stack);
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}
	}

}
