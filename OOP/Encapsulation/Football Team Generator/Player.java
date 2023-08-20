package OOP.Encapsulation.FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = statException("Endurance", endurance);
    }

    public int getSprint() {
        return sprint;
    }

    public void setSprint(int sprint) {
        this.sprint = statException("Sprint", sprint);
    }

    public int getDribble() {
        return dribble;
    }

    public void setDribble(int dribble) {
        this.dribble = statException("Dribble", dribble);
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = statException("Passing", passing);
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = statException("Shooting", shooting);
    }
    public double overallSkillLevel(){
        return (endurance + sprint + dribble + passing + shooting) / 5.0;
    }
    private int statException(String name, int stat){
        if(stat < 0 || stat > 100){
            throw new IllegalArgumentException(name + "should be between 0 and 100.");
        } else {
            return stat;
        }
    }
}
