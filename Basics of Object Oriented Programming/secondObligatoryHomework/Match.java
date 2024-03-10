package secondObligatoryHomework;

public class Match {
	public enum Result {
		UNPLAYED, FIRST_WON, SECOND_WON, TIED
	}

	private String firstTeamName, secondTeamName;
	private Result result;

	public Match(String firstTeamName, String secondTeamName, Result result) {
		this.setFirstTeamName(firstTeamName);
		this.setSecondTeamName(secondTeamName);
		this.setResult(result);
	}

	public String getFirstTeamName() {
		return this.firstTeamName;
	}

	private void setFirstTeamName(String firstTeamName) {
		this.firstTeamName = firstTeamName;
	}

	public String getSecondTeamName() {
		return this.secondTeamName;
	}

	private void setSecondTeamName(String secondTeamName) {
		this.secondTeamName = secondTeamName;
	}

	public Result getResult() {
		return this.result;
	}

	private void setResult(Result result) {
		this.result = result;
	}
}