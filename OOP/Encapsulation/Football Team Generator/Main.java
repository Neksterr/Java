package OOP.Encapsulation.FootballTeamGenerator;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, Team> teams = new LinkedHashMap<>();
        try {
            while (!input.equals("END")) {
                String[] teamInput = input.split(";");
                String teamName = teamInput[1];
                switch (teamInput[0]) {
                    case "Team":

                        Team team = new Team(teamName);
                        teams.put(teamName, team);
                        break;
                    case "Add":
                        if (!teams.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.%n", teamName);

                        } else {

                            String playerName = teamInput[2];
                            int playerEndurance = Integer.parseInt(teamInput[3]);
                            int playerSprint = Integer.parseInt(teamInput[4]);
                            int playerDribble = Integer.parseInt(teamInput[5]);
                            int playerPassing = Integer.parseInt(teamInput[6]);
                            int playerShooting = Integer.parseInt(teamInput[7]);
                            Player player = new Player(playerName, playerEndurance, playerSprint, playerDribble, playerPassing, playerShooting);
                            teams.get(teamName).addPlayer(player);
                            break;
                        }
                    case "Remove":
                        String playerToRemove = teamInput[2];
                        if (!teams.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            teams.get(teamName).removePlayer(playerToRemove);
                        }
                        break;
                    case "Rating":
                        if (!teams.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            System.out.printf("%s - %d%n", teamName, Math.round(teams.get(teamName).getRating()));
                        }
                        break;


                }

                input = scan.nextLine();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
