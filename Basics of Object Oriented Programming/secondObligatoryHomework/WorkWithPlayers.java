package secondObligatoryHomework;

public interface WorkWithPlayers {
	void addPlayer(Player inputPlayer);

	void removePlayer(Player inputPlayer);

	int findPlayer(String firstName, String lastName);

	int findPlayer(String firstName, String lastName, Boolean printConsoleMessage);
}
