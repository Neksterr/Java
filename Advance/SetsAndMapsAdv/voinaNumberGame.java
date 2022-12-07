package setsAndMapsAdv;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class voinaNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> firstPlayer = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondPlayer = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        int rounds = 0 ;
        
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            rounds++;
            if(rounds == 50){
                break;
            }

            Iterator<Integer> firstIter = firstPlayer.iterator();
            int firstCard = firstIter.next();
            firstIter.remove();

            Iterator<Integer> secondIter = secondPlayer.iterator();
            int secondCard = secondIter.next();
            secondIter.remove();

            if(firstCard > secondCard){
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            } else if(secondCard > firstCard){
                secondPlayer.add(firstCard);
                secondPlayer.add(secondCard);
            }

        }
        if(firstPlayer.size() > secondPlayer.size()){
            System.out.println("First player win!");

        } else if(firstPlayer.size() < secondPlayer.size()){
            System.out.println("Second player win!");

        } else {
            System.out.println("Draw!");
        }
    }
}
