package stackDemo1;

import java.util.LinkedList;
import java.util.Queue;

public class DogCatQueue {

	private Queue<PetEnterQueue> dogQ, catQ;
	private long count;
	
	public DogCatQueue(){
		this.dogQ = new LinkedList<PetEnterQueue>();
		this.catQ = new LinkedList<PetEnterQueue>();
		this.count = 0;
	}
	
	public void add(Pet pet){
		if("dog".equals(pet.getType())){
			this.dogQ.add(new PetEnterQueue(pet, this.count++));
		}else if ("cat".equals(pet.getType())){
			this.catQ.add(new PetEnterQueue(pet, this.count++));
		}else{
			throw new RuntimeException("err, not dog or cat");
		}
	}
	
	public Pet pollAll(){
		if(!dogQ.isEmpty() && !catQ.isEmpty()){
			if(dogQ.peek().getCount() > catQ.peek().getCount()){
				return catQ.poll().getPet();
			}else{
				return dogQ.poll().getPet();
			}
		}else if (!dogQ.isEmpty()){
			return dogQ.poll().getPet();
		}else if (!catQ.isEmpty()){
			return catQ.poll().getPet();
		}else{
			throw new RuntimeException("err, queue is empty");
		}
	}
	
	public Dog pollDog(){
		if(!dogQ.isEmpty()){
			return (Dog)dogQ.poll().getPet();
		}else{
			throw new RuntimeException("Dog Queue is empty");
		}
	}
	
	public Cat pollCat(){
		if(!catQ.isEmpty()){
			return (Cat)catQ.poll().getPet();
		}else{
			throw new RuntimeException("Dog Queue is empty");
		}
	}
	public boolean isEmpty(){
		return dogQ.isEmpty() && catQ.isEmpty();
	}
	
	public boolean isDogQueueEmpty(){
		return dogQ.isEmpty();
	}
	
	public boolean isCatQueueEmpty(){
		return catQ.isEmpty();
	}
}
