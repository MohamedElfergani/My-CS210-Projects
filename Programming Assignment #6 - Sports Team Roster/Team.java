public class Team {

	public static final int MAX_PEOPLE = 6;

	private Person[] player;
	private String coachName;
	private String conferenceName;
	private int numPlayer;

	public Team(String teamName, String coachName, String conferenceName) {
		player = new Person[MAX_PEOPLE];
		numPlayer = 0;
		this.coachName = coachName;
		this.conferenceName = conferenceName;
	}

	public void add(Person individual) {
		player[numPlayer] = individual;
		numPlayer++;
	}

	public void searchRoster(String searchName) {
		for (int i = 0; i < MAX_PEOPLE; i++) {
			if (player[i].getName().contains(searchName)) {
				System.out.println(player[i].getName());
				System.out.println(player[i].getbirthDate());
				System.out.println(player[i].getjerseyNumber());
			}
		}
	}

	public void showRoster() {
		for (int i = 0; i < MAX_PEOPLE; i++) {
			System.out.println(player[i].getName());
			System.out.println(player[i].getbirthDate());
			System.out.println(player[i].getphoneNumber());
		}
	}

	public void displayRoster(String teamName) {
		for (int i = 0; i < MAX_PEOPLE; i++) {
			System.out.println(player[i].getName());
			System.out.println(player[i].getbirthDate());
			System.out.println(player[i].getphoneNumber());
			System.out.println(player[i].getjerseyNumber());
		}
	}
}