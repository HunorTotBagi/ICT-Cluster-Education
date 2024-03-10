package secondObligatoryHomework;

public class Team {
	private String name, originCity;
	private int numberOfPlayers, score;
	private double budget;

	public Team(String name, String originCity, int numberOfPlayers) {
		this.setName(name);
		this.setOriginCity(originCity);
		this.setNumberOfPlayers(numberOfPlayers);
	}

	public String getName() {
		return this.name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getOriginCity() {
		return this.originCity;
	}

	private void setOriginCity(String city) {
		this.originCity = city;
	}

	public int getNumberOfPlayers() {
		return this.numberOfPlayers;
	}

	private void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
}