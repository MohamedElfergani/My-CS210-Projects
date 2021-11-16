
public class FullTeam {

	public static void main(String[] args) {

		Team myTeam = new Team("Barcelona", "Real Madrid", "Juvintus");

		Person player1 = new Person("Mohamed Elfergani", "5151384784", "July 18, 1997", 23);
		Person player2 = new Person("Bodi Mustafa", "4648616819", "March 7, 2000", 7);
		Person player3 = new Person("Kristopher Stanley", "8844616874", "May 26, 1997", 54);
		Person player4 = new Person("Marcos Newman", "7688486453", "August 28, 1989", 76);
		Person player5 = new Person("Jody Ray", "4884845237", "November 19, 1997", 36);
		Person player6 = new Person("Conrad Walsh", "7985656897", "April 4, 1999", 36);

		myTeam.add(player1);
		myTeam.add(player2);
		myTeam.add(player3);
		myTeam.add(player4);
		myTeam.add(player5);
		myTeam.add(player6);

		myTeam.displayRoster(" ");
	}
}
