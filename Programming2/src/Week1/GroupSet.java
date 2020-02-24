package Week1;

public class GroupSet extends Component{
	private int gears;

	public GroupSet(String id, String name, int gears, double price) {
		super(id, name, price);
		this.gears = gears;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	@Override
	public String toString() {
		return getId() + ": " + getName() + " group set, " + gears + " gears, " + getPrice() + " euros";
	}
	
	
	

}
