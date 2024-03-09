package secondObligatoryHomework;

public class Team {
	private String name, originCity;
	private int numberOfPlayers;

	public Team(String name, String originCity, int numberOfPlayers) {
		this.setName(name);
		this.setOriginCity(originCity);
		this.setNumberOfPlayers(numberOfPlayers);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginCity() {
		return this.originCity;
	}

	public void setOriginCity(String city) {
		this.originCity = city;
	}

	public int getNumberOfPlayers() {
		return this.numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
}
