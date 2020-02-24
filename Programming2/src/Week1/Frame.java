package Week1;

public class Frame extends Component{
	private  String material;

	public Frame(String id, String name, String material, double price) {
		super(id, name, price);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return getId() + ": " + getName() + " " + material + " frame, " + getPrice() + " euros";
	}
	
	

}
