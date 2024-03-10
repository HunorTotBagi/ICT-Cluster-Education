package secondObligatoryHomework;

public class Tournament {
	private double totalFund;
	private double[] priceList = new double[4];

	public void calculateFund(TeamList input) {
		System.out.println("Calculating fund in progres...");
		int numberOfTeams = input.getTeams().size();
		double moneyFromTeams = 500 * numberOfTeams;
		double moneyFromPlayers = 0;
		for (int i = 0; i < numberOfTeams; i++) {
			moneyFromPlayers += 100 * input.getTeams().get(i).getNumberOfPlayers();
		}
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
		return totalFund;
	}

	private void setTotalFund(double totalFund) {
		this.totalFund = totalFund;
	}
	
	public double[] getPriceList() {
		return priceList;
	}

	public void setPriceList(double[] priceList) {
		this.priceList = priceList;
	}
}