package secondObligatoryHomework;

public class CompetitionFund {
	private double totalFund;
	private double firstPlacePrice;
	private double secondPlacePrice;
	private double thirdPlacePrice;

	public void calculateFund(ListOfTeams input) {
		System.out.println("Calculating fund in progres...");
		int numberOfTeams = input.getTeams().size();
		double moneyFromTeams = 500 * numberOfTeams;
		double moneyFromPlayers = 0;
		for (int i = 0; i < numberOfTeams; i++) {
			moneyFromPlayers += 100 * input.getTeams().get(i).getNumberOfPlayers();
		}
		this.setTotalFund(moneyFromTeams + moneyFromPlayers);
		this.setFirstPlacePrice(this.getTotalFund() * 0.5);
		this.setSecondPlacePrice(this.getTotalFund() * 0.3);
		this.setThirdPlacePrice(this.getTotalFund() * 0.2);
	}
	
	public void printAwards(ListOfTeams input) {
		System.out.printf("Total fund is %.2f Euros.%n %n", this.getTotalFund());
		System.out.printf("First place price is %.2f Euros.%n", this.getFirstPlacePrice());
		System.out.printf("Second place price is %.2f Euros.%n", this.getSecondPlacePrice());
		System.out.printf("Third place price is %.2f Euros.%n", this.getThirdPlacePrice());
	}

	public double getTotalFund() {
		return totalFund;
	}

	private void setTotalFund(double totalFund) {
		this.totalFund = totalFund;
	}

	public double getFirstPlacePrice() {
		return this.firstPlacePrice;
	}

	private void setFirstPlacePrice(double firstPlacePrice) {
		this.firstPlacePrice = firstPlacePrice;
	}

	public double getSecondPlacePrice() {
		return this.secondPlacePrice;
	}

	private void setSecondPlacePrice(double secondPlacePrice) {
		this.secondPlacePrice = secondPlacePrice;
	}

	public double getThirdPlacePrice() {
		return this.thirdPlacePrice;
	}

	private void setThirdPlacePrice(double thirdPlacePrice) {
		this.thirdPlacePrice = thirdPlacePrice;
	}
}