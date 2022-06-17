
package sesi_09.challenge1;

public class OnePiece {

	private int Id;
	private String firstName;
	private String lastName;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[").append(Id).append(":")
		.append(firstName).append(":")
		.append(lastName).append("]");
		
		return builder.toString();
	}
}
