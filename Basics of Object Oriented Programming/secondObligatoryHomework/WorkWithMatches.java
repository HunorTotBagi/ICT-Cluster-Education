package secondObligatoryHomework;

public interface WorkWithMatches {
	void addMatch(Match inputMatch);

	void removeMatch(Match inputMatch);

	int findMatch(String inputFirstTeamName, String inputSecondTeamName);

	int findMatch(String inputFirstTeamName, String inputSecondTeamName, Boolean printConsoleMessage);
}
