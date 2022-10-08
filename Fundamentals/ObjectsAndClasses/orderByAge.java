package ObjectsAndClasses;

import java.util.*;

public class orderByAge {
    static class Person {
        String name;
        String id;
        int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public String getId() {
            return this.id;
        }

        public int getAge() {
            return this.age;
        }

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input = scan.nextLine();
        List<Person> listOfPeople = new ArrayList<>();
        while (!input.equals("End")) {
            String[] data = input.split(" ");
            String name = data[0];
            String id = data[1];
            int age = Integer.parseInt(data[2]);
            Person person = new Person(name,id,age);
            listOfPeople.add(person);
            input = scan.nextLine();
        }
        listOfPeople.sort(Comparator.comparing(Person::getAge));
        for (Person person : listOfPeople) {
            System.out.println(person.toString());
        }
    }
}
