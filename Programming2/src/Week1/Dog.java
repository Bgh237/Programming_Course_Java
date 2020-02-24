package Week1;

public class Dog implements NoisyPet {
	
	@Override
	public String play() {
		return "Dog is fetching the ball.";
	}
	
	@Override
	public String makeSound() {
		return "Dog says woof, woof!";
	}
}
