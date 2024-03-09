package secondObligatoryHomework;

public class Player {
	private String firstName, lastName, jmbg, teamName;

	public Player(String firstName, String lastName, String jmbg, String teamName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setJmbg(jmbg);
		this.setTeamName(teamName);
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJmbg() {
		return this.jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getTeamName() {
		return this.teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}
