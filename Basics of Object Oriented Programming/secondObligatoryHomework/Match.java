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

	public void setFirstTeamName(String firstTeamName) {
		this.firstTeamName = firstTeamName;
	}

	public String getSecondTeamName() {
		return this.secondTeamName;
	}

	public void setSecondTeamName(String secondTeamName) {
		this.secondTeamName = secondTeamName;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
}