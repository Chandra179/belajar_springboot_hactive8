package sesi_09;

public class User {
	
	int Id;
	private String Name;
	private String Gender;
	private String Role;
	
	public User() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User{").append("Id=").append(Id)
		.append(", Name=").append(Name)
		.append(", gender=").append(Gender)
		.append(", Role=").append(Role).append("}");
		
		return builder.toString();
	}
}
