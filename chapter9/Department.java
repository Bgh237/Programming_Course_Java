package chapter9;

public class Department {
	private int deptNo;
	private String deptName;

	public Department(int deptNo, String deptName) {
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public int getNumber() {
		return deptNo;
	}

	public String getName() {
		return deptName;
	}

}
