package stackDemo;

public class TestStack {

	public static void main(String[] args) {
//		MyStack1 m = new MyStack1();
//		m.push(1);
//		m.push(5);
//		m.push(8);
//		m.push(2);
//		System.out.println(m.getMIn());
//		System.out.println(m.pop());
//		MyStack1 m1 = new  MyStack1();
		MyStack2 m2 = new MyStack2();
		m2.push(8);
		m2.push(3);
		m2.push(1);
		m2.push(8);
		m2.push(3);
		System.out.println(m2.getMin());
		System.out.println(m2.pop());

	}

}
