package secondObligatoryHomework;

public class UnitTestsPlayer {

	public static void main(String[] args) {
		Player lukaJovanovic = new Player("Luka", "Jovanović", "0405992750001", "Crvena Zvezda");
		Player markoPetrovic = new Player("Marko", "Petrović", "1104992700003", "Partizan");
		Player anaNikolic = new Player("Ana", "Nikolić", "2308992750002", "Vojvodina");

		PlayerList players = new PlayerList();

		players.addPlayer(lukaJovanovic);
		players.addPlayer(markoPetrovic);

		System.out.println();
		players.findPlayer("Luka", "Jovanović");
		players.findPlayer("Marko", "Nikloić");

		System.out.println();
		players.removePlayer(markoPetrovic);
		players.removePlayer(anaNikolic);
	}
}