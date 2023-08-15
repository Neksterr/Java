package OOP.Encapsulation.FirstAndReserveTeam;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;
    Team(String name){
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addPlayer(Person person){
        if(person.getAge() < 40 ){
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }
    public List<Person> getFirstTeam(){
    return Collections.unmodifiableList(firstTeam);
    }
    public List<Person> getReserveTeam(){
    return  Collections.unmodifiableList(reserveTeam);
    }

    @Override
    public String toString() {
        return String.format("First team have %d players%nReserve team have %d pleyers", firstTeam.size(),reserveTeam.size());
    }
}
