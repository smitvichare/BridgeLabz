package setCollections;

import java.util.HashSet;
import java.util.Objects;

class Person {
    String name;
    int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class CustomObject {
    public static void main(String[] args) {
        
        HashSet<Person> personSet = new HashSet<>();

        
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));

        
        Person personToCheck = new Person("Alice", 30);
        if (personSet.contains(personToCheck)) {
            System.out.println(personToCheck + " is in the set.");
        } else {
            System.out.println(personToCheck + " is not in the set.");
        }
    }
}
