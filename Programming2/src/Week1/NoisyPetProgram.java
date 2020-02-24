package Week1;

public class NoisyPetProgram {

	public static void main(String[] args) {
		NoisyPet[] pet1 = { new Cat(), new Dog(), new Parrot()};
		
		for (NoisyPet noisyPet : pet1) {
			System.out.println(noisyPet.makeSound());
		}
		
		System.out.println();
		
		for (NoisyPet noisyPet : pet1) {
			System.out.println(noisyPet.play());
		}

	}

}
