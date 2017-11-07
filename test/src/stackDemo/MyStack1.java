package stackDemo;

import java.util.Stack;


public class MyStack1 {

	private Stack<Integer> stackData, stackMin;

	public MyStack1() {
		stackData = new Stack<Integer>();
		stackMin = new Stack<Integer>();
	}
	public void push(Integer i){
		if(this.stackMin.isEmpty()){
			this.stackMin.push(i);
		}else if (i <= this.getMIn()){
			this.stackMin.push(i);
		}
		this.stackData.push(i);
	}
	
	public Integer pop(){
		if(this.stackData.isEmpty()){
			throw new RuntimeException("you stack is empty");
		}
		int value = this.stackData.pop();
		if(value == this.getMIn()){
			this.stackMin.pop();
		}
		return value;
	}
	
	public Integer getMIn(){
		if(this.stackMin.isEmpty()){
			throw new RuntimeException("you stack is empty");
		}
		return this.stackMin.peek();
	}

}
