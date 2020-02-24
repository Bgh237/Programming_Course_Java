package Week1;

public class Bicycle extends MotorVehicle{
	private double value;

	public Bicycle(String model, double value) {
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
		return "Bicycle: " + getModel() + "(value " + value + "euros)";
	}
	
}
