package Week2;

import java.util.HashMap;
import java.util.Map;

public class Friend {
	private String nickname;
	private String name;
	private String birthdate;
	
	public Friend(String nickname, String name, String birthdate) {
		super();
		this.nickname = nickname;
		this.name = name;
		this.birthdate = birthdate;
	}
	public Map<String, Friend> friendMap = new HashMap<String, Friend>();
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return nickname + ": " + name + " born " + birthdate;
	}
	
	
}
