package stackDemo1;


public class TestDogCatQueue {

	public static void main(String[] args) {
		DogCatQueue queue = new DogCatQueue();
		queue.add(new Cat());
		queue.add(new Dog());
		System.out.println(queue.isEmpty());
		System.out.println(queue.pollAll());
	}

}
