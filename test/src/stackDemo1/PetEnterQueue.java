package stackDemo1;

public class PetEnterQueue {
	private Pet pet;
	private Long count;

	public PetEnterQueue(Pet pet, Long count) {
		this.pet = pet;
		this.count = count;
	}
	
	public Pet getPet(){
		return this.pet;
	}
	
	public Long getCount(){
		return this.count;
	}
	
	public String getEnterPetType(){
		return this.pet.getType();
	}

}
