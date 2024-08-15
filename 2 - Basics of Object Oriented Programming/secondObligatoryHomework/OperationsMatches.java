package secondObligatoryHomework;

public interface OperationsMatches {
	void addMatch(Match inputMatch);

	void removeMatch(Match inputMatch);

	int findMatch(String inputFirstTeamName, String inputSecondTeamName);

	int findMatch(String inputFirstTeamName, String inputSecondTeamName, Boolean printConsoleMessage);
}
