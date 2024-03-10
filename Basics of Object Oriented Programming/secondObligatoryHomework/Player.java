package secondObligatoryHomework;

public class Player extends Person {
	private String teamName;

	public Player(String firstName, String lastName, String jmbg, String teamName) {
		super(firstName, lastName, jmbg);
		this.setTeamName(teamName);
	}

	public String getTeamName() {
		return this.teamName;
	}

	private void setTeamName(String teamName) {
		this.teamName = teamName;
	}
}