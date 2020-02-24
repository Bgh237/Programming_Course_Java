package Week1;

public class MotorVehicle implements Ownable {
	private String model;

	public MotorVehicle(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "MotorVehicle [model=" + model + "]";
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
