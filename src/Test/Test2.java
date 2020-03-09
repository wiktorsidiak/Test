package Test;

import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {
        List<Person> people = List.of(
                Person.builder().name("Andrew").age(17).build(),
                Person.builder().name("Slawa").age(28).build(),
                Person.builder().name("Witalik").age(15).build(),
                Person.builder().name("Oleksei").age(31).build()
        );
        List<Person> result = whoCanBuyAlcohol(people);
        System.out.println(result);
    }

    private static List<Person> whoCanBuyAlcohol(List<Person> people) {
        return  people.stream().filter(p -> p.getAge() > 18).collect(Collectors.toList());

    }


}

class Person {

    private String name;
    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{

        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(name, age);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}