public class Person {
	private String name;
	private String phoneNumber;
	private String birthDate;
	private int jerseyNumber;

	public Person(String name, String phoneNumber, String birthDate, int jerseyNumber)

	{

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
		this.jerseyNumber = jerseyNumber;
	}

	public String getName() {
		return this.name;
	}

	public String getphoneNumber() {
		return this.phoneNumber;
	}

	public String getbirthDate() {
		return this.birthDate;
	}

	public void setjerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public int getjerseyNumber() {
		return this.jerseyNumber;

	}
}