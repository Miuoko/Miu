package entity;

public class Person {
	String UserNO;
	String UserName;
	String PhoneNumber;
	public String getUserNO() {
		return UserNO;
	}
	public void setUserNO(String userNO) {
		UserNO = userNO;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Person [UserNO=" + UserNO + ", UserName=" + UserName + ", PhoneNumber=" + PhoneNumber + "]";
	}
	
	
}
