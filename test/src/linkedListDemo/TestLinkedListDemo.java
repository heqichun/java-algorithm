package linkedListDemo;

public class TestLinkedListDemo {

	public static void main(String[] args) {
		int[] arr = {4,3,5,4,3,3,6,7};
		int[] result = CreateMaxList.getMaxWindow(arr, 3);
		for(int i : result){
			System.out.print(i);
		}
	}

}
