package secondObligatoryHomework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerList implements OperationsPlayers, OperationsFiles {
	private ArrayList<Player> players;

	public PlayerList() {
		this.setPlayers(new ArrayList<>());
	}

	public void addPlayer(Player player) {
		this.getPlayers().add(player);
		System.out.printf("Player %s %s with JMBG %s from team %s added to the list of players.%n",
				player.getFirstName(), player.getLastName(), player.getJmbg(),
				player.getTeamName());
	}

	public void removePlayer(Player player) {
		String firstName = player.getFirstName();
		String lastName = player.getLastName();

		if (findPlayer(firstName, lastName, false) == -1) {
			System.out.printf("Error: The player %s %s you are trying to remove is not in the list of players!%n",
					firstName, lastName);
		} else {
			this.getPlayers().remove(player);
			System.out.printf("Player %s %s removed from list of players.%n", firstName, lastName);
		}
	}

	public int findPlayer(String firstName, String lastName) {
		return findPlayer(firstName, lastName, true);
	}

	public int findPlayer(String firstName, String lastName, Boolean printConsoleMessage) {
		for (int i = 0; i < this.getPlayers().size(); i++) {
			String firstNameFromList = this.getPlayers().get(i).getFirstName();
			String lastNameFromList = this.getPlayers().get(i).getLastName();
			if (firstNameFromList.equals(firstName) && lastNameFromList.equals(lastName)) {
				if (printConsoleMessage)
					System.out.printf("Player %s %s is in the list of players on position %d.%n", firstName, lastName,
							i + 1);
				return i;
			}
		}
		if (printConsoleMessage)
			System.out.printf("Player %s %s is not in the list of players.%n", firstName, lastName);
		return -1;
	}
	
	public void readFromFile(String fileName) {
		try {
	        File file = new File(fileName);
	        Scanner scanner = new Scanner(file);
	        
	        while(scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            String[] parts = line.split(",");
	            
	            if (parts.length == 4) {
	                String firstName = parts[0];
	                String lastName = parts[1];
	                String jmbg = parts[2];
	                String team = parts[3];
	                
	                Player player = new Player(firstName, lastName, jmbg, team);
	                players.add(player);
	            }
	        }
	        scanner.close();
	    } catch (IOException e) {
	        System.out.println(e.getMessage());
	    }
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
}