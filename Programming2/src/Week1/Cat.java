package Week1;

public class Cat implements NoisyPet {
	
	@Override
	public String play() {
		return "Cat is playing with the ball of yarn.";
	}
	
	@Override
	public String makeSound() {
		return "Cat says meow!";
	}
}
