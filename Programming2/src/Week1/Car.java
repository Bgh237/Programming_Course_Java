package Week1;

public class Car extends MotorVehicle {
	private double value;

	public Car(String model, double value) {
		super(model);
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Car: " + getModel() + " (value " + value + " euros)";
	}
	
}
