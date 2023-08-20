package OOP.Encapsulation.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        players = new ArrayList<>();
    }

    public String getMame() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }



    public void addPlayer(Player player){
        this.players.add(player);
    }
    public void removePlayer(String playerName ){
        boolean isRemoved = players.removeIf(p -> p.getName().equals(playerName));
        if(!isRemoved){
            String exceptionalMessage = String.format("Player %s is not in %s team.",playerName,name);
            throw  new IllegalArgumentException(exceptionalMessage);
        }

    }
    public  double getRating(){
    return players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0);
    }
}
