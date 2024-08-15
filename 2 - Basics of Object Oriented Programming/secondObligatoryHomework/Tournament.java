package secondObligatoryHomework;

public class Tournament {
	private double totalFund;
	private double[] priceList;

	public Tournament(int totalNumberOfTeams) {
		this.setPriceList(new double[totalNumberOfTeams]);
	}

	public void calculateFund(TeamList teamList) {
		System.out.println("Calculating fund in progres...");

		int numberOfTeams = teamList.getTeams().size();
		double moneyFromTeams = calculateMoneyFromTeams(numberOfTeams);
		double moneyFromPlayers = calculateMoneyFromPlayers(numberOfTeams, teamList);
		calculatePriceList(moneyFromTeams, moneyFromPlayers);
	}

	private double calculateMoneyFromTeams(int numberOfTeams) {
		return 500 * numberOfTeams;
	}

	private double calculateMoneyFromPlayers(int numberOfTeams, TeamList teamList) {
		double moneyFromPlayers = 0;
		for (int i = 0; i < numberOfTeams; i++) {
			moneyFromPlayers += 100 * teamList.getTeams().get(i).getNumberOfPlayers();
		}
		return moneyFromPlayers;
	}

	private void calculatePriceList(double moneyFromTeams, double moneyFromPlayers) {
		this.setTotalFund(moneyFromTeams + moneyFromPlayers);
		priceList[0] = this.getTotalFund() * 0.5;
		priceList[1] = this.getTotalFund() * 0.3;
		priceList[2] = this.getTotalFund() * 0.2;
	}

	public void printAwards(TeamList input) {
		System.out.printf("Total fund is %.2f Euros.%n %n", this.getTotalFund());
		System.out.printf("First place price gets %.2f Euros.%n", priceList[0]);
		System.out.printf("Second place price gets %.2f Euros.%n", priceList[1]);
		System.out.printf("Third place price gets %.2f Euros.%n", priceList[2]);
	}

	public double getTotalFund() {
		return this.totalFund;
	}

	private void setTotalFund(double totalFund) {
		this.totalFund = totalFund;
	}

	public double[] getPriceList() {
		return this.priceList;
	}

	public void setPriceList(double[] priceList) {
		this.priceList = priceList;
	}
}